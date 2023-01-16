// shorter example for simplicity 
const person = new Map([
    ["firstName", "Joe"], 
])
for (i of person.entries())
    {
        k = i[0]; v = i[1]; 
        console.log(k); 
        console.log(v);
    }
// firstName
// Joe

