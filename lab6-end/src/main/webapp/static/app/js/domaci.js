var wafepaApp = angular.module('wafepaApp', []);

wafepaApp.controller('zad1Ctrl', function($scope){
	$scope.poruka="Poruka";
    $scope.dis = function () {
        if(!$scope.tekst||$scope.tekst.length==0){
            return true;
        }
        else{
            return false;
        }

    }
    $scope.obrisi = function () {
        $scope.tekst = '';
    }
});

wafepaApp.controller('zad2Ctrl', function($scope){
    $scope.izmena = function () {
        $scope.tekst2 = $scope.tekst1;
    }
});
