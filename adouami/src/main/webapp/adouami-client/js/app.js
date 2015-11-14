var urlREST = 'http://localhost:8084/todo-rest';

var appLP4 = angular.module('appLP4', ['ngRoute'])

.config(function( $routeProvider ){
    
    $routeProvider
        .when('/home', {
            templateUrl: 'templates/home.html',
            controller: 'HomeController'
        })
        .when('/config', {
            templateUrl: 'templates/config.html',
            controller: 'ConfigController'
        });
    
    
    $routeProvider.otherwise('/home');
    
});