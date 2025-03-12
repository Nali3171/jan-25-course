# project breakdown

We want a calculator that can add / subtract / multiply / divide numbers!!

# HTML / SCSS

-   [ x] WE NEED A DISPLAY FOR THE VALUES
-   [ x] WE NEED A SET OF BUTTONS

    -   [ x] number buttons from 0 - 9
    -   [ x] operator buttons (+, -, \* x, / or symbol)
    -   [ x] Decimal (.)
    -   [ x] clear button (AC)
    -   [ x] delete DEL

-   [ x] we want the button to have spacing around them
-   [ x] the numbers be arranged together
-   [ x] operators should be on the right hand side
-   [x ] AC an DEL on the top
-   [x ] Buttons should have differnt colour as background
-   [ x] operator buttons should have different styling that the button
-   [ ] button 0 is double the width of all other buttons

## TypeScript logic

-   [ ] event listeners will need to look out for (clicks)
    -   [ ] listen for click on numbers, dot, operator
    -   [ ] listen for click on AC => should remove everythng from display
    -   [ ] listen for click on (=) => should trigger the calculation with the values that were inputted in the display
    -   [ ] listen for click on DEL => removes the last char/value from the display

//elementToTarget.addEventListener("click", handler)//

-   [ ] we need a function that handles (= click)i.e. the calculation of our operation
    -   [ ] have one handleEquals()
    -   [ ] have one calculate()
    -   [ ] when dividing by 0 we want to return "Not a number"
-   [ ] we need a function that handles clicks on numbers, dot, operators (handleClick, registerClick)
    -   [ ] we will not allow 1 decimal point to be added in the same number
    -   [ ] set up a limit on the max number length in display
    -   [ ] not allowing 2 operators in a row
    -   [ ] we woll need to handle a fresh input after the equal has been pressed
-   [ ] all my functions should handle error state
