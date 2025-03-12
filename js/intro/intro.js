console.log('Hello');


console.log(typeof 15)
//variable

//let variable
let score = 10;
console.log(score);
score = 100;
console.log(score);

//const variable
const firstName = 'Nazrin';
console.log(firstName);

console.log('Hello');

//var variable
//number data type
var number = 1;
number =2;
console.log(number);

//operators 
let value = 128/ 2;
value = value * 8;
value = value + 1024;
console.log(value);

value -= 512;
value **= 2;
console.log(value);

console.log(value++);
console.log(++value);
console.log(--value);

// modulo operator
console.log(9%3);

//using operators with strings

const firstName2 = 'bob';
const lastName = 'dylan';

const fullName = firstName2 + '' + lastName;
console.log(fullName);

//boolean and boolean expressions

console.log('GT', 5 > 3);
console.log('LT', 5 < 3);
console.log('GTE', 5 >= 3);
console.log('LTE', 3 <= 5);

//== simple or NON TYPED equality
console.log('EQ', 7 == 7);
console.log('EQ: Typed', 7 == 7);

console.log('NEQ', 7 != 7);
console.log('NEQ', 7 != 6);
console.log('NEQ: Typed', 7 !== '7');

console.log('one' > 'three');
console.log('three' > 'one');

//multiple expression handling
//&& - AND
//|| - OR

console.log("AND", 3 < 5 && 6 < 8);
console.log("AND", 3 < 5 && 16 < 8);

console.log( 'OR', 16 < 8 || 3 < 5);


// true && (true) = >true
console.log(!(5 < 1));

// Falsey values
// false
// 0
//  NaN
// undefined
// null
// ''

let x = 5;
console.log('Here:', x || 5 < 6); //true but returns 5
console.log(x && 5 < 6); //returns true
console.log(!x && 5 < 6); //false

let myString = 'my String';
console.log(!myString);
console.log(myString && true); //truthy expression


