(function( app, url){
    'use strict';
    app.service('CidadeService',Service);
    
    function Service($http){
        function getAll(){
            return $http.get( url+'/cidades');
        }
        function add(cidade){
            cidade.id = null;
            return $http.post( url+'/cidades',cidade);
        }
        
        function edit(cidade){
            return $http.post( url+'/cidades/'+cidade.id, cidade);
        }
        function remove(cidade){
            return $http.delete( url+'/cidades/'+cidade.id);
        }
        
        return ({
            $all: getAll,
            $add: add,
            $edit: edit,
            $delete: remove
        })
    };
})( appAdouami, urlREST);