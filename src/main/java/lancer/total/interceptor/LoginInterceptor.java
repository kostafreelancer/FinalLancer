package lancer.total.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	private void saveDest(HttpServletRequest req){
		String uri = req.getRequestURI();
		String query = req.getQueryString();
		if(query==null||query.equals("null")){
			query="";
		}else{
			query="?"+query;
		}
		if(req.getMethod().equals("GET")){
			logger.info("dest: "+(uri+query));
			System.out.println("dest: "+(uri+query));
			req.getSession().setAttribute("dest", uri+query);
		}
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session.getAttribute("login") == null){
			logger.info("clear login data before");
			System.out.println("clear login data before");
			saveDest(request); 
			response.sendRedirect("/user/login");
			return false;
		}
		return true;
	}
	
}
