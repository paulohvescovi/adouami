(function( app, url){
    'use strict';
    app.service('PessoaService',Service);
    
    function Service($http){
        function getAll(){
            return $http.get( url+'/pessoas');
        }
        function add(pessoa){
            pessoa.id = null;
            return $http.post( url+'/pessoas',pessoa);
        }
        
        function edit(pessoa){
            return $http.post( url+'/pessoas/'+pessoa.id,pessoa);
        }
        function remove(pessoa){
            return $http.delete( url+'/pessoas',pessoa);
        }
        
        return ({
            $all: getAll,
            $add: add,
            $edit: edit,
            $delete: remove
        })
    };
})( appAdouami, urlREST);