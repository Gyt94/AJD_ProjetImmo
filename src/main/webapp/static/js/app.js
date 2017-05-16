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
				templateUrl: 'partials/chercher.html',
				controller: 'locationController'
			}).
			when('/projetImmo/trouverLogement/:msg', {
				templateUrl: 'partials/trouverLogement.html',
				controller: 'trouverLogement'
			}).
			otherwise({
				redirectTo: '/projetImmo'
			});
}]);