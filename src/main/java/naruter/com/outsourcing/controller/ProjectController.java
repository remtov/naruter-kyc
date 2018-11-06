package naruter.com.outsourcing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import naruter.com.outsourcing.service.ProjectService;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService pService;
	
	
}
