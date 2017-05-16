'use strict';

var locationControllers = angular.module('locationControllers', []);

locationControllers.controller("locationController", function($scope,$http,$routeParams) {

        
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

locationControllers.controller("trouverLogement", function($scope,$http,$routeParams) {
	//$http.get('http://localhost:8080/trouverLogement/'+  "{typeLogement : " + $routeParams.msg + "}").
	$http.get('http://localhost:8080/trouverLogement/'+ $routeParams.msg).
	  success(function(data, status, headers, config) {
	  	$scope.listeLogement = data;
	  	$scope.selected = data[0];
	  }).
	  error(function(data, status, headers, config) {
		  alert('erreur');
	  });
	/*
	alert('ok');
	$scope.trouverLogement = function(typeLogement) {
		alert('ok');
		$http.put('http://localhost:8080/trouverLogement/'+typeLogement).
		  success(function(data, status, headers, config) {
		  	alert('trouverLogement ok');
		  }).
		  error(function(data, status, headers, config) {
			  alert('erreur');
		  });
		 
	}; */
        
});