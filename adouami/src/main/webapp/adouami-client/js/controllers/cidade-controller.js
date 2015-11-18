(function( app, url ){
    'use strict';
    
    app.controller('CidadeController', Controller);
    
    function Controller($scope, CidadeService) {
        $scope.cidades = [];
        
        $scope.loadDados = function(){
            CidadeService.$all()
             .then(function( response ){
                $scope.cidades = response.data;
            }).catch(function(error){
                $scope.msgError = error.data || 'Erro ao buscar cidades do Servidor';
            });
        };
        
        $scope.salvarCidade = function(cidade){
            CidadeService.$add(cidade)
             .then(function( response ){
                 $scope.cidades.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar cidade no servidor';
            });
        };      
        
        $scope.updateCidade = function(cidade){
            CidadeService.$edit(cidade)
             .then(function( response ){
                 var index = $scope.cidades.indexOf(cidade);
                 $scope.cidades.splice(index,1);
                 $scope.cidades.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar cidade (editar) no servidor';
            });
        };  
        
        $scope.deleteCidade = function(cidade){
            CidadeService.$delete(cidade)
             .then(function( response ){
                 var index = $scope.cidades.indexOf(cidade);
                 $scope.cidades.splice(index,1);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao Excluir cidade no servidor';
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



