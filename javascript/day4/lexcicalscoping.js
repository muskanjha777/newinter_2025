function fun1(){
    var num = 18;
    console.log(num);
}
fun1();
// console.log(num);

const myvar = "value1";

function myApp(){
     const myvar = 17;
    function myfunc(){
        const myvar= "value59";
        console.log("inside myFunc",myvar);
    }
    
    console.log(myvar);
    myfunc();
}


myApp();



