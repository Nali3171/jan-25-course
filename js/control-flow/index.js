// Control Flow
// if / else statements

//if([expression to evaluate]){
//block of code to execute when expression is true
//} else {
// block of code to execute when all previous expressions were false
//}

const correctPassword = "qwertyuiop";
let input = "qwertyuiop";
input = 'polo';

if (input === correctPassword){
    console.log('welcome');
}

else if (input === ''){
    console.log('please input password');
}

else{
     console.log('acess denied')
}

//switch

const errorCode = 3

switch (errorCode) {
    case 0: 
    console.log("success");
    break;
    case 1: 
    console.log("try again");
    break;
    case 2: 
    console.log("disk error");
    break;
    case 3: 
    console.log("command not recognised");
    break;
    default:
        console.log("error not valid");
}


// Ternary operators - [expression to evaluate] ? [value to return if true] : [value to return if false]

const score = 10;
const target = 15;

const qualificationstatus = score > target ? "You are qualified" : "you have not qualified";
console.log(qualificationstatus)