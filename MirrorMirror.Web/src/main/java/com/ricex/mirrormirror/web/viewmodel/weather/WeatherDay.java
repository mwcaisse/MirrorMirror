package com.ricex.mirrormirror.web.viewmodel.weather;

import java.util.Date;

public class WeatherDay {

	private Date day;
	
	private String summary;
	
	private String icon;
	
	private double tempHigh;
	
	private double tempLow;
	
	private double windSpeed;
	
	private double precipChance;
	
	private String precipType;

	/**
	 * @return the day
	 */
	public Date getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(Date day) {
		this.day = day;
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
	 * @return the tempHigh
	 */
	public double getTempHigh() {
		return tempHigh;
	}

	/**
	 * @param tempHigh the tempHigh to set
	 */
	public void setTempHigh(double tempHigh) {
		this.tempHigh = tempHigh;
	}

	/**
	 * @return the tempLow
	 */
	public double getTempLow() {
		return tempLow;
	}

	/**
	 * @param tempLow the tempLow to set
	 */
	public void setTempLow(double tempLow) {
		this.tempLow = tempLow;
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
	 * @return the precipChance
	 */
	public double getPrecipChance() {
		return precipChance;
	}

	/**
	 * @param precipChance the precipChance to set
	 */
	public void setPrecipChance(double precipChance) {
		this.precipChance = precipChance;
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
	
}
