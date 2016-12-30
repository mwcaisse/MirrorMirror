package com.ricex.mirrormirror.web.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ricex.mirrormirror.web.manager.WeatherManager;
import com.ricex.mirrormirror.web.viewmodel.ResponseViewModel;
import com.ricex.mirrormirror.web.viewmodel.weather.Weather;

@Controller
@RequestMapping(value = "/api/weather")
public class WeatherApiController extends ApiController {

	private WeatherManager weatherManager;
	
	public WeatherApiController(WeatherManager weatherManager) {
		this.weatherManager = weatherManager;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET, produces={JSON})
	public @ResponseBody ResponseViewModel<Weather> getCurrentWeather(
			@RequestParam double latitude, 
			@RequestParam double longitude, 
			@RequestParam(required = false, defaultValue = "true") boolean useCache) {
		return new ResponseViewModel<Weather>(weatherManager.getWeather(latitude, longitude, useCache));
	}
	
}
