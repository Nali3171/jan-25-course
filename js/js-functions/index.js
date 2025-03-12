//functions:
//to mkae code blocks reusable through out our program - DRY - dont repreat yourself 

//self-container, parameterised, blocks of code that can be called whenever and wherever we need them trhoughout our applications
//how do we write functions?
//ES5 syntax

//functions do not have to take parameters but should have some

function logYourself(){
    console.log('hi my name is bob');
    return 1;
    //return "Hi my name is remi";
}

logYourself();

let output = logYourself();
console.log('output', output);

//[function keyword] [function name] (parameter list, ......., .....){
//    code block
// return keyword
// }

function introduceYourself(name = 'Naz', lastName = 'A'){
    return 'Hi my name is ' + name + '' + lastName;
}

const intro = introduceYourself('John');

console.log(introduceYourself('Naz', 'B'));
console.log(introduceYourself('bally'));
//console.log(introduceYourself("John")


// perimeter of a rectangle
function rectanglePerim(width, length){
    return width * 2 + length * 2;
}

const h1=56;
const w1=43;

const h2=67;
const w2=98;


console.log(rectanglePerim(h1,w1));
console.log(rectanglePerim(h2,w2));

// ES6 Syntax - Arrow function

let myFunction = () => {
    return "this is my function";
};

console.log(myFunction());
myFunction = 2;
console.log(myFunction);

//function keyword creates a reassignable variable
//const does not!

//Hoisting

function circleArea(radius) {
     return Math.PI * radius ** 2;
}

const circleInfo = (area) => {
    return `My circle is ${area} cm2` 
}
console.log(circleInfo(circleArea(10)));

//Single line function 
const studentInfo = (firstName) => `Hello, my name is ${firstName}`;

console.log(studentInfo('Ollie'));


// function scopes
//Global vs local / nested scopes


//global scope
let myVariable = "Hello";

if(true){
    //local scope
    let thing = 0
    console.log("Thing inside if:", thing);
    console.log('Inside of if', myVariable);
}

// Thing is not accessible in the global scope
console.log(myVariable);
console.log(thing);

const myFunction1 = () => {
//cannot access lastName
    const firstName = 'Bob';
    return firstName + '' + lastName;
};

const myFunction2 = () => {
//cannot access firstName
    const lastNmae = 'Dylan';
    return lastName;
};

//multi scope function

const scope1 = (scope1Para) => {

const myNumber = 123;

const scope2 = (scope2Para) => {
    const myValue = '123';

    const scope3 = (scope3Para) => {
        const myScope3Var = 'Remi';
    };
};

};

console.log(scope1('para Scope 1'));

