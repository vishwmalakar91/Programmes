var txt="ABCDEF";
var y=txt.length;
console.log(y);
var pos=txt.indexOf("A");
console.log(pos);

var sub_string=txt.search("DEF") //returns the position of the match
console.log(sub_string)

var sub_string=txt.search("VIS") //returns -1 if not match
console.log(sub_string)

var str = "Apple, Banana, Kiwi";
var res = str.slice(7, 13);
var res1 = str.substr(-4);
console.log(res,",",res1)

str = "Please visit Microsoft!";
var n = str.replace("Microsoft", "W3Schools"); //replace() method is case sensitive
console.log(n)


var text1 = "Hello World!";       // String
var text2 = text1.toUpperCase();
console.log(text2)


var text1 = "Hello";
var text2 = "Vishwa";
var text3 = text1.concat(" ", text2);
console.log(text3)

//The trim() method removes whitespace from both sides of a string:
var str = "       Hello World!        ";
console.log(str.trim())


var txt = "a,b,c,d,e";   // String
txt.split(",");          // Split on commas
console.log(txt[0])


var x = "100";
var y = "10";
var z = x - y; 
var z1=x+y;// z1 will not be 110 (It will be 10010)
console.log(z,z1)

