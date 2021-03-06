package naruter.com.outsourcing.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import naruter.com.outsourcing.service.ClientAnFreeService;
import naruter.com.outsourcing.vo.AdditionalFreeInfo;

@Slf4j
@Controller
public class ClientAnFreeController {

	@Autowired
	private ClientAnFreeService cfs;
	
	@ResponseBody
	@RequestMapping(value="/cfregister", method=RequestMethod.POST) //등록
	public Integer cfInsert(@RequestBody Map<String, Object> m) throws IllegalAccessException, InvocationTargetException {
		return cfs.cfInsert(m);
	}
	
	@ResponseBody
	@RequestMapping(value="/cfregister", method=RequestMethod.PUT) //수정
	public Integer cfUpdate(@RequestBody Map<String, Object> m) throws IllegalAccessException, InvocationTargetException {
		return cfs.cfUpdate(m);
	}
	
	@ResponseBody
	@RequestMapping(value="/cfregister/{memberNum}", method=RequestMethod.GET) //조회
	public Object cfGet(@PathVariable Integer memberNum) throws IllegalAccessException, InvocationTargetException {
		return cfs.cfGet(memberNum);
	}
	
	@ResponseBody
	@RequestMapping(value="/cfregister", method=RequestMethod.DELETE) //조회
	public Integer additionalDel(@RequestBody AdditionalFreeInfo addinfo) throws IllegalAccessException, InvocationTargetException {
		return cfs.additionalDel(addinfo);
	}
}
