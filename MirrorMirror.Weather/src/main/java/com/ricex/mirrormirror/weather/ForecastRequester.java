package com.ricex.mirrormirror.weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.ricex.mirrormirror.weather.model.ForecastWeather;

public class ForecastRequester {

	private static Logger log = LoggerFactory.getLogger(ForecastRequester.class);
	
	private RestTemplate template;
	
	private String apiKey;	
	
	
	public ForecastRequester(String apiKey) {
		this(new RestTemplate(), apiKey);
	}
	
	public ForecastRequester(RestTemplate template, String apiKey) {
		this.template = template;
		this.apiKey = apiKey;
	}
	
	/** Fetches a weather forcast from Forecast IO
	 * 
	 * @param latitude The latitude
	 * @param longitude The longitude
	 * @return
	 */
	public ForecastWeather getWeather(double latitude, double longitude) {
		String url = String.format("https://api.forecast.io/forecast/%s/%f,%f", apiKey, latitude, longitude);
		return template.getForObject(url,  ForecastWeather.class);
	}
	
}
