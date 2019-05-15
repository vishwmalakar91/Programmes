var car = {
    type: "Fiat",
    model: "500",
    color: "white"
};
//JavaScript objects are containers for named values called properties or methods.

console.log(car.type);
console.log(car["model"]);

//Objects can also have methods or functions

var person = {
    firstName: "John",
    lastName: "Doe",
    id: 5566,
    fullName: function () {
        return this.firstName + " " + this.lastName;
    },
};

console.log(person.fullName())

//Do Not Declare Strings, Numbers, and Booleans as Objects!