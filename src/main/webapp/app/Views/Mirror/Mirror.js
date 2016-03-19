"use strict";

define("Views/Mirror/Mirror", ["AMD/koTemplateLoader!Views/Mirror/Mirror.html"], function (text) {
	
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
		
		//set the update function to update the date
		setInterval(function() {
			self.currentTime(new Date());
		}, 1000);
		
	};
	
	return vm;
	
});