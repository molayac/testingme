(function(angular) {
  var AveFactory = function($resource) {
    return $resource('/aves/:id', {
      id: '@id'
    }, {
      update: {
        method: "PUT"
      },
      remove: {
        method: "DELETE"
      }
    });
  };
  
  AveFactory.$inject = ['$resource'];
  angular.module("testingmeApp.services").factory("Ave", AveFactory);
}(angular));