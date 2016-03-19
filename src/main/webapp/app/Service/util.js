"use strict";

define("Service/util", [], function (text) {
	
	var util = new (function() {
		var self = this;

		/** Runs the given function every x milliseconds
		 * 
		 */
		self.runEveryMs = function(func, ms) {
			setInterval(func, ms);
		};
		
		/** Runs the given function every x seconds
		 *  @param func The function to run
		 *  @param seconds The internval in seconds between each execution
		 */
		self.runEverySecond = function(func, seconds) {
			self.runEveryMs(func, seconds * 1000);
		};
		
		/** Runs the given function every x minutes
		 *  @param func The function to run
		 *  @param minutes The internal in minutes between each execution
		 */
		self.runEveryMinute = function(func, minutes) {
			self.runEverySecond(func, minutes * 60);
		};
		
		/** Runs the given function every x hours
		 * 	@param func The function to run
		 *  @param hours The interval in hours between each execution
		 */
		self.runEveryHour = function(func, hours) {
			self.runEveryMinute(func, hours * 60)
		};
		
	})();
	
	return util;
	
});