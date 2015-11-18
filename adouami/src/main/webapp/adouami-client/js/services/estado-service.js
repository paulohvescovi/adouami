(function( app, url){
    'use strict';
    app.service('EstadoService',Service);
    
    function Service($http){
        function getAll(){
            return $http.get( url+'/estados');
        }
        function add(estado){
            estado.id = null;
            return $http.post( url+'/estados',estado);
        }
        
        function edit(estado){
            return $http.post( url+'/estados/'+estado.id, estado);
        }
        function remove(estado){
            return $http.delete( url+'/estados/'+estado.id);
        }
        
        return ({
            $all: getAll,
            $add: add,
            $edit: edit,
            $delete: remove
        })
    };
})( appAdouami, urlREST);