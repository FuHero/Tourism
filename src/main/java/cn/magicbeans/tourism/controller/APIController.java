package cn.magicbeans.tourism.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import cn.magicbeans.tourism.model.IRequest;
import cn.magicbeans.tourism.model.impl.Response;
import cn.magicbeans.tourism.parser.IRequestParser;

@Controller
@RequestMapping(value="/api", produces = { "application/json;charset=UTF-8" })
public class APIController {
	
	@Autowired
	private IRequestParser requestParser;
	
	@RequestMapping(value="/user")
	public @ResponseBody String userOperate (WebRequest web, HttpServletResponse res) {
		
		IRequest request = null;
		request = requestParser.parse(web);
		Response response = processRequest(request);
		return "";
	}
	
	protected Response processRequest (IRequest request) {
		Response response = new Response(Response.STATUS_FAILED_PARAMETERCHECK);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response;
	}

}
