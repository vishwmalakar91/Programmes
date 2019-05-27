switch (new Date().getDay()) {
    case 6:
      text = "Today is Saturday";
      break; 
    case 0:
      text = "Today is Sunday";
      break; 
    default: 
      text = "seems Weekdays :(";
  }


  console.log(text);


var cars=["BMW","Audi","Ferrari"];
  
var i,my_text="";
for (i = 0; i < cars.length; i++) { 
  my_text += cars[i] + "<br>";
  console.log(my_text);
}

var i=0;

while (i <= 10) {
    console.log(i);
    i++;
    if (i === 2) { continue; }
    if (i === 5) { break; }
  }