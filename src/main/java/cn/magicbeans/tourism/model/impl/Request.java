package cn.magicbeans.tourism.model.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import cn.magicbeans.tourism.model.IRequest;
import cn.magicbeans.tourism.util.DateUtil;

public class Request implements Serializable, IRequest {
	
	private static final long serialVersionUID = -5167351548741221149L;
	
	private String method;
    private String accessToken;
    private AppDef appDef;
    private String timestamp;
    private String sign;
    private String appKey;
    private String format;
    private String version;
    private long requestId;
    private Map<String, String> params;
    
    public Request()
    {
        format = "json";
        params = new HashMap<String, String>(0);
    }
    
	public void setMethod(String method) {
		this.method = method;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
	public void setAppDef(AppDef appDef)
    {
        this.appDef = appDef;
    }

	
	@Override
	public String getMethod() {
		return method;
	}

	@Override
	public String getAccessToken() {
		return accessToken;
	}

	@Override
	public String getTimestamp() {
		return timestamp;
	}

	@Override
	public String getSign() {
		return sign;
	}

	@Override
	public String getAppKey() {
		return appKey;
	}

	@Override
	public String getFormat() {
		return format;
	}

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public Map<String, String> getParams() {
		return params;
	}

	@Override
	public long getRequestId() {
		return requestId;
	}

	@Override
	public String getValue(String s) {
		return params.get(s);
	}

	@Override
	public String getValue(String s, String s1) {
		String value = params.get(s);
		if (value == null) {
			value = s1;
		}
		return value;
	}

	@Override
	public Boolean hasValue(String s) {
		return params.containsKey(s);
	}

	@Override
	public double getDouble(String s) {
		return getDouble(s, 0.0D);
	}

	@Override
	public double getDouble(String s, double d) {
		String value = params.get(s);
		if (value == null) {
			return d;
		}
		try {
			return Double.valueOf(value).doubleValue();
		} catch (Exception e) {
			
		}
		return d;
	}

	@Override
	public int getInt(String s) {
		return getInt(s, 0);
	}

	@Override
	public int getInt(String s, int i) {
		String value = params.get(s);
		if (value == null) {
			return i;
		}
		try {
			return Integer.valueOf(value).intValue();
		} catch (Exception e) {
			
		}
		return i;
	}

	@Override
	public long getLong(String s) {
		return getLong(s, 0L);
	}

	@Override
	public long getLong(String s, long l) {
		String value = params.get(s);
		if (value == null) {
			return l;
		}
		try {
			return Long.valueOf(value).longValue();
		} catch (Exception e) {

		}
		return l;
	}

	@Override
	public Date getDate(String s) {
		return getDate(s, null);
	}

	@Override
	public Date getDate(String s, Date date) {
		String value = params.get(s);
		if (!StringUtils.hasText(value)) {
			return date;
		}
		Date time = DateUtil.parseFromString(value);
		if (time == null) {
			return date;
		}
		return time;
	}

	@Override
	public boolean getBoolean(String s) {
		return getBoolean(s, false);
	}

	@Override
	public boolean getBoolean(String s, boolean flag) {
		String value = params.get(s);
		if (!StringUtils.hasText(value)) {
			return flag;
		}
		return "true".equals(value) || "1".equals(value);
	}

	@Override
	public IRequest putParam(String s, String s1) {
		params.put(s, s1);
		return this;
	}
	
	@Override
	public AppDef getAppDef() {
		return appDef;
	}
	
	@Override
    public String toString()
    {
        return (new StringBuilder("Request [requestId=")).append(requestId)
        		.append(", method=").append(method)
        		.append(", accessToken=").append(accessToken)
        		.append(", timestamp=").append(timestamp)
        		.append(", sign=").append(sign)
        		.append(", appKey=").append(appKey)
        		.append(", format=").append(format)
        		.append(", version=").append(version)
        		.append(", params=").append(params)
        		.append("]").toString();
    }

}
