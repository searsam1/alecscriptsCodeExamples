const car = {
    type : "Maserati", 
    model : "Levante", 
    color : "white",
    driving : false,
    drive : function () {
        this.driving = true; 
    }
};

console.log(car.driving)
// false

car.drive()

console.log(car.driving)
// true

