"use strict";

define("Modules/Fortune/Fortune", ["Service/util", "Service/applicationProxy", "Modules/Fortune/FortuneBinding"],
		function (util, proxy) {
	
	var vm = function() {
		var self = this;

		self.fortune = ko.observable("");
		
		self.updateInterval = 30;
		
		/** Fetches the fortune from the server! */
		self.fetchFortune = function() {
			proxy.fortune.get().then(function (data) {
				self.fortune(data);
			},
			function (error) {
				//do nothing now.. don't want to create an alert
				//that will stop execution
				//just for debugging
				alert(error);
			})
		};
		
		self.load = function() {
			self.fetchFortune();
			util.runEveryMinute(self.fetchFortune, self.updateInterval);
		};

		
	};
	
	return vm;
	
});