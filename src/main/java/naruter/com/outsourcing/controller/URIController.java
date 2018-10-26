package naruter.com.outsourcing.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class URIController {

	@RequestMapping(value="/uri/**")
	   public String goPage(HttpServletRequest hreq) {
	      String rootPath = hreq.getContextPath();
	      String path = hreq.getRequestURI();
	      log.info(path);
	      log.info(rootPath);
	      return path.replace(rootPath + "/uri/","");
	   }
}
