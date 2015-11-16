var urlREST = 'http://localhost:8080';

var appAdouami = angular.module('appAdouami', ['ngRoute'])

.config(function( $routeProvider ){
    
    $routeProvider
        .when('/estados', {
            templateUrl: 'templates/estado.html',
            controller: 'EstadoController'
        })
        .when('/pessoas', {
            templateUrl: 'templates/pessoa.html',
            controller: 'PessoaController'
        })
        .when('/cidades', {
            templateUrl: 'templates/cidade.html',
            controller: 'CidadeController'
        });
    
    
    $routeProvider.otherwise('/estados');
    
});