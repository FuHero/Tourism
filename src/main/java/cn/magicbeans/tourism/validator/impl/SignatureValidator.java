package cn.magicbeans.tourism.validator.impl;

import cn.magicbeans.tourism.model.IRequest;
import cn.magicbeans.tourism.model.impl.Response;
import cn.magicbeans.tourism.validator.IRequestValidator;

public class SignatureValidator implements IRequestValidator {
	
	public static final String SIGN_TYPE_RSA="rsa";
	public static final String SIGN_TYPE_MD5="md5";
	public static final String SIGN_TYPE_AES="aes";

	@Override
	public Response validate(IRequest request) {
		return null;
	}

}
