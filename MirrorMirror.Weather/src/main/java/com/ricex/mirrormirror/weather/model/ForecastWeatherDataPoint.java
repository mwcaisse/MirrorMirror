package com.ricex.mirrormirror.weather.model;

import java.util.Date;

public class ForecastWeatherDataPoint {

	private Date time;
	
	private String summary;	
	
	private String icon;
	
	private Date sunriseTime;
	
	private Date sunsetTime;
	
	private double moonPhase;
	
	private double nearestStormDistance;
	
	private double nearestStormBearing;
	
	private double precipIntensity;
	
	private double precipIntensityMax;
	
	private String precipType;
	
	private double precipAccumulation;
	
	private double temperature;
	
	private double tmperatureMin;
	
	private Date tmperatureMinTime;
	
	private double temperatureMax;
	
	private Date temperatureMaxTime;
	
	private double apparentTemperature;
	
	private double apparentTemperatureMin;
	
	private Date apparentTemperatureMinTime;
	
	private double apparentTemperatureMax;
	
	private double apparentTemperatureMaxTime;
	
	private double dewPoint;
	
	private double windSpeed;
	
	private double windBearing;
	
	private double cloudCover;
	
	private double humidity;
	
	private double preassure;
	
	private double visibility;
	
	private double ozone;
	
	private double precipIntensityError;
	
	private double windSpeedError;
	
	private double pressureError;

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the sunriseTime
	 */
	public Date getSunriseTime() {
		return sunriseTime;
	}

	/**
	 * @param sunriseTime the sunriseTime to set
	 */
	public void setSunriseTime(Date sunriseTime) {
		this.sunriseTime = sunriseTime;
	}

	/**
	 * @return the sunsetTime
	 */
	public Date getSunsetTime() {
		return sunsetTime;
	}

	/**
	 * @param sunsetTime the sunsetTime to set
	 */
	public void setSunsetTime(Date sunsetTime) {
		this.sunsetTime = sunsetTime;
	}

	/**
	 * @return the moonPhase
	 */
	public double getMoonPhase() {
		return moonPhase;
	}

	/**
	 * @param moonPhase the moonPhase to set
	 */
	public void setMoonPhase(double moonPhase) {
		this.moonPhase = moonPhase;
	}

	/**
	 * @return the nearestStormDistance
	 */
	public double getNearestStormDistance() {
		return nearestStormDistance;
	}

	/**
	 * @param nearestStormDistance the nearestStormDistance to set
	 */
	public void setNearestStormDistance(double nearestStormDistance) {
		this.nearestStormDistance = nearestStormDistance;
	}

	/**
	 * @return the nearestStormBearing
	 */
	public double getNearestStormBearing() {
		return nearestStormBearing;
	}

	/**
	 * @param nearestStormBearing the nearestStormBearing to set
	 */
	public void setNearestStormBearing(double nearestStormBearing) {
		this.nearestStormBearing = nearestStormBearing;
	}

	/**
	 * @return the precipIntensity
	 */
	public double getPrecipIntensity() {
		return precipIntensity;
	}

	/**
	 * @param precipIntensity the precipIntensity to set
	 */
	public void setPrecipIntensity(double precipIntensity) {
		this.precipIntensity = precipIntensity;
	}

	/**
	 * @return the precipIntensityMax
	 */
	public double getPrecipIntensityMax() {
		return precipIntensityMax;
	}

	/**
	 * @param precipIntensityMax the precipIntensityMax to set
	 */
	public void setPrecipIntensityMax(double precipIntensityMax) {
		this.precipIntensityMax = precipIntensityMax;
	}

	/**
	 * @return the precipType
	 */
	public String getPrecipType() {
		return precipType;
	}

	/**
	 * @param precipType the precipType to set
	 */
	public void setPrecipType(String precipType) {
		this.precipType = precipType;
	}

	/**
	 * @return the precipAccumulation
	 */
	public double getPrecipAccumulation() {
		return precipAccumulation;
	}

	/**
	 * @param precipAccumulation the precipAccumulation to set
	 */
	public void setPrecipAccumulation(double precipAccumulation) {
		this.precipAccumulation = precipAccumulation;
	}

	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the tmperatureMin
	 */
	public double getTmperatureMin() {
		return tmperatureMin;
	}

	/**
	 * @param tmperatureMin the tmperatureMin to set
	 */
	public void setTmperatureMin(double tmperatureMin) {
		this.tmperatureMin = tmperatureMin;
	}

	/**
	 * @return the tmperatureMinTime
	 */
	public Date getTmperatureMinTime() {
		return tmperatureMinTime;
	}

	/**
	 * @param tmperatureMinTime the tmperatureMinTime to set
	 */
	public void setTmperatureMinTime(Date tmperatureMinTime) {
		this.tmperatureMinTime = tmperatureMinTime;
	}

	/**
	 * @return the temperatureMax
	 */
	public double getTemperatureMax() {
		return temperatureMax;
	}

