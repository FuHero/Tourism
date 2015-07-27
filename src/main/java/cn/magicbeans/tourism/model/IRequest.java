package cn.magicbeans.tourism.model;

import java.util.Date;
import java.util.Map;

import cn.magicbeans.tourism.model.impl.AppDef;

public interface IRequest {
	
	String getMethod();

    String getAccessToken();

    String getTimestamp();

    String getSign();

    String getAppKey();

    String getFormat();

    String getVersion();

    Map<String,String> getParams();

    long getRequestId();

    String getValue(String s);

    String getValue(String s, String s1);

    Boolean hasValue(String s);

    double getDouble(String s);

    double getDouble(String s, double d);

    int getInt(String s);

    int getInt(String s, int i);

    long getLong(String s);

    long getLong(String s, long l);

    Date getDate(String s);

    Date getDate(String s, Date date);

    boolean getBoolean(String s);

    boolean getBoolean(String s, boolean flag);

    IRequest putParam(String s, String s1);

    AppDef getAppDef();

}
