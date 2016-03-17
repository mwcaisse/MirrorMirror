package com.ricex.mirrormirror.spring.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.google.gson.Gson;
import com.ricex.mirrormirror.controller.view.MirrorViewController;
import com.ricex.mirrormirror.util.GsonFactory;

@Configuration
public class ApplicationConfiguration extends WebMvcConfigurationSupport {
	
	//// ------ Controllers ------ \\\\\
	
	@Bean
	public MirrorViewController mirrorViewController() {
		return new MirrorViewController();
	}
	
	/*
	@Bean(destroyMethod="")
	public DataSource dataSource() {
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);
		return dsLookup.getDataSource("java:comp/env/jdbc/CarTrackerDatabase");
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		sqlSessionFactoryBean.setDataSource(dataSource());
		return sqlSessionFactoryBean.getObject();
	}
	*/
	
	@Bean
	public Gson gsonBean() {
		return gsonFactory().constructGson();
	}
	
	@Bean
	public GsonFactory gsonFactory() {
		return new GsonFactory();
	}	

	@Bean
	public GsonHttpMessageConverter gsonMessageConverter() {
		return new GsonHttpMessageConverter(gsonBean());
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(gsonMessageConverter());
		addDefaultHttpMessageConverters(converters);
	};
		
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/");
		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
	}
	
	@Bean
	public StandardServletMultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
}
