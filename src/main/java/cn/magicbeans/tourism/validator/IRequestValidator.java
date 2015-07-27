package cn.magicbeans.tourism.validator;

import cn.magicbeans.tourism.model.IRequest;
import cn.magicbeans.tourism.model.impl.Response;

public interface IRequestValidator {
	
	Response validate (IRequest request);

}
