'use strict';

var app = angular.module('ProjetImmo', [
	'ngRoute','locationControllers'                                               ]);

app.config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
			when('/projetImmo', {
				templateUrl: 'partials/menu.html'
			}).
			when('/projetImmo/mettreEnLocation', {
				templateUrl: 'partials/mettreEnLocation.html',
				controller: 'mettreEnLocation'
			}).
			when('/projetImmo/trouverLogement/:typeLogement', {
				templateUrl: 'partials/trouverLogement.html',
				controller: 'trouverLogement'
			}).
			otherwise({
				redirectTo: '/projetImmo'
			});
}]);