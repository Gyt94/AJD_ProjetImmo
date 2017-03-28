'use strict';

var app = angular.module('ProjetImmo', [
	'ngRoute','locationControllers'                                               ]);

app.config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
			when('/projetImmo', {
				templateUrl: 'partials/menu.html'
			}).
			when('/projetImmo/louer', {
				templateUrl: 'partials/location.html',
				controller: 'locationController'
			}).
			when('/projetImmo/ramener', {
				templateUrl: 'partials/ramenerLoc.html',
				controller: 'ramenerController'
			}).
			otherwise({
				redirectTo: '/projetImmo'
			});
}]);