(function( app, url){
    'use strict';
    app.service('AnimalService',Service);
    
    function Service($http){
        function getAll(){
            return $http.get( url+'/animais');
        }
        function add(animal){
            animal.id = null;
            return $http.post( url+'/animais',animal);
        }
        
        function edit(animal){
            return $http.post( url+'/animais/'+animal.id, animal);
        }
        function remove(animal){
            return $http.delete( url+'/animais/'+animal.id);
        }
        
        return ({
            $all: getAll,
            $add: add,
            $edit: edit,
            $delete: remove
        })
    };
})( appAdouami, urlREST);