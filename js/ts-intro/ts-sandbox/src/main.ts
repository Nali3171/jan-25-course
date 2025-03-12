import './style.css';


// INFERED TYPES
//const firstName = 'Remi';
//console.log(typeof firstName);


// EXPLICIT TYPING
//const myFavNumber : number = 8000;

//let isABoolean = true;

// isABoolean = 2; even let variables implicitly types will stay the same type forever

//isABoolean = 2;
//console.log(typeof isABoolean);


//const nums: number[] = [1, 2 ,3, 4];
//console.log(nums);
//nums.push('2');
//console.log(nums);

//const arrayToBeDefined: unknown[] = [1, 'Hello', true];
//arrayToBeDefined.push(null);

//Accepting multiple types inside of an arrays
//const unionArray : (null | undefined )[] = [null, undefined];

//const emptyArr: number[] = [];
//emptyArr[0] = 'Hello';

//syntax for loop
//for( let i : number = 0; i < nums.length; i++){
  //variables inside pf loop will also have defined types
 // console.log(nums[i]);
//}

// using AS keyword
//we have an array of numbers and we want a new array with all the values in the original used to build a info string about local temperatures

//const temps = [12, 32, 23];
//const infoTemps = ["it is 12c", ....]

//const info = temps.map((num) => {
 // return `It is ${num}c`;
//}); as string[];

//const info2 = (<string[]>temps.map((num) => {
 // return `It is ${num}c`;
//})); as string[];

//const info3: string[] = temps.map((num) => {
 // return `It is ${num}c`;
//}); 


//Typing functions
//function lowerCaseMyWords(word : string){
 // return word.toLowerCase();
//}
//console.log(lowerCaseMyWords('HELLO'));



//CHALLENGE:
//challenge: create a function  that will generate an array of five random numbers between 1 and n.
function generateRandomNumbers(maxValue : number[]) ; {
const numbers : number[] = [];

for (let i : number = 0; i < 5 ; i++) {
    numbers.push(Math.floor(Math.random() * maxValue);

}

return numbers;

}


//how do we select HTML elements and manipulate them?
const paraOne = document.querySelector("p")

