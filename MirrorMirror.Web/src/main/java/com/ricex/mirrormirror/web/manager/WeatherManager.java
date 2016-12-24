package com.ricex.mirrormirror.web.manager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.ricex.mirrormirror.weather.ForecastRequester;
import com.ricex.mirrormirror.weather.model.ForecastWeather;
import com.ricex.mirrormirror.weather.model.ForecastWeatherDataPoint;
import com.ricex.mirrormirror.web.viewmodel.weather.Weather;
import com.ricex.mirrormirror.web.viewmodel.weather.WeatherCurrently;
import com.ricex.mirrormirror.web.viewmodel.weather.WeatherDay;

public class WeatherManager {

	public static final int MAXIMUM_FUTURE_DAYS_DATA = 6;
	
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
		for (ForecastWeatherDataPoint day : forecast.getDaily().getData()) {
			if (isDateToday(day.getTime())) {
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
		currently.setTempHigh(dailyToday.getTemperatureMax());
		currently.setTempLow(dailyToday.getTemperatureMin());
		currently.setSummaryDetailed(dailyToday.getSummary());
		
		return currently;
	}
	
	protected static boolean isDateToday(Date date) {
		Calendar today = Calendar.getInstance();
		Calendar dateCalendar = Calendar.getInstance();
		dateCalendar.setTime(date);
		
		return (today.get(Calendar.YEAR) == dateCalendar.get(Calendar.YEAR) &&
				today.get(Calendar.DAY_OF_YEAR) == dateCalendar.get(Calendar.DAY_OF_YEAR)); 

	}
	
	public static List<WeatherDay> constructViewModelFuture(ForecastWeather forecast) {
		List<WeatherDay> future = new ArrayList<WeatherDay>();
		
		List<ForecastWeatherDataPoint> dayData = forecast.getDaily().getData();
		
		for (int i=0; i < Math.min(dayData.size(), MAXIMUM_FUTURE_DAYS_DATA + 1); i++) {
			ForecastWeatherDataPoint data = dayData.get(i);
			WeatherDay day = new WeatherDay();
			
			if (isDateToday(data.getTime())) {
				continue;
			}
			
			day.setDay(data.getTime());
			day.setIcon(data.getIcon());
			day.setPrecipChance(data.getPrecipProbability());
			day.setPrecipType(data.getPrecipType());
			day.setSummary(data.getSummary());
			day.setTempHigh(data.getTemperatureMax());
			day.setTempLow(data.getTemperatureMin());
			day.setWindSpeed(data.getWindSpeed());					
					
			future.add(day);
			
		}
		
		return future;
	}
	
}
