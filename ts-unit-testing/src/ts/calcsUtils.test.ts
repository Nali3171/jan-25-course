// Calculator 
//should add, mulitply, subtract, divide when given 2 values
// breaking down the functionality of our calc to 4 simple functions
// starting with addTwoNumbers to deal with additions




describe("Testing Calculator Functions", () =>{
    test('It should return 0 when gievn two 0s for addition and subtractions', () => {
        const result = addTwoNumbers(0, 0);
        expect(result).toBe(0);
    });

    test('It should return 10 when given 4 and 6', () => {
        const result = addTwoNumbers(4, 6);
        expect(result).toBe(10);
    });

    test('It should work with negative numbers', () => {
        const result = addTwoNumbers(-18, 6);
        expect(result).toBe(12);
    });

});