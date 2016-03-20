package com.ricex.mirrormirror.weather.model;

import java.util.List;

public class ForecastWeatherDataBlock {
	
	private String summary;
	
	private String icon;
	
	private List<ForecastWeatherDataPoint> data;

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
	 * @return the data
	 */
	public List<ForecastWeatherDataPoint> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<ForecastWeatherDataPoint> data) {
		this.data = data;
	}
	
	
}
