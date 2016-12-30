package com.ricex.mirrormirror.web.spring.configuration;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.google.gson.Gson;
import com.ricex.mirrormirror.weather.ForecastRequester;
import com.ricex.mirrormirror.web.controller.api.FortuneApiController;
import com.ricex.mirrormirror.web.controller.api.WeatherApiController;
import com.ricex.mirrormirror.web.controller.view.MirrorViewController;
import com.ricex.mirrormirror.web.manager.FortuneManager;
import com.ricex.mirrormirror.web.manager.WeatherManager;
import com.ricex.mirrormirror.web.util.GsonFactory;

@Configuration
public class ApplicationConfiguration extends WebMvcConfigurationSupport {
	
	//// ------ Controllers ------ \\\\\
	
	@Bean
	public MirrorViewController mirrorViewController() {
		return new MirrorViewController();
	}
	
	@Bean
	public FortuneApiController fortuneApiController() {
		return new FortuneApiController(fortuneManager());
	}
	
	@Bean
	public WeatherApiController weatherApiController() throws NamingException {
		return new WeatherApiController(weatherManager());
	}
	
	///// ------- Managers ----------- \\\\
	
	@Bean
	public FortuneManager fortuneManager() {
		return new FortuneManager();
	}
	
	@Bean
	public WeatherManager weatherManager() throws NamingException {
		return new WeatherManager(forecastRequester());
	}	
	
	@Bean
	public ForecastRequester forecastRequester() throws NamingException {
		return new ForecastRequester(restTemplate(), forecastApiKey());
	}
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate template = new RestTemplate();
		
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		messageConverters.add(gsonMessageConverterForcastIO());
		template.setMessageConverters(messageConverters);
		
		return template;
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
	public String forecastApiKey() throws NamingException {
		JndiTemplate template = new JndiTemplate();
		return template.lookup("java:comp/env/MIRROR_FORECASTIO_API_KEY", String.class);
	}
	
	@Bean
	public Gson gsonBean() {
		return gsonFactory().constructGson();
	}
	
	@Bean
	public Gson forecastIoGsonBean() {
		return gsonFactory().constructGsonForecastIO();
	}
	
	@Bean
	public GsonFactory gsonFactory() {
		return new GsonFactory();
	}	

	@Bean
	public GsonHttpMessageConverter gsonMessageConverter() {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		converter.setGson(gsonBean());
		return converter;
	}
	
	@Bean
	public GsonHttpMessageConverter gsonMessageConverterForcastIO() {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		converter.setGson(forecastIoGsonBean());
		return converter;
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
	
	@Bean
	public String googleMapsApiKey() throws NamingException {
		JndiTemplate template = new JndiTemplate();
		return template.lookup("java:comp/env/CARTRACKER_GOOGLE_MAPS_API_KEY", String.class); 
	}
	
}
