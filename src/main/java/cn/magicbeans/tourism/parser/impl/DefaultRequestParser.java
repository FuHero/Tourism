package cn.magicbeans.tourism.parser.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.WebRequest;

import cn.magicbeans.tourism.dao.IAppDefDAO;
import cn.magicbeans.tourism.model.IRequest;
import cn.magicbeans.tourism.model.impl.AppDef;
import cn.magicbeans.tourism.model.impl.Request;
import cn.magicbeans.tourism.parser.IRequestParser;
import cn.magicbeans.tourism.util.Util;

public class DefaultRequestParser implements IRequestParser {
	
	@Autowired
	private IAppDefDAO appDefDAO;
	
	private AtomicLong seq = new AtomicLong();
	
	private Map<String, AppDef> simpleCache = new HashMap<String, AppDef>(0);

	@Override
	public IRequest parse(WebRequest web) {
		Map<String, String> map = new HashMap<String, String>(0);
		Iterator<String> iterator = web.getParameterNames();
		while (iterator.hasNext()) {
			String key = iterator.next();
			map.put(key, web.getParameter(key));
		}
		Request ret = Util.createRequestFromMap(map);
		
		ret.setAppDef(getAppDef(ret.getAppKey()));
		ret.setRequestId(seq.incrementAndGet());
		return null;
	}
	
	protected AppDef getAppDef(String key){
		if(StringUtils.isEmpty(key)) {
			return null;
		}
		if(simpleCache.containsKey(key)) {
			return simpleCache.get(key);
		}
		AppDef ret = appDefDAO.getById(key);
		if(ret != null) {
			simpleCache.put(key, ret);
		}
		return ret;
	}

}
