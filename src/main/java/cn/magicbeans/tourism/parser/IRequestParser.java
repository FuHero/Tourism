package cn.magicbeans.tourism.parser;

import org.springframework.web.context.request.WebRequest;

import cn.magicbeans.tourism.model.IRequest;

public interface IRequestParser {
	
	IRequest parse (WebRequest web);

}
