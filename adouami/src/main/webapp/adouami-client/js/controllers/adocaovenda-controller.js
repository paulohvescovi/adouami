(function( app, url ){
    'use strict';
    
    app.controller('AdocaoVendaController', Controller);
    
    function Controller($scope, AdocaoVendaService) {
        $scope.adocoesvenda = [];
        $scope.tiposdocumentos = ["VENDA","ADOCAO"]
        
        $scope.loadDados = function(){
            AdocaoVendaService.$all()
             .then(function( response ){
                $scope.adocoesvenda = response.data;
            }).catch(function(error){
                $scope.msgError = error.data || 'Erro ao buscar adocoesvenda do Servidor';
            });
        };
        
        $scope.salvarAdocaoVenda = function(adocaovenda){
            if (adocaovenda.id != null){
                $scope.updateAdocaoVenda(adocaovenda);
                return;
            }
            AdocaoVendaService.$add(adocaovenda)
             .then(function( response ){
                 $scope.adocoesvenda.push(response.data);
                $scope.adocaovenda = null;
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar adocaovenda no servidor';
            });
        };      
        
        $scope.updateAdocaoVenda = function(adocaovenda){
            AdocaoVendaService.$edit(adocaovenda)
             .then(function( response ){
                 var index = $scope.adocoesvenda.indexOf(adocaovenda);
                 $scope.adocoesvenda.splice(index,1);
                 $scope.adocoesvenda.push(response.data);
                $scope.adocaovenda = null;
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao gravar adocaovenda (editar) no servidor';
            });
        };  
        
        $scope.deleteAdocaoVenda = function(adocaovenda){
            AdocaoVendaService.$delete(adocaovenda)
             .then(function( response ){
                 var index = $scope.adocoesvenda.indexOf(adocaovenda);
                 $scope.adocoesvenda.splice(index,1);
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha ao Excluir adocaovenda no servidor';
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
        $scope.editarAdocaoVenda = function(adocaovenda) {
            $scope.adocaovenda = adocaovenda;
        };        
    };
    
})( appAdouami, urlREST );



