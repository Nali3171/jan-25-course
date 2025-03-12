//TDD  - TEST DRIVEN DEVELOPMENT

import { capitalizeString, 
    filterFoodByType, 
    generateFoodHTML, 
    sortByRating,
 } from './foodUtilities';

 import { Food, FoodType } from './Food';
import foodStock from './foodData';



 //describe(name, fn) creates a block that groups together several related tests

describe("Testing CapitalizeString", () => {

    //the test(name, fn, timeout): firsr argument is test name, 2nd is function that contains the expectation to test
   
    test('should capitalize the 1st letter of a single word string', () =>{
        const output = capitalizeString("croissant");
        // when you are writing test you often need to check that values meet certain condiitons. expect 

        expect(output).toBe('Croissant');
    });

     test('should capitalize the 1st letter of a string word string', () => {
        const output = capitalizeString("burger");

        expect(output).toBe('Burger');
    });

    test('should be a string', () =>{
        const output = capitalizeString("burger");

        expect(typeof output).toBe("string");
    });
});



describe("Testing filterbyfoodtype", () => {

    test('should return all healthy food items when filtering by FoodType.HEALTHY', () =>{

        const junkFood = [
  { img: "🍕", name: "pizza", foodType: FoodType.JUNK, rating: 10 },
  { img: "🍔", name: "burger", foodType: FoodType.JUNK, rating: 7 },
  { img: "🍟", name: "fries", foodType: FoodType.JUNK, rating: 3 },
  { img: "🌭", name: "hot dog", foodType: FoodType.JUNK, rating: 3 }]
  const inputStock = foodStock
  const foodType = 'junk' as FoodType
  const output = filterFoodByType(foodType, inputStock)
  expect(output).toEqual(junkFood)
    });


test('Returns an empty array if no food matched the FoodType parameter'), () => {
    const mockData: Food[] = [
        { img: "🍕", name: "pizza", foodType: FoodType.JUNK, rating: 10 },
        { img: "🌭", name: "hot dog", foodType: FoodType.JUNK, rating: 3 },
        { img: "🍟", name: "fries", foodType: FoodType.JUNK, rating: 3 },
    ];
    const output = filterFoodByType(FoodType.HEALTHY, mockData);
    expect(output).toEqual{[]};
}

});

 //   test('', () => {});

