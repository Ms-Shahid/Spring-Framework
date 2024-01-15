<!DOCTYPE html>
<html>
<head>
<title> Welcome Screen Page </title>
<style>
@import url('https://fonts.googleapis.com/css?family=Major+Mono+Display|Oswald');

html, body {
  color: white;
  background: black;
  text-align: center;
  font-family: 'Oswald', sans-serif;
  margin: 0;
  overflow: hidden;
}

#background {
  z-index: 1;
  width: 100%;
  height: 100%;
  position: absolute;
}

#welcomeContainer #usernameContainer{
  z-index: 0;
  width: 500px;
    height: 250px;
  display: inline-block;
  postion: absolute;
}



#welcome, #username {
  font-family: 'Major Mono Display', monospace;
  text-shadow: 0 0 30px #FF0000;
  letter-spacing: 10px;
  color: #af0000;
  user-select: none;
  float: right;
  padding-top: 45px;
  text-align: center;
  transform: translate(-50%, -50%);
}

#welcome{
text-align : left;
padding-left:10px;
}

#username{
 padding-left: 30px;
 padding-right: 30px;
 text-align:right;
}

#letters {
  user-select: none;
  z-index: 1;
  position: absolute;
}
</style>
<script>
let x, y, v, c, fc, l = 40; ra = [];
let w = "Welcome", wa = w.split("");

let ca = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*~`/.,<>?\|]}{[".split("");

//x  | the mouse X axis on page
//y  | the mouse Y axis on page
//v  | the Velocity of letter chosen
//c  | the random Character chosen
//l  | the amount of loops
//w  | the welcoming Word as the header
//wa | the welcoming Word as an Array
//ca | the inital Character Array
//ra | the Random character Array

console.clear()

function scr() {
  for (var a = 0; a < l; a++) {
    (function(i) {
      setTimeout(function(){
        ra = [];
        for (b = 0; b < w.length; b++) {
          c = ca[Math.floor(Math.random() * ca.length)];
          ra.push(c)
        }
        if (i+1>Math.floor(l*0.85)) {
          for (var d = 0; d < w.length; d++) {
            ra[d] = w[d]
          };
        } else if (i>Math.floor(l*0.65)) {
          for (var d = 0; d < w.length-1; d++) {
            ra[d] = w[d]
          };
        } else if (i>Math.floor(l*0.45)) {
          for (var d = 0; d < w.length-2; d++) {
            ra[d] = w[d]
          };
        } else if (i>Math.floor(l*0.35)) {
          for (var d = 0; d < w.length-3; d++) {
            ra[d] = w[d]
          };
        } else if (i>Math.floor(l*0.25)) {
          for (var d = 0; d < w.length-4; d++) {
            ra[d] = w[d]
          };
        } else if (i>Math.floor(l*0.2)) {
          for (var d = 0; d < w.length-5; d++) {
            ra[d] = w[d]
          };
        } else if(i>Math.floor(l*0.1)) {
          for (var d = 0; d < w.length-6; d++) {
            ra[d] = w[d]
          };
         };
        document.getElementById("welcome").innerHTML = ra.join("");
      } , Math.floor(a*(2000/l)))
    })(a);
  }
};

function mse(e) {
  fc = ca[Math.floor(Math.random() * ca.length)];
  x = e.clientX;
  y = e.clientY;
  var el = document.getElementById("letters");
  el.innerHTML = fc;
  el.style.left = x-2 + "px";
  el.style.top = y-40 + "px";
};

scr()
</script>
</head>

<body>
<div id="background" onmousemove="mse(event)" onclick="scr()"></div>
<div id="welcomeContainer"><h1 id="welcome"></h1></div>
<div id="usernameContainer"><h1 id="username">${username}</h1></div>
<p id="letters">I change when you move your mouse</p>
</body>
</html>