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
			when('/projetImmo/ramener', {
				templateUrl: 'partials/mettreVente.html',
				controller: 'ramenerController'
			}).
			when('/projetImmo/example', {
				templateUrl: 'partials/miseVente.html',
				controller: 'ramenerController'
			}).
			otherwise({
				redirectTo: '/projetImmo'
			});
}]);