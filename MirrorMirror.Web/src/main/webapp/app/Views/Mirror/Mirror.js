"use strict";

define("Views/Mirror/Mirror", 
	["Modules/DateTime/DateTime",
	 "Modules/Fortune/Fortune",
	 "Modules/Weather/Weather",
	 "Modules/Travel/Travel",
	 "Service/util", 
	 "AMD/koTemplateLoader!Views/Mirror/Mirror.html"], function (dateTime, fortune, weather, travel, util) {
	
	var vm = function() {
		var self = this;

		self.dateTime = new dateTime();
		self.fortune = new fortune();
		self.weather = new weather();
		self.travel = new travel();
		
		self.dateTime.load();
		self.fortune.load();
		self.weather.load();
		self.travel.load();
		
		
		$(document).on("keypress", function (event) {
			if (event.which === 49) {
				self.fortune.refresh();
			}
			else if (event.which === 50) {
				self.weather.refresh();
			}
			else if (event.which === 51) {
				self.travel.refresh();
			}
		});
	};
	
	return vm;
	
});