"use strict";

define("Views/Mirror/Mirror", 
	["Modules/DateTime/DateTime",
	 "Modules/Fortune/Fortune",
	 "Modules/Weather/Weather",
	 "Service/util", 
	 "AMD/koTemplateLoader!Views/Mirror/Mirror.html"], function (dateTime, fortune, weather, util) {
	
	var vm = function() {
		var self = this;

		self.dateTime = new dateTime();
		self.fortune = new fortune();
		self.weather = new weather();
		
		self.dateTime.load();
		self.fortune.load();
		self.weather.load();
		
		
		$(document).on("keypress", function (event) {
			if (event.which === 49) {
				self.fortune.refresh();
			}
			else if (event.which === 50) {
				self.weather.refresh();
			}
		});
	};
	
	return vm;
	
});