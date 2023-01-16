cars.sort(function(a, b){
  let x = a.type.toLowerCase();
  let y = b.type.toLowerCase();
  if (x < y) 
    {return -1;}
  if (x > y) 
    {return 1;}
  return 0;
});

// [{type: "Audi", year: 2020}, 
// {type: "Benz", year: 2011}, 
// {type: "Ferrari", year: 2019}]

