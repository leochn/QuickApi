package com.vnext.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class MyBatisConfig {
	@Autowired
    private DataSource dataSource;
	
	@Bean
    @ConditionalOnMissingBean //当容器里没有指定的Bean的情况下创建该对象
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 设置mybatis的主配置文件
        /*ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource mybatisConfigXml = resolver.getResource("classpath:mapper/*.xml");
        sqlSessionFactoryBean.setConfigLocation(mybatisConfigXml);*/
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
			sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        // 设置别名包
        sqlSessionFactoryBean.setTypeAliasesPackage("com.vnext.pojo");
        return sqlSessionFactoryBean;
    }
}
