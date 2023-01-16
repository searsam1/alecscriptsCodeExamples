const object1 = {
  k1: 'v1',
  k2: 'v2',
  k3: 'v3'
};

Object.seal(object1)

// wont work because of seal
delete object1.k1;

console.log(object1.k1)
// v1 (delete didn't work)

