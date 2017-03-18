(function(angular) {
  angular.module("testingmeApp.controllers", []);
  angular.module("testingmeApp.services", []);
  angular.module("testingmeApp", ["ngResource", "testingmeApp.controllers", "testingmeApp.services"]);
}(angular));