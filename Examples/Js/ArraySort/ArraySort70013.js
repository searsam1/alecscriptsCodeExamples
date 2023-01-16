const cars = [
  {type:"Ferrari", year:2019},
  {type:"Audi", year:2020},
  {type:"Benz", year:2011}
];

cars.sort(function(a, b){return a.year - b.year});

// [
// {type: "Benz", year: 2011}, 
// {type: "Ferrari", year: 2019}, 
// {type: "Audi", year: 2020}
// ]

