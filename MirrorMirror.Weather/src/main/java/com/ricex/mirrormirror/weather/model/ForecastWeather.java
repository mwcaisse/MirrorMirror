package com.ricex.mirrormirror.weather.model;

import java.util.List;

public class ForecastWeather {

	private double latitude;
	
	private double longitude;
	
	private String timezone;
	
	private double offset;
	
	private ForecastWeatherDataPoint currently;
	
	private ForecastWeatherDataBlock minutely;
	
	private ForecastWeatherDataBlock hourly;
	
	private ForecastWeatherDataBlock daily;
	
	private List<ForecastWeatherAlert> alerts;
	
	private ForecastWeatherFlag flags;

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * @return the offset
	 */
	public double getOffset() {
		return offset;
	}

	/**
	 * @param offset the offset to set
	 */
	public void setOffset(double offset) {
		this.offset = offset;
	}

	/**
	 * @return the currently
	 */
	public ForecastWeatherDataPoint getCurrently() {
		return currently;
	}

	/**
	 * @param currently the currently to set
	 */
	public void setCurrently(ForecastWeatherDataPoint currently) {
		this.currently = currently;
	}

	/**
	 * @return the minutely
	 */
	public ForecastWeatherDataBlock getMinutely() {
		return minutely;
	}

	/**
	 * @param minutely the minutely to set
	 */
	public void setMinutely(ForecastWeatherDataBlock minutely) {
		this.minutely = minutely;
	}

	/**
	 * @return the hourly
	 */
	public ForecastWeatherDataBlock getHourly() {
		return hourly;
	}

	/**
	 * @param hourly the hourly to set
	 */
	public void setHourly(ForecastWeatherDataBlock hourly) {
		this.hourly = hourly;
	}

	/**
	 * @return the daily
	 */
	public ForecastWeatherDataBlock getDaily() {
		return daily;
	}

	/**
	 * @param daily the daily to set
	 */
	public void setDaily(ForecastWeatherDataBlock daily) {
		this.daily = daily;
	}

	/**
	 * @return the alerts
	 */
	public List<ForecastWeatherAlert> getAlerts() {
		return alerts;
	}

	/**
	 * @param alerts the alerts to set
	 */
	public void setAlerts(List<ForecastWeatherAlert> alerts) {
		this.alerts = alerts;
	}

	/**
	 * @return the flags
	 */
	public ForecastWeatherFlag getFlags() {
		return flags;
	}

	/**
	 * @param flags the flags to set
	 */
	public void setFlags(ForecastWeatherFlag flags) {
		this.flags = flags;
	}
	
	
}
