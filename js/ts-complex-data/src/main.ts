import './style.css'


// JSON - JavaScript Object Notation

//ts-challenge repository
//Create a web page with at least one button and one container element
//When the button is pressed, loop through the companies array, and for each object inside the array, 
// render a card that contains all the information from the data.
 import { companies } from './data';


 const renderBtn = document.querySelector<HTMLButtonElement>('#renderCompanies');
 const container = document.querySelector<HTMLDivElement>('#container');

 console.log(renderBtn);

if (!renderBtn || !container) {
    throw new Error('One of the elements is not defined');
}
 // loop through the array
 //render data fir each of the companies (each of the keys should give us one value string or number)

 const handleRender = () => {
// for each object inside the array, render a card that contains all the information from the data.

    container.innerHTML = "";

    companies.forEach(({ name, industry, start, end }) => {
        container.innerHTML += 
        `<div>
        <h2>${name}</h2>
        <p>${industry}</p>
        <p>${start}</p>
        <p>${end}</p>
        </div>`;
    });
 };

 renderBtn.addEventListener('click', handleRender);


 

