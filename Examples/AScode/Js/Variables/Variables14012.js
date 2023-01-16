// define MY_NUM as a constant and give it the value 99
const MY_NUM = 99;

// error - Uncaught TypeError: Assignment to constant variable.
MY_NUM = 20;

// MY_NUM is 99
console.log("my favorite number is: " + MY_NUM);

// Uncaught SyntaxError: Identifier 'MY_NUM' has already been declared
const MY_NUM = 20;

// name MY_NUM is reserved for constant, this will fail too
var MY_NUM = 20;

// throws errorname MY_NUM is reserved for constant, this will fail too
let MY_NUM = 20;


