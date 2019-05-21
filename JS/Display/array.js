var cars = ["Audi", "Volvo", "BMW"];
console.log(cars[0]);

//Arrays are a special type of objects. The typeof operator in JavaScript returns "object" for arrays.

var person = ["John", "Doe", 46];

var x = cars.length;
console.log(x);

var y=cars.sort();
console.log(y);

//adding element to array
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.push("Lemon");  
console.log(fruits);

//JavaScript does not support arrays with named indexes.

//merge

var myGirls = ["Cecilie", "Lone"];
var myBoys = ["Emil", "Tobias", "Linus"];
var myChildren = myGirls.concat(myBoys); 

console.log(myChildren);
