console.log(Math.round(4.7),"#", Math.abs(-4.5));


var num=Math.min(0, 150, 30, 20, -8, -200); 
console.log(num);


console.log(Math.random());

var my_ran = Math.floor(Math.random() * 100) + 1; // returns a random integer from 1 to 100
console.log(my_ran);

function getRndInteger(min, max) {
    return Math.floor(Math.random() * (max - min + 1) ) + min;
  }

console.log(getRndInteger(200,220));