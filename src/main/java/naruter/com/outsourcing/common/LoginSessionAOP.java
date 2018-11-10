package naruter.com.outsourcing.common;
/*package re.my.proj.aop;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Aspect
public class LoginSessionAOP {
	// login session 확인
	@Before("execution(* re.my.proj.controller.*.*(..))")
	public Object beforeLog(JoinPoint jp) throws IOException {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpServletResponse res = attr.getResponse();
		// log.debug(attr.getRequest().getSession(true).toString()); // true == allow
		// create
		// 로그인을 체크
		if (attr.getRequest() != null) {
			String strurl = attr.getRequest().getRequestURL().toString();
			// 로그인 제외
			if (strurl.indexOf("signin") == -1) {
				// 세션ch
				HttpSession session = attr.getRequest().getSession();
				String id = (String) session.getAttribute("id");
				if (id == null || "".equals(id)) {
					//res.sendRedirect("/remyp/site/all/home");
					res.sendError(200);
					//res.sendError(500);
				}
			}
		}
		return jp.getArgs()[0];
	}
	// db err rollback @AfterThrowing
}
*/