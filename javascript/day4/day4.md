$todays learning$
#arrow function
#callback function
#function expression
#default arguments
#function inside function
#function return function
#lexcical scoping
#mapping
#filter

🔹 Arrow Function
A concise way to define functions using => syntax.

javascript
Copy
Edit
const greet = name => `Hello, ${name}`;
🔹 Callback Function
A function passed as an argument to another function to be executed later.

javascript
Copy
Edit
setTimeout(() => console.log('Hi'), 1000); // the arrow function is a callback
🔹 Function Expression
A function assigned to a variable.

javascript
Copy
Edit
const add = function(a, b) {
  return a + b;
};
🔹 Default Arguments
Function parameters with default values if no argument is provided.

javascript
Copy
Edit
function greet(name = 'Guest') {
  return `Hello, ${name}`;
}
🔹 Function Inside Function
A function defined inside another function.

javascript
Copy
Edit
function outer() {
  function inner() {
    console.log('Inner function');
  }
  inner();
}
🔹 Function Returns Function
A function that returns another function.

javascript
Copy
Edit
function multiplier(x) {
  return function(y) {
    return x * y;
  };
}

const double = multiplier(2);
console.log(double(5)); // 10
🔹 Lexical Scoping
Inner functions have access to variables from outer functions.

javascript
Copy
Edit
function outer() {
  let x = 10;
  function inner() {
    console.log(x); // has access to x
  }
  inner();
}
🔹 Mapping
Transforms each element in an array and returns a new array.

javascript
Copy
Edit
const nums = [1, 2, 3];
const squared = nums.map(n => n * n); // [1, 4, 9]
🔹 Filter
Creates a new array with elements that pass a test.

javascript
Copy
Edit
const nums = [1, 2, 3, 4];
const even = nums.filter(n => n % 2 === 0); // [2, 4]

