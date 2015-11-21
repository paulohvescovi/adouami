(function( app, url ){
    'use strict';
    
    app.controller('RacaController', Controller);
    
    function Controller($scope, RacaService) {
        $scope.racas = [];
        $scope.tipos = ["GATO","CACHORRO"];
        
        $scope.loadDados = function(){
            RacaService.$all()
             .then(function( response ){
                $scope.racas = response.data;
            }).catch(function(error){
                $scope.msgError = error.data || 'Erro ao buscar racas do Servidor';
            });
        };
        
        $scope.salvarRaca = function(raca){
            RacaService.$add(raca)
             .then(function( response ){
                 $scope.racas.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar raca no servidor';
            });
        };      
        
        $scope.updateRaca = function(raca){
            RacaService.$edit(raca)
             .then(function( response ){
                 var index = $scope.racas.indexOf(raca);
                 $scope.racas.splice(index,1);
                 $scope.racas.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar raca (editar) no servidor';
            });
        };  
        
        $scope.deleteRaca = function(raca){
            RacaService.$delete(raca)
             .then(function( response ){
                 var index = $scope.racas.indexOf(raca);
                 $scope.racas.splice(index,1);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao Excluir raca no servidor';
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



