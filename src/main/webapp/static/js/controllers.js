'use strict';

var locationControllers = angular.module('locationControllers', []);

locationControllers.controller("mettreEnLocation", function($location, $scope,$http,$routeParams) {
$scope.ajouterBienImmobilier = function(bienImmobilier) {
	$http.post('http://localhost:8080/ajouterBienImmobilier/', $scope.bienImmobilier).
		  success(function(data, status, headers, config) {
			  alert('Bien immobilier ajouté !');
			  $location.path('/projetImmo').replace();
		  }).
		  error(function(data, status, headers, config) {
			  alert('erreur');
		  });
	};
});

locationControllers.controller("trouverLogement", function($scope,$http,$routeParams) {
	$http.get('http://localhost:8080/trouverLogement/'+ $routeParams.typeLogement).
	  success(function(data, status, headers, config) {
	  	$scope.listeLogement = data;
	  	$scope.selected = data[0];
	  }).
	  error(function(data, status, headers, config) {
		  alert('erreur');
	  }); 
});