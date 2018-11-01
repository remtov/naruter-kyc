
package naruter.com.outsourcing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import naruter.com.outsourcing.service.ClientService;
import naruter.com.outsourcing.vo.ClientInfo;

@Controller
public class ClientController {
	@Autowired
	private ClientService cs;
	
	@RequestMapping(value="/membernum",method=RequestMethod.GET)
	public @ResponseBody Integer getmembernum() {
		return cs.getMembernum();
	}
	@RequestMapping(value="/clientinfo",method=RequestMethod.GET)
	public @ResponseBody List<ClientInfo> getClientInfoList(@ModelAttribute ClientInfo ci){
		return cs.getClientInfoList(ci);
	}
	@RequestMapping(value="/clientinfo",method=RequestMethod.POST)
	@ResponseBody
	public Integer insertClientInfo(@RequestBody ClientInfo ci) {
		return cs.insertClientInfo(ci);
	}
	@RequestMapping(value="/clientinfo/{membernum}",method=RequestMethod.PUT)
	@ResponseBody
	public Integer updateClientInfo(@RequestBody ClientInfo ci,@PathVariable Integer membernum) {
		ci.setMembernum(membernum);
		return cs.updateClientInfo(ci);
	}
	@RequestMapping(value="/clientinfo/{membernum}",method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteClientInfo(@PathVariable int membernum) {
		return cs.deleteClientInfo(membernum)+"";
	}
}
