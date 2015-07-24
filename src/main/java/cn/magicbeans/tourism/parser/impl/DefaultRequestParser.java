package cn.magicbeans.tourism.parser.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.web.context.request.WebRequest;

import cn.magicbeans.tourism.model.IRequest;
import cn.magicbeans.tourism.parser.IRequestParser;

public class DefaultRequestParser implements IRequestParser {

	@Override
	public IRequest parse(WebRequest web) {
		Map<String, String> map = new HashMap<String, String>(0);
		Iterator<String> iterator = web.getParameterNames();
		while (iterator.hasNext()) {
			String key = iterator.next();
			map.put(key, web.getParameter(key));
		}
		return null;
	}

}
