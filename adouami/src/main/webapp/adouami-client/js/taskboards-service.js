(function( app, url){
    'use strict';
    app.service('TaskBoardService',Service);
    
    function Service($http){
        function getAll(){
            return $http.get( url+'/taskboards');
        }
        function add(taskboard){
            return $http.post( url+'/taskboards',taskboard);
        }
        function edit(taskboard){
            return $http.post( url+'/taskboards/'+taskboard.id, taskboard);
        }
        function remove(taskboard){
            return $http.delete( url+'/taskboards/'+taskboard.id);
        }
        
        return ({
            $all: getAll,
            $add: add,
            $edit: edit,
            $delete: remove
        })
    };
})( appLP4, urlREST);