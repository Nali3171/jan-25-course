//Loops
//A way of represening a set of code with start point, an end point and way to join the two

// FOR loops (For...in loop)

// [for reserved keyword] (loop start position; finish condition(test runs until condiiton becomes flase); iteration(eg:i++ means increase by 1)){
//    block of code to execute
// }


for (let i = 0; i < 3; ++i){
    console.log(`The number is ${i}`);
}


//INDEX - in strings

const word = 'automatically';

for (let index = 0; index < word.length ; ++index) {
    console.log(word.charAt(index));
}

// CHALLENGE

function sum(n) {
    let total = 0 ;

    for (let i = 1; i <= n; i++){
        total += i;
    }
    return total;
}

console.log(sum(10));



// WHILE loops
// used wehn you want to repeat a block of code s long as a condition is true
// you dont always know how many times you need to loop 
// loop keeps running until condiiton becomes false
// sructure:
// while (condition){ code to be executed}



//example of while code

let i = 0;

while (i < 5) {
    console.log(i);
    i++;
}





//JS loops challenges


//challenge 1
const sumOfOddNumbers2(n) {
    let counter = 0;
    let totalOddSum = 0;

    for (let i = 1; counter < n; i += 2){
        totalOddSum += i;
        counter++;
    }
    return totalOddSum;
};

console.log(sumOfOddNumbers2(5)); // Output: 25 (1 + 3 + 5 + 7 + 9)
console.log(sumOfOddNumber2(6));

//challenge 2
function reverseDigits = (num) => {
    let = numStr = num.toString();
    let reverStr = "";
    console.log(numStr.;length);

    for(let i = numStr.length - 1; i >= 0; --i){
        console.log(`Char index: ${i}, num: ${numStr[i]}`);
        reverStr += numStr[i];
    }
    return parseInt(reverStr);
}

console.log(reverseDigits(12345)); 



//Challenge 5 

const isPrime = (num) => {
    let counter = 0 
    if (num === 1) {
        return false;
    }
    for (let i = 0, i <= num; ++i){
        if (num % i === 0) {
            counter++;
            if (counter > 2) return false;
        }
    }
    return true;
};

console.log(isPrime(7)); // Output: true
console.log(isPrime(10)); // Output: false
console.log(isPrime(2)); // Output: true
console.log(isPrime(1)); // Output: false