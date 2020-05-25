

const path = require('path');
let strPath= path.resolve(__dirname, 'dist');
console.log(__dirname);
console.log(strPath);


let x = {};
console.log(x['aa'] === undefined);


let v1 = parseInt(null);
console.log(v1);


let v2 = parseInt(undefined);
console.log(v2);

let v3 = parseInt(1);
console.log(v3);

console.log(NaN > 3);
