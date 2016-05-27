"use strict";

define("Service/applicationProxy", ["Service/proxy"], function (core) {
	
	var appProxy = new (function() {
		var self = this;
		
		self.fortune = {
			get: function() {
				return core.get("/mirrormirror/api/fortune/");
			}
		};	
		
		self.weather = {
			get: function(latitude, longitude) {
				return core.get("/mirrormirror/api/weather/?latitude=" +latitude +"&longitude=" + longitude);
			}
		};
				 
		
	})();
	
	return appProxy;
	
});