package com.ricex.mirrormirror.weather.model;

import java.util.List;

public class ForecastWeatherFlag {

	private String darkskyUnavailable;
	
	private List<String> darkskyStations;
	
	private List<String> datapointStations;
	
	private List<String> isdStations;
	
	private List<String> lampStations;
	
	private List<String>  metarStations;
	
	private List<String> metnoLicense;
	
	private List<String> sources;
	
	private String units;

	/**
	 * @return the darkskyUnavailable
	 */
	public String getDarkskyUnavailable() {
		return darkskyUnavailable;
	}

	/**
	 * @param darkskyUnavailable the darkskyUnavailable to set
	 */
	public void setDarkskyUnavailable(String darkskyUnavailable) {
		this.darkskyUnavailable = darkskyUnavailable;
	}

	/**
	 * @return the darkskyStations
	 */
	public List<String> getDarkskyStations() {
		return darkskyStations;
	}

	/**
	 * @param darkskyStations the darkskyStations to set
	 */
	public void setDarkskyStations(List<String> darkskyStations) {
		this.darkskyStations = darkskyStations;
	}

	/**
	 * @return the datapointStations
	 */
	public List<String> getDatapointStations() {
		return datapointStations;
	}

	/**
	 * @param datapointStations the datapointStations to set
	 */
	public void setDatapointStations(List<String> datapointStations) {
		this.datapointStations = datapointStations;
	}

	/**
	 * @return the isdStations
	 */
	public List<String> getIsdStations() {
		return isdStations;
	}

	/**
	 * @param isdStations the isdStations to set
	 */
	public void setIsdStations(List<String> isdStations) {
		this.isdStations = isdStations;
	}

	/**
	 * @return the lampStations
	 */
	public List<String> getLampStations() {
		return lampStations;
	}

	/**
	 * @param lampStations the lampStations to set
	 */
	public void setLampStations(List<String> lampStations) {
		this.lampStations = lampStations;
	}

	/**
	 * @return the metarStations
	 */
	public List<String> getMetarStations() {
		return metarStations;
	}

	/**
	 * @param metarStations the metarStations to set
	 */
	public void setMetarStations(List<String> metarStations) {
		this.metarStations = metarStations;
	}

	/**
	 * @return the metnoLicense
	 */
	public List<String> getMetnoLicense() {
		return metnoLicense;
	}

	/**
	 * @param metnoLicense the metnoLicense to set
	 */
	public void setMetnoLicense(List<String> metnoLicense) {
		this.metnoLicense = metnoLicense;
	}

	/**
	 * @return the sources
	 */
	public List<String> getSources() {
		return sources;
	}

	/**
	 * @param sources the sources to set
	 */
	public void setSources(List<String> sources) {
		this.sources = sources;
	}

	/**
	 * @return the units
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * @param units the units to set
	 */
	public void setUnits(String units) {
		this.units = units;
	}
	
	
	
}
