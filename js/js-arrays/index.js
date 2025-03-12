//JS Arrays
// they are a collection of values related to eachother, contained into a single data structure

const student1 = "Simon";
const student2 = "Carla";
const student3 = "Nazrin";

console.log(student1);
console.log(student2);
console.log(student3);

//lets do an array to make the example above mre simple

const students = ["Simon", "Carla", "Nazrin"];
console.log(students);
console.log(students[0]); //square bracket notation output:simon
console.log(students[2]); //output:Nazrin
console.log(students[3]); // outout- undefined as there is no student at index 3
console.log(students.at(-1)); // gives last index it reverses - Nazrin
console.log(students[students.length - 1]); //gives last index - Nazrin

//Index starts at 0 - off by one compar to the length of the array
//array.length - 1 === last index

// Declaring an empty Array
const emptyArray = [];
console.log(emptyArray);


//prefill Array with values using the Array constructor
const withCapaity = new Array(5).fill(0);
console.log(withCapaity);
//output - [0, 0, 0, 0, 0]

//Adding items/elements

//array.push()
const newLength = emptyArray.push("Adil");
console.log(newLength);
console.log(emptyArray);

//array.unshift() - adds at the beginning
emptyArray.unshift("Lola");
console.log(emptyArray);

//removing items from array
//array.pop()
const item = emptyArray.pop();
console.log(emptyArray, item);

// array.shift() - removes from the begining
const firstItem = emptyArray.shift();
console.log(emptyArray, firstItem);

//putting 2 arrays together
//array.concat()
const newStudentsArr = students.concat(emptyArray);
console.log(newStudentsArr);

//mdexOf - tells you the index of your array item
console.log(newStudentsArr.indexOf('Simon')); //output 0 whihc is firt index
console.log(newStudentsArr.indexOf('Remi')); //output - -1 because doesnt exist in array

//includes() - true or flase
console.log(newStudentsArr.includes('Simon')); //output is true


let x = '2';
let y = x;
console.log(y);
y = 'Something else';
console.log(y);
console.log(x);

const arr1 = [1, 2, 3];
const copyArr = arr1;

console.log(copyArr);
copyArr.push(4);
// Both arr1 and copyArr points to the same array in memory
console.log(copyArr);
console.log(arr1);

//Making a deep copy of
const deepCopyArr = [...arr1];
deepCopyArr.push(5, 6, 7, 8);
console.log(deepCopyArr);
console.log(arr1);


