var lastName = "Johnson";    //String
var length = 16;                  // Number
var x = {firstName:"John", lastName:"Doe"};    // Object

console.log(x);

//When adding a number and a string, JavaScript will treat the number as a string.
var x = "16" + "Volvo";
var y = 17 + "Volvo";

console.log(x,y);

//JavaScript evaluates expressions from left to right

var z1 = 16 + 4 + "Volvo";
var z2 = "Volvo" + 16 + 4;

console.log(z1,z2);