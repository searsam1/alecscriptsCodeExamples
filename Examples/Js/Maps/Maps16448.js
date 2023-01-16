// List all entries
const person = new Map([
    ["firstName", "Joe"],
    ["lastName", "Schmit"],
    ["Address", "P. Sherman, 42 Wallaby Wa..."]
])
person.forEach (function(value, key) {
    console.log(key + ": " + value)
})

