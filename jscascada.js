//document.getElementById("counter").innerText= 30

//let firstBatch = 5
//let deumierBatch= 10
//let counter = firstBatch + deumierBatch
//console.log(counter)
 
var MyAge= 165;	
var humanDogRatio = 7;
var MyDogAge= MyAge * humanDogRatio;
console.log(MyDogAge)

//alert("good G");
//var n1= window.prompt("Can you write your last name please?");
//var n2= window.prompt("Can you write your age please?");
//console.log(n1, "your Age is:" ,n2);

var canvas= document.createElement("canvas");
 canvas.width= 500;
 canvas.height= 250;
var lienzo= canvas.getContext("2d");
lienzo.font="30px cursive";
lienzo.fillStyle="orange";
lienzo.fillText("Giovanni´s Family",50,50);