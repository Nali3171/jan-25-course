import './style.css'

//HTTP => HyperText Transfer protocol.
//Components of HTTP:
//.METHOD, .URL, .Headers, .Body

//CRUD

//CREATE (POST, PUT)
//READ (GET)
//UPDATE(PUT, PATCH)
//DELETE(DELETE)

//STATUS CODE:
//you can search up status codes to see how good or bad it is 

// Synchronous v. asynchronous programming

//synchronous - js executes code from top to bottom, left to right
//asynchronous - code that can wait in the background until it resolves - NON BLOCKING CODE

// API calls 
//SET IN AN ASYNC WAY
console.log('GET REQUEST');
setTimeout(() => {
  console.log("API RESPONES")
}, 3000);

console.log('DOING EXTRA PROCESSING WHILE THE SERVER IS SENDING ITS RESPONSE');

const btn = document.querySelector<HTMLButtonElement>


const getRandomDogImg = async () => {
  //promise

  //we need to await on the fetch/Get to resolve toa promise. fetch() returns a promise that resolves to a response object.
  const response = await fetch('url');

  //data response
  // although method is named .json() it converts JSON data to a JS object
  const data = await response.json();

  //console.log(data);
  return data;
};


btn.addEventListener('click', handleDogImgBtn);
