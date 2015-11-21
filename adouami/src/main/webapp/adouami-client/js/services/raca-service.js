(function( app, url){
    'use strict';
    app.service('RacaService',Service);
    
    function Service($http){
        function getAll(){
            return $http.get( url+'/racas');
        }
        function add(raca){
            raca.id = null;
            return $http.post( url+'/racas',raca);
        }
        
        function edit(raca){
            return $http.post( url+'/racas/'+raca.id, raca);
        }
        function remove(raca){
            return $http.delete( url+'/racas/'+raca.id);
        }
        
        return ({
            $all: getAll,
            $add: add,
            $edit: edit,
            $delete: remove
        })
    };
})( appAdouami, urlREST);