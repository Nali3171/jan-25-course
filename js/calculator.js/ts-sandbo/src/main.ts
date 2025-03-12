import './styles/styles.scss'

// capturing elements on the elements on the  DOM
//document.getElementById()
//document.getElementsByTagName()
//document.getElementsByClassName()

const display = document.querySelector<HTMLInputElement>('#display');
const equals = document.querySelector<HTMLButtonElement>('#equals');
const buttons = document.querySelectorAll<HTMLButtonElement>('.calculator_button');

if (!display || !equals){
  throw new Error('Some elements can not be found');
}

const registerClick = (event: Event) => {
 
     const target = event.currentTarget as HTMLButtonElement;
     
     //we want the input/display to be reset when the user clicks on AC
     if(target.innerText === "AC"){
      display.value = '';
     } else{
      
     //we need to add the value of the button to the display
     display.value += target.innerText;
};
 
buttons.forEach((button) => button.addEventListener('click', registerClick));

const handleEqualsClick = () => {
  display.value = calculate(display.value)
}

const calculate = (equation : string) => {

     const operatorMatch = equation.match(/[+\-x/]/);
     console.log(operatorMatch);

     if(!operatorMatch) {
      throw new Error('Invalid equation format');
     }
// grab the operator from the match[0]
const operator = operatorMatch[0];
// split the equation into 2 strings using the operator as a seperator, ending up wiht an array of two strongs
const [str1, str2] = equation.split(operator);
const [num1, num2] = [str1, str2].map((num) => {
  return parseFloat(num.trim());
});
let result: number;
switch(operator){
  case '+':
    result = num1 + num2;
    case '-':
    result = num1 - num2;
    case 'x':
    result = num1 * num2;
    case '/':
    result = num1 / num2;
    default: 
    throw new Error('Not a valid operator');
}

console.log(num1.length);

};

calculate('111 + 222');
calculate('111 / 222');
calculate('111 x 222');}