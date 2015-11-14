(function( app, url ){
    'use strict';
    
    app.controller('HomeController', Controller);
    
    function Controller($scope, TaskBoardService) {
        $scope.taskboards = [];
        
        $scope.loadDados = function(){
            TaskBoardService.$all()
             .then(function( response ){
                $scope.taskboards = response.data.data;
            }).catch(function(error){
                $scope.msgError = error.data || 'Falha de comunicação';
            });
        };
        $scope.loadDados();
    };
    
})( appLP4, urlREST );



