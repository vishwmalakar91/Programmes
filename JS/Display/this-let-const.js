//in an object method, this refers to the "owner" of the method.
var person = {
    firstName: "John",
    lastName : "Doe",
    id     : 5566,
    fullName : function() {
      return this.firstName + " " + this.lastName;
    }
  };

  console.log(person.fullName());

  //ES2015 introduced two important new JavaScript keywords: let and const.
  //Redeclaring a variable using the let keyword can solve this problem.
//Redeclaring a variable inside a block will not redeclare the variable outside the block:

var x = 10;
// Here x is 10
{ 
  let x = 2;
  // Here x is 2
}
// Here x is 10

let i = 5;
for (let i = 0; i < 10; i++) {
  // some statements
}
// Here i is 5

//Global variables defined with the var keyword belong to the window object:
var carName = "Volvo";
//Global variables defined with the let keyword do not belong to the window object:
//let carName = "Volvo";
//Variables defined with let are not hoisted to the top.

//Using a let variable before it is declared will result in a ReferenceError.

//Variables defined with const behave like let variables, except they cannot be reassigned:

const PI = 3.141592653589793;
//PI = 3.14;      // This will give an error
//PI = PI + 10;   // This will also give an error

//You can change the properties of a constant object:

const my_car = {type:"Fiat", model:"500", color:"white"};
my_car.color = "red";
my_car.owner = "Johnson";

console.log(my_car.color);

//But you can NOT reassign a constant object:

const car = {type:"Fiat", model:"500", color:"white"};
//car = {type:"Volvo", model:"EX60", color:"red"};    // ERROR
