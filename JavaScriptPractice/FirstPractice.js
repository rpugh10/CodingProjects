
document.getElementById('demo').innerHTML = "Hello World!";
document.getElementById('demo').style.fontSize ="35px";


document.getElementById("button1").onclick = function() {
	document.getElementById("image").src = "https://velvetescape.com/wp-content/uploads/2011/11/dawid-zawila-G3rw6Y02D0-unsplash.jpg";
};
document.getElementById("button2").onclick = function() {
	document.getElementById("image").src = "https://media.istockphoto.com/id/503874466/photo/full-moon.jpg?s=612x612&w=0&k=20&c=uhTug9hbnP5uKzjWPjnmu2wDcFMNpi4N9M24e6MUXYI=";
};
document.getElementById("button3").onclick = function(){
    document.getElementById("image").style.display = "none";
};
document.getElementById("button4").onclick = function(){
    document.getElementById("image").style.display = "block";
};

document.getElementById("alertButton").onclick = function(){
    alert("This is an alert message!");
}

let a, b, c;
a= 5;
b =6;
c = a+b;
document.getElementById("demo2").innerHTML ="The sum of 5 + 6 is " + c;

document.getElementById("demo3").innerHTML="Numbers from 0 to 10: ";
for(let i = 0; i <= 10; i++){
    document.getElementById("demo3").innerHTML += i;
    if(i<10){
        document.getElementById("demo3").innerHTML += ", ";
    }
}

document.getElementById("button5").onclick = function(){
let input = parseInt(prompt("How many operations do you want to perform: "));
for(let i = 0; i < input; i++)
{
    let operation = prompt("Enter an operation: ");
    switch(operation)
    {
        case"add":
            let num1 = prompt("Enter the first number: ");
            let num2 = prompt("Enter the second number: ");
            let sum = parseInt(num1) + parseInt(num2);
            alert("The sum of " + num1 + " and " + num2 + " is " + sum);
        break;
        case"subtract":
            let num3 = prompt("Enter first number: ");
            let num4 = prompt("Enter the second number: ");
            let sum2 = parseInt(num3) - parseInt(num4);
            alert("The subtraction of " + num3 + " and " + num4 + " is " + sum2);
            break;
        case"divide":
            let num5 = prompt("Enter first number ");
            let num6 = prompt("Enter the second number ");
            let sum3 = parseInt(num5) / parseInt(num6);
            alert("The division of " + num5 + " and " + num6 + " is " + sum3);
            break;
        case"multiply":
            let num7 = prompt("Enter the first number ");
            let num8 = prompt("Enter the second number ");
            let sum4 = parseInt(num7) * parseInt(num8);
            alert("The multiplication of " + num7 + " and " + num8 + " is " + sum4);
            break;
        default:prompt("Invalid operation");
    
    }

}

document.getElementById("button6").onclick = function() {
    let input = parseInt(prompt("How many numbers do you want to store: "));
    const num = [];
    
    for (let i = 0; i < input; i++) {
        let value = parseInt(prompt("Enter number: "));
        num.push(value);
    }

    document.getElementById("demo4").innerHTML = "Printing array: " + num.join(", ");
}
};