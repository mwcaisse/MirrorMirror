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
			get: function(latitude, longitude, useCache) {
				if (useCache === false) {
					useCache = false;
				}
				else {
					useCache = true;
				}
				return core.get("/mirrormirror/api/weather/?latitude=" +latitude +"&longitude=" + longitude + "&useCache=" + useCache);
			}
		};
				 
		
	})();
	
	return appProxy;
	
});