	/**
	 * @param temperatureMax the temperatureMax to set
	 */
	public void setTemperatureMax(double temperatureMax) {
		this.temperatureMax = temperatureMax;
	}

	/**
	 * @return the temperatureMaxTime
	 */
	public Date getTemperatureMaxTime() {
		return temperatureMaxTime;
	}

	/**
	 * @param temperatureMaxTime the temperatureMaxTime to set
	 */
	public void setTemperatureMaxTime(Date temperatureMaxTime) {
		this.temperatureMaxTime = temperatureMaxTime;
	}

	/**
	 * @return the apparentTemperature
	 */
	public double getApparentTemperature() {
		return apparentTemperature;
	}

	/**
	 * @param apparentTemperature the apparentTemperature to set
	 */
	public void setApparentTemperature(double apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

	/**
	 * @return the apparentTemperatureMin
	 */
	public double getApparentTemperatureMin() {
		return apparentTemperatureMin;
	}

	/**
	 * @param apparentTemperatureMin the apparentTemperatureMin to set
	 */
	public void setApparentTemperatureMin(double apparentTemperatureMin) {
		this.apparentTemperatureMin = apparentTemperatureMin;
	}

	/**
	 * @return the apparentTemperatureMinTime
	 */
	public Date getApparentTemperatureMinTime() {
		return apparentTemperatureMinTime;
	}

	/**
	 * @param apparentTemperatureMinTime the apparentTemperatureMinTime to set
	 */
	public void setApparentTemperatureMinTime(Date apparentTemperatureMinTime) {
		this.apparentTemperatureMinTime = apparentTemperatureMinTime;
	}

	/**
	 * @return the apparentTemperatureMax
	 */
	public double getApparentTemperatureMax() {
		return apparentTemperatureMax;
	}

	/**
	 * @param apparentTemperatureMax the apparentTemperatureMax to set
	 */
	public void setApparentTemperatureMax(double apparentTemperatureMax) {
		this.apparentTemperatureMax = apparentTemperatureMax;
	}

	/**
	 * @return the apparentTemperatureMaxTime
	 */
	public double getApparentTemperatureMaxTime() {
		return apparentTemperatureMaxTime;
	}

	/**
	 * @param apparentTemperatureMaxTime the apparentTemperatureMaxTime to set
	 */
	public void setApparentTemperatureMaxTime(double apparentTemperatureMaxTime) {
		this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
	}

	/**
	 * @return the dewPoint
	 */
	public double getDewPoint() {
		return dewPoint;
	}

	/**
	 * @param dewPoint the dewPoint to set
	 */
	public void setDewPoint(double dewPoint) {
		this.dewPoint = dewPoint;
	}

	/**
	 * @return the windSpeed
	 */
	public double getWindSpeed() {
		return windSpeed;
	}

	/**
	 * @param windSpeed the windSpeed to set
	 */
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	/**
	 * @return the windBearing
	 */
	public double getWindBearing() {
		return windBearing;
	}

	/**
	 * @param windBearing the windBearing to set
	 */
	public void setWindBearing(double windBearing) {
		this.windBearing = windBearing;
	}

	/**
	 * @return the cloudCover
	 */
	public double getCloudCover() {
		return cloudCover;
	}

	/**
	 * @param cloudCover the cloudCover to set
	 */
	public void setCloudCover(double cloudCover) {
		this.cloudCover = cloudCover;
	}

	/**
	 * @return the humidity
	 */
	public double getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the preassure
	 */
	public double getPreassure() {
		return preassure;
	}

	/**
	 * @param preassure the preassure to set
	 */
	public void setPreassure(double preassure) {
		this.preassure = preassure;
	}

	/**
	 * @return the visibility
	 */
	public double getVisibility() {
		return visibility;
	}

	/**
	 * @param visibility the visibility to set
	 */
	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}

	/**
	 * @return the ozone
	 */
	public double getOzone() {
		return ozone;
	}

	/**
	 * @param ozone the ozone to set
	 */
	public void setOzone(double ozone) {
		this.ozone = ozone;
	}

	/**
	 * @return the precipIntensityError
	 */
	public double getPrecipIntensityError() {
		return precipIntensityError;
	}

	/**
	 * @param precipIntensityError the precipIntensityError to set
	 */
	public void setPrecipIntensityError(double precipIntensityError) {
		this.precipIntensityError = precipIntensityError;
	}

	/**
	 * @return the windSpeedError
	 */
	public double getWindSpeedError() {
		return windSpeedError;
	}

	/**
	 * @param windSpeedError the windSpeedError to set
	 */
	public void setWindSpeedError(double windSpeedError) {
		this.windSpeedError = windSpeedError;
	}

	/**
	 * @return the pressureError
	 */
	public double getPressureError() {
		return pressureError;
	}

	/**
	 * @param pressureError the pressureError to set
	 */
	public void setPressureError(double pressureError) {
		this.pressureError = pressureError;
	}
	
	
}
