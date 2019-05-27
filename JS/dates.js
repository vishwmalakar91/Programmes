var my_date=new Date();
console.log(my_date);
console.log(my_date.getFullYear());

var months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

console.log(my_date.getMonth());

console.log(months[my_date.getMonth()]);

//set date
my_date.setFullYear(2020);
console.log(my_date);