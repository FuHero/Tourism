package cn.magicbeans.tourism.validator.impl;

import cn.magicbeans.tourism.model.IRequest;
import cn.magicbeans.tourism.model.impl.Response;
import cn.magicbeans.tourism.validator.IRequestValidator;

public class EmptyValidator implements IRequestValidator {
	
	@Override
	public Response validate (IRequest request) {
		// TODO
		return new Response(Response.STATUS_OK);
	}
}
