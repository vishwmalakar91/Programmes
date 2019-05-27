//Hoisting is JavaScript's default behavior of moving all declarations to the top of the current scope 
//(to the top of the current script or the current function).

//Note - JavaScript Initializations are Not Hoisted only the declarations are

var y; // Declare y
y = 5; // Assign 5 to y
console.log(y);


x = 5; // Assign 5 to x
console.log(x);
var x; // Declare x

//both will work same manner

//Variables and constants declared with let or const are not hoisted!