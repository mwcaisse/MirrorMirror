package com.ricex.mirrormirror.web.manager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;

import com.ricex.mirrormirror.weather.ForecastRequester;
import com.ricex.mirrormirror.weather.model.ForecastWeather;
import com.ricex.mirrormirror.weather.model.ForecastWeatherDataPoint;
import com.ricex.mirrormirror.web.viewmodel.weather.Weather;
import com.ricex.mirrormirror.web.viewmodel.weather.WeatherCurrently;
import com.ricex.mirrormirror.web.viewmodel.weather.WeatherDay;

public class WeatherManager {

	private ForecastRequester forecastRequester;
	
	public WeatherManager(ForecastRequester forecastRequester) {
		this.forecastRequester = forecastRequester;
	}
	
	public Weather getWeather(double latitude, double longitude) {
		ForecastWeather forecast = forecastRequester.getWeather(latitude, longitude);		
		return constructViewModel(forecast);
	}
	
	public static Weather constructViewModel(ForecastWeather forecast) {
		Weather weather = new Weather();		
		
		weather.setCurrently(constructViewModelCurrently(forecast));
		weather.setFuture(constructViewModelFuture(forecast));
		
		return weather;
	}
	
	public static WeatherCurrently constructViewModelCurrently(ForecastWeather forecast) {
		WeatherCurrently currently = new WeatherCurrently();
		ForecastWeatherDataPoint fwCurrently = forecast.getCurrently();
		ForecastWeatherDataPoint dailyToday = new ForecastWeatherDataPoint();
		Calendar today = Calendar.getInstance();
		for (ForecastWeatherDataPoint day : forecast.getDaily().getData()) {
			Calendar dayDate = Calendar.getInstance();
			dayDate.setTime(day.getTime());
			if (today.get(Calendar.YEAR) == dayDate.get(Calendar.YEAR) &&
				today.get(Calendar.DAY_OF_YEAR) == dayDate.get(Calendar.DAY_OF_YEAR)) {
				dailyToday = day;
				break;
			}
		}		
		
		currently.setDay(fwCurrently.getTime());
		currently.setIcon(fwCurrently.getIcon());
		currently.setPrecipChance(fwCurrently.getPrecipProbability());
		currently.setPrecipType(fwCurrently.getPrecipType());
		currently.setSummary(fwCurrently.getSummary());
		currently.setTempCurrent(fwCurrently.getApparentTemperature());
		currently.setWindSpeed(fwCurrently.getWindSpeed());
		currently.setTempHigh(dailyToday.getApparentTemperatureMax());
		currently.setTempLow(dailyToday.getApparentTemperatureMin());
		currently.setSummaryDetailed(dailyToday.getSummary());
		
		return currently;
	}
	
	public static List<WeatherDay> constructViewModelFuture(ForecastWeather forecast) {
		List<WeatherDay> future = new ArrayList<WeatherDay>();
		
		return future;
	}
	
}
