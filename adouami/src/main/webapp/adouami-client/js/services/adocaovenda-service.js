(function( app, url){
    'use strict';
    app.service('AdocaoVendaService',Service);
    
    function Service($http){
        function getAll(){
            return $http.get( url+'/adocoesvenda');
        }
        function add(adocaovenda){
            return $http.post( url+'/adocoesvenda',adocaovenda);
        }
        
        function edit(adocaovenda){
            return $http.post( url+'/adocoesvenda/'+adocaovenda.id,adocaovenda);
        }
        function remove(adocaovenda){
            return $http.delete( url+'/adocoesvenda',adocaovenda);
        }
        
        return ({
            $all: getAll,
            $add: add,
            $edit: edit,
            $delete: remove
        })
    };
})( appAdouami, urlREST);