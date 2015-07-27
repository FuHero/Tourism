package cn.magicbeans.tourism.util;

import java.util.Map;

import cn.magicbeans.tourism.model.impl.Request;

public class Util {
	
    private static final String METHOD_KEY = "method";
    private static final String ACCESSTOKEN_KEY = "access_token";
    private static final String APPKEY_KEY = "app_key";
    private static final String VERSION_KEY = "v";
    private static final String TIMESTAMP_KEY = "timestamp";
    private static final String SIGN_KEY = "sign";
    private static final String FORMAT_KEY = "format";
	
    public static Request createRequestFromMap(Map<String, String> map)
    {
        Request ret = new Request();
        ret.setMethod((String)map.get(METHOD_KEY));
        ret.setAccessToken((String)map.get(ACCESSTOKEN_KEY));
        ret.setAppKey((String)map.get(APPKEY_KEY));
        ret.setVersion((String)map.get(VERSION_KEY));
        ret.setTimestamp((String)map.get(TIMESTAMP_KEY));
        ret.setSign((String)map.get(SIGN_KEY));
        ret.setFormat((String)map.get(FORMAT_KEY));
        ret.setParams(map);
        return ret;
    }
    
}
