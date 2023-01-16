// unnamed
let Person = class {
  constructor(height, age) {
    this.height = height;
    this.age = age;
  }
};
console.log(Person.name); // "Person"

// named
Person = class Person2 {
  constructor(height, age) {
    this.height = height;
    this.age = age;
  }
};
console.log(Person.name); // "Person2"

console.log(Person2.name);
// ReferenceError: Can't find variable: Person2


