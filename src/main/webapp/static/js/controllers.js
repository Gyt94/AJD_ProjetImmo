'use strict';

var locationControllers = angular.module('locationControllers', []);

locationControllers.controller("locationController", function($scope,$http,$routeParams) {

        
});

locationControllers.controller("trouverLogement", function($scope,$http,$routeParams) {
	$http.get('http://localhost:8080/trouverLogement/'+ $routeParams.msg).
	  success(function(data, status, headers, config) {
	  	$scope.listeLogement = data;
	  	$scope.selected = data[0];
	  }).
	  error(function(data, status, headers, config) {
		  alert('erreur');
	  }); 
});