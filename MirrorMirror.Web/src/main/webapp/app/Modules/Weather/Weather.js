"use strict";

define("Modules/Weather/Weather", ["Service/util", "Service/applicationProxy", "Modules/Weather/WeatherModel", 
                                   "Modules/Weather/WeatherBinding"],
		function (util, proxy, weatherModel) {
	
	var vm = function() {
		var self = this;

		/** Weather currently */
		self.current = new weatherModel();
		
		/** Weather in the future */
		self.future = ko.observableArray([]);
		
		/** Interval to update the weather */
		self.updateInterval = 15;
		
		/** Fetch the weather from the web server and parse the results
		 * 
		 */
		self.fetchWeather = function() {
			var latitude = 42.706415;
			var longitude = -71.445060;
			proxy.weather.get(latitude, longitude).then(function (data) {
				if (data.currently && data.future) {
					self.current.update(data.currently);
					
					var futureModels = [];
					$.each (data.future, function (ind, elm) {					
						futureModels.push(new weatherModel(elm));
					});						
					self.future(futureModels);						
				}
			},
			function (error) {
				//do nothing now.. don't want to create an alert
				//that will stop execution
				//just for debugging
				alert(error);
			});
		};
		
		/** Performs the initial population, and sets up the timer to
		 * 		fetch the weather
		 */
		self.load = function() {
			self.fetchWeather();
			util.runEveryMinute(self.fetchWeather, self.updateInterval);
		};	
		
		self.refresh = function () {
			self.fetchWeather();
		};
	};
	
	return vm;
	
});