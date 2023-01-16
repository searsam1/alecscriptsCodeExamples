// create new person map
const person = new Map([
    ["firstName", "Joe"],
    ["lastName", "Schmit"],
    ["Address", "P. Sherman, 42 Wallaby Wa..."]
])

// delete lastName
person.delete("lastName");
console.log(person.size)
// 2
console.log(person.has("lastName"))
// false


