"use strict";

define("Modules/Travel/Travel", ["AMD/googlemaps!", 
                                 "moment", 
                                 "Service/util", 
                                 "Service/applicationProxy", 
                                 "moment-duration-format", 
                                 "Modules/Travel/TravelBinding"],
		function (gmaps, moment, util, proxy) {
	
	var vm = function() {
		var self = this;

		self.time = ko.observable(moment.duration(0));
		self.timeTraffic = ko.observable(moment.duration(0));
		self.distance = ko.observable(0);
		
		self.travelTime = ko.computed(function () {
			return util.formatDuration(self.timeTraffic(), "m [minutes]");
		});
		
		self.updateInterval = 15;
		
		/** Fetches the fortune from the server! */
		self.fetchTravelTime = function() {
			
			var service = new gmaps.DistanceMatrixService();
			service.getDistanceMatrix(
					{
						origins: ["3 Danforth RD Nashua NH"],
						destinations: ["880 Technology Park Drive Billerica MA"],
						travelMode: "DRIVING",
						drivingOptions: {
							departureTime: new Date(),
							trafficModel: "optimistic"
						}
					},
					function (response, status) {	
						if (status === "OK" && response.rows.length > 0) {
							var resp = response.rows[0].elements[0];
							
							self.distance(resp.distance.value);
							self.time(moment.duration(resp.duration.value, "seconds"))
							self.timeTraffic(moment.duration(resp.duration_in_traffic.value, "seconds"))
						}
						else {
							self.timeTraffic(moment.duration(0));
						}
					}
				);
			
		};
		
		self.load = function() {
			self.fetchTravelTime();
			util.runEveryMinute(self.fetchTravelTime, self.updateInterval);
		};		
		
		self.refresh = function () {
			self.fetchTravelTime();
		};
	};
	
	return vm;
	
});