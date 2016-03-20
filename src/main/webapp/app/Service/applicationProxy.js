"use strict";

define("Service/applicationProxy", ["Service/proxy"], function (core) {
	
	var appProxy = new (function() {
		var self = this;
		
		self.fortune = {
			get: function() {
				return core.get("/mirrormirror/api/fortune/");
			}
		};	
				 
		
	})();
	
	return appProxy;
	
});