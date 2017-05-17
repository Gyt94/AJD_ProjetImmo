'use strict';

var locationControllers = angular.module('locationControllers', []);

locationControllers.controller("locationController", function($scope,$http,$routeParams) {

/*	$http.get('http://localhost:8080/user').
	  success(function(data, status, headers, config) {
	  	$scope.listeUser = data;
	  	$scope.selected = data[0];
	  }).
	  error(function(data, status, headers, config) {
	  });*/
        
});

locationControllers.controller("ramenerController", function($scope,$http,$routeParams) {

	$scope.immatriculation = '';
	
	$scope.ramener = function(immatriculation) {
		$http.put('http://localhost:8080/locationVoiture/voiture/'+immatriculation+'?louer=false').
		  success(function(data, status, headers, config) {
		  	alert('ramener ok');
		  }).
		  error(function(data, status, headers, config) {
			  alert('erreur');
		  });
	};
        
});