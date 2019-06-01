var xhttp = new XMLHttpRequest();

xhttp.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200) {
    document.getElementById("demo").innerHTML =
    this.responseText;
  }
};
xhttp.open("GET", "https://reqres.in/api/users/2", true);
xhttp.send();