"use strict";

define("Service/proxy", [], function () {
	
	var proxy = new (function() {
		var self = this;

		self.ajax = function(options) {
			var def = Q.defer();
			var defaults = {
				async: true,
				contentType: "application/json",
				data: null,
				method: "GET",
				success: function(data, textStatus, jqXHR) {
					self.successHandler(def, data);
				},
				error: function(jqXHR, textStatus, error) {
					self.errorHandler(def, textStatus, error)
				}				
			};
			var ajaxOptions =$.extend(defaults, options);
			
			$.ajax(ajaxOptions);
			return def.promise;
		};
		
		self.successHandler = function(deferred, data) {
			if (data && data.valid) {
				deferred.resolve(data.data);
			}
			else if (data) {
				deferred.resolve(data.errorMessage);		
			}
			else {
				deferred.resolve("Error reading the results from the server!");
			}
		};
		
		self.errorHandler = function(deferred, textStatus, error) {
			deferred.reject("An error occured when trying to communicate with the server!");
		};
		
		self.get = function(url) {
			return self.ajax({
				url: url,
				method: "GET"
			});
		};
		
		self.post = function(url, body) {
			return self.ajax({
				url: url,
				data: ko.toJSON(body),
				contentType: "application/json"
			});
		};		
		
	})();
	
	return proxy;
	
});