package cn.magicbeans.tourism;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;

public class PrimaryDispatcherServlet extends DispatcherServlet {
	
	private static final long serialVersionUID = 5282108417500057651L;
	
	private String encoding;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		encoding = config.getInitParameter(encoding);
		super.init(config);
	}
	
	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding(encoding);
		super.doService(request, response);
	}
}
