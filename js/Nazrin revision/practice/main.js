
// single element
console.log(document.querySelector('.container')); // picks certain element 


//mulitple element
console.log(document.querySelectorAll('.item')); // gives us the list from html

//loops
const items = document.querySelectorAll('item');

items.forEach((items) => console.log(items));


//Events
const btn = document.querySelector('.btn');
btn.addEventListener('click', (e) => {
    console.log('click');
    document.querySelector('#my-form').computedStyleMap.background = '#ccc'; // when you clikc the button it will chnage color
});


