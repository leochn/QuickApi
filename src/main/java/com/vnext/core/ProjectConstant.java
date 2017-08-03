package com.vnext.core;

/**
 * 项目常量
 */
public final class ProjectConstant {
    public static final String BASE_PACKAGE = "com.vnext";                               	   //项目基础包名称,根据实际项目进行修改
    public static final String POJO_PACKAGE = BASE_PACKAGE + ".pojo";							//Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".mapper";						//Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";						//Service所在包
    //public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";				//ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";				//Controller所在包
    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.MyMapper";	//Mapper插件基础接口的完全限定名
    
    
	/**
	 * jwt
	 */
	public static final String JWT_ID = "jwt";
	public static final String JWT_SECRET = "7786df7fc3a34e26a61c034d5ec8245d";
	public static final int JWT_EXPIRATION = 60*60*1000;  //millisecond,60分钟
	public static final int JWT_REFRESH_INTERVAL = 55*60*1000;  //millisecond
	public static final int JWT_REFRESH_TTL = 12*60*60*1000;  //millisecond
	
	/**
	 * header
	 */
	public static final String AUTHORIZATION = "Authorization";
	public static final String ACCESSTOKENERROR = "AccessTokenError";
	
	/**
	 * claim
	 */
	public static final String CLAIMKEY="claimKey";
	public static final String CLAIMKEYVALUE="eyJzdWIiOiJ7XCJsb2dpbk5hbWVcIValue";
}
