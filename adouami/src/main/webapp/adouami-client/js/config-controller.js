(function( app, url ){
    'use strict';
    
    app.controller('ConfigController', Controller);
    
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
        
        $scope.delTask = function(taskboard){
            TaskBoardService.$delete(taskboard)
                 .then(function( response ){
                    var index = $scope.taskboards.indexOf(taskboard);
                //1 no final para confirmar exclusão
                    $scope.taskboards.splice(index,1);
                }).catch(function(error){
                    $scope.msgError = error.data || 'Falha de comunicação';
                });
        };
        
        $scope.loadDados();
        
    };
    
})( appLP4, urlREST );



