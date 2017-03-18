(function(angular) {
  var AppController = function($scope, Ave) {
    Ave.query(function(response) {
      $scope.aves = response ? response : [];
    });

    $scope.addItem = function(dscomun, dscientifico) {
      new Ave({
          dsnombre_comun: dscomun,
          dsnombre_cientifico: dscientifico
      }).$save(function(ave) {
        $scope.aves.push(ave);
      });
      $scope.newave = "";
    };
    
    $scope.updateItem = function(ave) {
      ave.$update();
    };
    
    $scope.deleteItem = function(ave) {
      ave.$remove(function() {
        $scope.aves.splice($scope.aves.indexOf(ave), 1);
      });
    };
  };
  
  AppController.$inject = ['$scope', 'Ave'];
  angular.module("testingmeApp.controllers").controller("AppController", AppController);
}(angular));