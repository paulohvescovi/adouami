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
        .when('/racas', {
            templateUrl: 'templates/raca.html',
            controller: 'RacaController'
        })
        .when('/animais', {
            templateUrl: 'templates/animal.html',
            controller: 'AnimalController'
        })
        .when('/adocoesvenda', {
            templateUrl: 'templates/adocao-venda.html',
            controller: 'AdocaoVendaController'
        })
        .when('/cidades', {
            templateUrl: 'templates/cidade.html',
            controller: 'CidadeController'
        });
    
    
    $routeProvider.otherwise('/estados');
    
});