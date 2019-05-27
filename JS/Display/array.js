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

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.sort(); 
console.log(fruits);

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.reverse(); 
console.log(fruits);

//By default, the sort() function sorts values as strings.
//This works well for strings ("Apple" comes before "Banana").
//However, if numbers are sorted as strings, "25" is bigger than "100", because "2" is bigger than "1".
//Because of this, the sort() method will produce incorrect result when sorting numbers.
//You can fix this by providing a compare function:

var points = [40, 100, 1, 5, 25, 10];
points.sort(function(a, b){return a - b});
console.log(points);
