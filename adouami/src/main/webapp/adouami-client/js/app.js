var urlREST = 'http://localhost:8080';

var appAdouami = angular.module('appAdouami', ['ngRoute'])

.config(function( $routeProvider ){
    
    $routeProvider
        .when('/estados', {
            templateUrl: 'templates/estado.html',
            controller: 'EstadoController'
        });
    
    
    $routeProvider.otherwise('/estados');
    
});