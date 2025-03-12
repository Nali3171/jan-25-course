import './style.css';


//How can we select HTML elements and manipulate them?

//querySelector - can use element selector, #id, 
const paraOne = document.querySelector('p');
const paraTwo = document.querySelector<HTMLParagraphElement>('#paragraphId');

//querySelectorAll - can use element, .class
const textPara = document.querySelector('.text');

console.log(paraOne);
console.log(textPara);

const listItems = document.querySelectorAll<HTMLElements>("li");
console.log(listItems);

const list = document.querySelector<HTMLOListElement>("#myList");
console.log(list);

//if (!null || !null || !null) {}
if(!paraOne || !paraTwo || !list) {
    throw new Error('Some elements can not br found');
}

console.log('after');


//Maniplulate the HTML content
paraOne.innerText = 'Hello';
console.log(paraOne.innerText);
console.log('tC:', paraOne.textContent);

paraTwo.textContent = 'I am a para!!! :)';

//modify styling using DOM
paraTwo.style.background = 'red';
paraOne.style.fontFamily = 'Times';

// forEach() - iterate through an array / list, applies a function to each element, but does not return anything

const allParas = document.querySelectorAll<HTMLParagraphElement>('P');
console.log(allParas);

allParas.forEach((para) => (para.style.border = '2px solid yellow'));

const LI_TOTAL = 10;
for(let i: number = 0; i< LI_TOTAL; ++i){
  list.innerHTML += `<li>Item ${i + 1}:</li>`;
}

//Event Handling and Event listeners


