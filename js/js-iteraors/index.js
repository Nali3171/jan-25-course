const nums = [1, 2, 3, 4, 5];

// We want a new array with eaxh value from the original array incremented by one

const incremented = [];
for(let i = 0; i < nums.length; i++) {
    incremented.push(nums[i] + 1);
}

console.log("Incremented with for loop:", incremented);


// new array which squares each number in list
const squared = [];
for(let i = 0; i < nums.length; ++i) {
    squared.push(nums[i] ** 2);
}

console.log("Squared with for loop:", squared);


//map()
// implementaion of map method

const map = (arr, func) => {
    const newArr = [];

    for(let i = 0; i < arr.length; i++) {
        const currentItem = arr[i];
        const newValue = func(currentItem);
        newArr.push(newValue);
    }
    return newArr;
}



// using JS library map method




//Typescript
//just like css and scss
// TS is built on JS
// self-documenting code, better for large projects
// const favouriteNumber: number = 5; - typical 
//const isRetired: boolean = false;
//let message: string = "hello";

//arrays in TS;
// const names: string[] = ["Naz", "Ali"];
//const numbers: number[] = [2, 4, 6, 8];
//casting is a process of orriding a type
