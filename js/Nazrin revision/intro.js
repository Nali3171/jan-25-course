console.log('Hello World');

//let, const 

//you can reassign to this variable
let age = 30;
age = 23;
console.log(age);

//cannot reassign const
const newAge = 50
console.log(newAge);


//with data types(string, numbers...) 
// we can use typeOf to identify the data type


//Strings
// concatenation (Template string)
const name = 'John';
const oldAge = 23;

console.log(`My name is ${name} and i am ${oldAge}`);


//length

const s = 'nazrin ali';

console.log(s.length);

 //to change to upppercase, make sure you put a empty brackets after

 console.log(s.toUpperCase());


 //substring method to get a certain part of the code
 console.log(s.substring(0, 5)); //output: nazri


 // to split into arrays use .split
 console.log(s.split('')); //output - ['n', 'a', 'z' ....]

 //more common use is to make tags into array
 const f= 'tech. comp, it, code';
 console.log(f.split(', ')); //output - ['tech. comp', 'it', 'code']

 //Arrays - variables that hold multiple values
//best method for arrays below (any data types together is fine)
 const fruits = ['apples', 'oranges', 'pears', 10, true];
 console.log(fruits[1]);
//to acess a certain value in square brackets add the index
fruits.push('mangos');
console.log(fruits); //outpu-['apples', 'oranges', 'pears', 10, true, 'mangos']
fruits.unshift('strawberries');
console.log(fruits); // puts strawberries at front of array



//Object Literals
const person = {
    firstName: 'Nazrin',
    lastName: 'Ali',
    Agger: 23,
    hobbies: ['musics', 'reading', 'gym'],
    address: {
        street: '4 main st',
        city: 'london'
}
}
console.log(person.hobbies[1]); //output - reading
console.log(person.address.city); //output - london

//you can also add features
person.email = 'na31@gmail.com';
console.log(person); //output - firstName: 'Nazrin', lastName: 'Ali', Agger: 23, hobbies: Array(3), address: {…}, …}


// another example with arrays of objects
const todos = [
{
    id: 1,
    text: 'Take out trash',
    isCompleted: true
},

{
    id: 2,
    text: 'meeting with boss',
    isCompleted: true
},

{
    id: 1,
    text: 'dentist appt',
    isCompleted: true
}
];
console.log(todos[1].text);

//loops IMPORTANT 
// FOR loops - 3 parameters

for (let i = 1; i <= 10; i++) {
// the code in here will loop and run until the condition is met
console.log(i); // output - 1-10 on seperate lines
}

// loop through arrays

const todose = [
{
    id: 1,
    text: 'Take out trash',
    isCompleted: true
},

{
    id: 2,
    text: 'meeting with boss',
    isCompleted: true
},

{
    id: 1,
    text: 'dentist appt',
    isCompleted: true
}
];

for (let i = 0; i < todose.length; i++) {
console.log(todose[i].text);
}
// each text prints


//what is a for of loop?
// for(let todo of todos) {
//console.log(todo.text );} 
//after let name whatever 

//forEach, map, filter
//todose.forEach(function(todo){
//console.log(todo.text);
//});

// cost todoText = todos.map(function(todo){
// retunr todo.text;
//});
// output - array of the text [......,.....,...]

 //object constructors

 //constructor function
 function Person(firstName, lastName, dob){
    this.firsName = firstName;
    this.lastName = lastName;
    this.dob = dob;
 }

