package com.ricex.mirrormirror.weather;

import java.time.Duration;
import java.time.Instant;
import java.util.Hashtable;
import java.util.Map;

import com.ricex.mirrormirror.weather.model.ForecastWeather;

public class ForecastCache {

	private Map<WeatherLocation, ForecastCacheEntry> cache;
	
	private Duration defaultValidFor;
	
	public ForecastCache(Duration defaultValidFor) {
		this.defaultValidFor = defaultValidFor;
		cache = new Hashtable<WeatherLocation, ForecastCacheEntry>();
	}

	
	/** Caches this Forecast weather for the default duration
	 * 
	 * @param latitude The latitude of the weather request to cache
	 * @param longitude The longitude of the weather request to cache
	 * @param weather The weather entry to cache
	 */
	public void cache(double latitude, double longitude, ForecastWeather weather) {
		cache(latitude, longitude, weather, defaultValidFor);
	}
	
	/** Caches this Forecast weather for the specified duration
	 * 
	 * @param latitude The latitude of the weather request to cache
	 * @param longitude The longitude of the weather request to cache
	 * @param weather the weather entry to cache
	 * @param validFor The duration that it is valid for
	 */
	public void cache(double latitude, double longitude, ForecastWeather weather, Duration validFor) {
		WeatherLocation location = new WeatherLocation(latitude, longitude);
		ForecastCacheEntry entry = new ForecastCacheEntry(location, weather, validFor);
		cache.put(location, entry);
	}
	
	/** Returns the cached value for the given location
	 * 
	 * @param latitude The latitude to get the cached value for
	 * @param longitude The longitude to get the cached value for
	 * @return The cached value, or null if no valid entry was found
	 */
	public ForecastWeather getCachedValue(double latitude, double longitude) {
		WeatherLocation location = new WeatherLocation(latitude, longitude);
		ForecastCacheEntry entry = cache.get(location);
		if (!entry.hasExpired()) {
			return entry.getWeather();
		}
		purgeCache(); //there is atleast one invalid entry in the cache, purge it
		return null;
	}
	
	/** Clears the cache and removes all expired entries
	 * 
	 */
	public void purgeCache() {		
		cache.entrySet().removeIf(e -> e.getValue().hasExpired());
	}
	
}
