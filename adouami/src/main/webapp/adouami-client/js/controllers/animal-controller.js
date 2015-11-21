(function( app, url ){
    'use strict';
    
    app.controller('AnimalController', Controller);
    
    function Controller($scope, AnimalService) {
        $scope.animais = [];
        
        $scope.loadDados = function(){
            AnimalService.$all()
             .then(function( response ){
                $scope.animais = response.data;
            }).catch(function(error){
                $scope.msgError = error.data || 'Erro ao buscar animais do Servidor';
            });
        };
        
        $scope.salvarAnimal = function(animal){
            AnimalService.$add(animal)
             .then(function( response ){
                 $scope.animais.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar animal no servidor';
            });
        };      
        
        $scope.updateAnimal = function(animal){
            AnimalService.$edit(animal)
             .then(function( response ){
                 var index = $scope.animais.indexOf(animal);
                 $scope.animais.splice(index,1);
                 $scope.animais.push(response.data);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar animal (editar) no servidor';
            });
        };  
        
        $scope.deleteAnimal = function(animal){
            AnimalService.$delete(animal)
             .then(function( response ){
                 var index = $scope.animais.indexOf(animal);
                 $scope.animais.splice(index,1);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao Excluir animal no servidor';
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



