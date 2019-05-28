//With strict mode, you can not, for example, use undeclared variables.
//below will give error

x = 3.14;       // This will not cause an error. 
myFunction();

function myFunction() {
  "use strict";
  y = 3.14;   // This will cause an error
}

//Strict mode makes it easier to write "secure" JavaScript.