(function( app, url ){
    'use strict';
    
    app.controller('EstadoController', Controller);
    
    function Controller($scope, EstadoService) {
        $scope.estados = [];
        
        $scope.loadDados = function(){
            EstadoService.$all()
             .then(function( response ){
                $scope.estados = response.data;
            }).catch(function(error){
                $scope.msgError = error.data || 'Erro ao buscar estados do Servidor';
            });
        };
        
        $scope.salvarEstado = function(estado){
            EstadoService.$add(estado)
             .then(function( response ){
                 $scope.estados.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar estado no servidor';
            });
        };      
        
        $scope.updateEstado = function(estado){
            EstadoService.$edit(estado)
             .then(function( response ){
                 var index = $scope.estados.indexOf(estado);
                 $scope.estados.splice(index,1);
                 $scope.estados.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar estado (editar) no servidor';
            });
        };  
        
        $scope.deleteEstado = function(estado){
            EstadoService.$delete(estado)
             .then(function( response ){
                 var index = $scope.estados.indexOf(estado);
                 $scope.estados.splice(index,1);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao Excluir estado no servidor';
            });
        };  
        
        $scope.loadDados();
        
        //Verifica se está selecionado
        $scope.isSelecionado = function(projetos) {
            return projetos.some(function (projeto) {
                return projeto.selecionado;    
            });
        };

        //Ordenar colunas
        $scope.ordernarPor = function(campo) {
            $scope.criterioOrdenacao = campo;
            $scope.direcaoOrdenacao = !$scope.direcaoOrdenacao;
        };
    };
    
})( appAdouami, urlREST );



