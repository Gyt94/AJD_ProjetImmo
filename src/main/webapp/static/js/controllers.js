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

locationControllers.controller("ramenerController", function($scope,$http,$routeParams) {

	$scope.ville = null;
	$scope.budgetMini = null;
	$scope.budgetMax = null;
	
	$scope.postdata = function (bienImmobilier){
		
		$http({
			method: 'POST',
			url: 'http://localhost:8080/bienImmobilier',
			data: bienImmobilier,
			headers: {'content-Type': 'application/json'}
		}).
		error(function(data,status,headers,config){
			alert("Erreur http post : " + status);
		});
	};
	
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