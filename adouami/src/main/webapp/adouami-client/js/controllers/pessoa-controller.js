(function( app, url ){
    'use strict';
    
    app.controller('PessoaController', Controller);
    
    function Controller($scope, PessoaService) {
        $scope.pessoas = [];
        
        $scope.loadDados = function(){
            PessoaService.$all()
             .then(function( response ){
                $scope.pessoas = response.data;
            }).catch(function(error){
                $scope.msgError = error.data || 'Erro ao buscar pessoas do Servidor';
            });
        };
        
        $scope.salvarPessoa = function(pessoa){
            PessoaService.$add(pessoa)
             .then(function( response ){
                 $scope.pessoas.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar pessoa no servidor';
            });
        };      
        
        $scope.updatePessoa = function(pessoa){
            PessoaService.$edit(pessoa)
             .then(function( response ){
                 var index = $scope.pessoas.indexOf(pessoa);
                 $scope.pessoas.splice(index,1);
                 $scope.pessoas.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar pessoa (editar) no servidor';
            });
        };  
        
        $scope.deletePessoa = function(pessoa){
            PessoaService.$delete(pessoa)
             .then(function( response ){
                 var index = $scope.pessoas.indexOf(pessoa);
                 $scope.pessoas.splice(index,1);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao Excluir pessoa no servidor';
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

        //Verifica se está selecionado
        $scope.showDialog = function(pessoa) {
            $scope.pessoa = pessoa;
            $scope.showModal = true;
        };
            
        
    };
    
})( appAdouami, urlREST );



