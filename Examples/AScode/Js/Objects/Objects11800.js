const obj = {
  prop: 99
};

Object.freeze(obj);

obj.prop = 12;
// Error in strict mode

console.log(obj.prop);
// 99

