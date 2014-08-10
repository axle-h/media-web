package com.axh.media.init;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@PropertySource("classpath:data.properties")
public class DataConfig {
	private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
    private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";
     
    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";
    
    @Resource
    private Environment env;
    
    @Bean
	public DataSource torrentsDataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	
    	dataSource.setDriverClassName(env.getProperty(PROPERTY_NAME_DATABASE_DRIVER));
    	dataSource.setUrl(env.getProperty(PROPERTY_NAME_DATABASE_URL));
    	dataSource.setUsername(env.getProperty(PROPERTY_NAME_DATABASE_USERNAME));
    	dataSource.setPassword(env.getProperty(PROPERTY_NAME_DATABASE_PASSWORD));
    	
    	return dataSource;
	}
    
    @Bean
    public LocalSessionFactoryBean torrentsSessionFactory() {
    	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
    	sessionFactory.setDataSource(torrentsDataSource());
    	sessionFactory.setPackagesToScan(env.getProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
    	Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", env.getProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
		hibernateProperties.setProperty("hibernate.show_sql", env.getProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
		sessionFactory.setHibernateProperties(hibernateProperties);
		return sessionFactory;
    }
}
