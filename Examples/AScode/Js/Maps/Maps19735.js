
const person = new Map()
person.set("firstName", "Joe")

// delete first name
person.delete("firstName", "Joe")

console.log( person.get("firstName") )
// undefined

