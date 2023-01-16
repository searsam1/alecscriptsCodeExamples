// List all entries
const person = new Map([
    ["firstName", "Joe"],
    ["lastName", "Schmit"],
    ["Address", "P. Sherman, 42 Wallaby Wa..."]
])

function printKeyValue(v, k){
    console.log(k + ": " + v)
}

// use predefined printKeyValue function
person.forEach(printKeyValue)

// firstName: Joe
// lastName: Schmit
// Address: P. Sherman, 42 Wallaby Wa...

