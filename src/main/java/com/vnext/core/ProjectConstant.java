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
}
