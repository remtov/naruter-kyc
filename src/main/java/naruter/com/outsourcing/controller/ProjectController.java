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
import org.springframework.web.multipart.MultipartHttpServletRequest;

import lombok.extern.slf4j.Slf4j;
import naruter.com.outsourcing.service.ProjectService;
import naruter.com.outsourcing.vo.Project;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService pService;
	
	@ResponseBody
	@RequestMapping(value="/project", method=RequestMethod.GET) //조회o
	public List<Project> selectProjectList(@ModelAttribute Project pr){
		return pService.selectProjectList(pr);
	}
	
	@ResponseBody
	@RequestMapping(value="/project/{pjnum}", method=RequestMethod.GET) //조회o
	public Project selectProject(@PathVariable int pjnum){
		return pService.selectProject(pjnum);
	}
	
	@ResponseBody
	@RequestMapping(value="/project", method=RequestMethod.POST) //입력o
	public int insertProject(@RequestBody Project pr) {
		return pService.insertProject(pr);
	}
	
	@ResponseBody
	@RequestMapping(value="/project/{pjnum}", method=RequestMethod.PUT) //수정x
	public int updateProject(@ModelAttribute Project pr,@PathVariable int pjnum) {
		pr.setPjnum(pjnum);
		return pService.updateProject(pr);
	}
	
	@ResponseBody
	@RequestMapping(value="/project/{pjnum}", method=RequestMethod.DELETE) //삭제o
	public int deleteProject(@PathVariable int pjnum) {
		return pService.deleteProject(pjnum);
	}
}
