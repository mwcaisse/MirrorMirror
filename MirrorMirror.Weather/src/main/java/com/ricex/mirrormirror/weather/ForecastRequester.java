package com.ricex.mirrormirror.weather;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.ricex.mirrormirror.weather.model.ForecastWeather;

public class ForecastRequester {

	private static Logger log = LoggerFactory.getLogger(ForecastRequester.class);
	
	private RestTemplate template;
	
	private String apiKey;
	
	private ForecastCache cache;	
	
	public ForecastRequester(String apiKey) {
		this(new RestTemplate(), apiKey);
	}
	
	public ForecastRequester(RestTemplate template, String apiKey) {
		this(template, new ForecastCache(Duration.ofMinutes(15)), apiKey);
	}
	
	public ForecastRequester(RestTemplate template, ForecastCache cache, String apiKey) {
		this.template = template;
		this.cache = cache;
		this.apiKey = apiKey;
	}
	
	/** Fetches a weather forcast from Forecast IO
	 * 
	 * @param latitude The latitude
	 * @param longitude The longitude
	 * @return
	 */
	public ForecastWeather getWeather(double latitude, double longitude) {
		ForecastWeather weather = cache.getCachedValue(latitude, longitude);
		if (null == weather) {
			weather = getWeatherFromServer(latitude, longitude);
		}
		return weather;
	}
	
	protected ForecastWeather getWeatherFromServer(double latitude, double longitude) {
		String url = String.format("https://api.forecast.io/forecast/%s/%f,%f", apiKey, latitude, longitude);
		ForecastWeather weather = template.getForObject(url,  ForecastWeather.class);
		cache.cache(latitude, longitude, weather);
		return weather;
	}
	
}
