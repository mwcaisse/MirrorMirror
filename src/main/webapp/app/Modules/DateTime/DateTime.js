"use strict";

define("Modules/DateTime/DateTime", ["Service/util", "Modules/DateTime/DateTimeBinding"], function (util) {
	
	var vm = function() {
		var self = this;

		self.currentTime = ko.observable(new Date());
		
		self.currentTimeDisplay = ko.computed(function() {
			//http://momentjs.com/docs/#/displaying/
			var formatString = "HH:mm:ss";
			return moment(self.currentTime()).format(formatString);
		});
		
		self.currentDateDisplay = ko.computed(function() {
			//http://momentjs.com/docs/#/displaying/
			var formatString = "dddd, MMMM Do YYYY";
			return moment(self.currentTime()).format(formatString);
		});
		
		util.runEverySecond(function() {
			self.currentTime(new Date());
		}, 1);
		
	};
	
	return vm;
	
});