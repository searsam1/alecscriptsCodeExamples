const target = { a: 3, b: 4 };
const source = { b: 7, c: 1 };

const combinedObj = Object.assign(target, source);

console.log(target);
// {a: 3, b: 7, c: 1}

console.log(combinedObj === target);
// true

