#dot bracket accesing
#computedproperties
#nested destructuring
#object destructuring
#arrow function
#spread operator use...


#dot and bracket notation use

In JavaScript, dot notation (.) and bracket notation ([]) are two ways to access or set the properties of objects. Here's a breakdown of both:

🔹 Dot Notation
Syntax:

js
Copy
Edit
object.property
Example:

js
Copy
Edit
const user = {
  name: "Alice",
  age: 25
};

console.log(user.name);  // "Alice"
user.age = 26;
✅ Use When:
You know the exact name of the property (and it's a valid identifier).

The property name doesn't contain spaces or special characters.

The property name doesn't start with a number.

🚫 Limitations:
You can't use variables to refer to property names.

You can't access properties with names like "first-name" or "123name" using dot notation.

🔹 Bracket Notation
Syntax:

js
Copy
Edit
object["property"]
Or with variables:

js
Copy
Edit
let prop = "name";
console.log(object[prop]);
Example:

js
Copy
Edit
const user = {
  "first-name": "Alice",
  age: 25
};

console.log(user["first-name"]);  // "Alice"
let key = "age";
console.log(user[key]);           // 25
✅ Use When:
The property name is dynamic (stored in a variable).

The property name has special characters, spaces, or starts with a number.

You need to loop through properties programmatically.









#wht is hoisting
Hoisting in JavaScript is a behavior where variable and function declarations are moved to the top of their scope (global or function scope) before the code is executed.

However, only the declarations are hoisted, not the initializations.

🔹 1. Variable Hoisting
With var:
js
Copy
Edit
console.log(a); // undefined
var a = 5;
The declaration var a; is hoisted to the top, but the assignment a = 5; is not.

So it becomes:

js
Copy
Edit
var a;
console.log(a); // undefined
a = 5;

You cannot access them before their declaration line is run.

🔹 2. Function Hoisting
Function Declarations:
js
Copy
Edit
greet(); // "Hello"

function greet() {
  console.log("Hello");
}
Function declarations are fully hoisted, including their body.

Function Expressions:
js
Copy
Edit
sayHi(); // ❌ TypeError: sayHi is not a function

var sayHi = function () {
  console.log("Hi");
};
var sayHi is hoisted as a variable (with value undefined), but the function assignment is not hoisted.

🔹 1. Object Destructuring
Object destructuring allows you to extract values from an object and assign them to variables in a concise way.

✅ Example:
javascript
Copy
Edit
const person = {
  name: 'John',
  age: 25
};

const { name, age } = person;
console.log(name); // John
console.log(age);  // 25
Why use it?
It's cleaner and avoids repetitive code like:

javascript
Copy
Edit
const name = person.name;
const age = person.age;
🔹 2. Nested Destructuring
Nested destructuring lets you extract values from deeply nested objects (or arrays) in one step.

✅ Example:
javascript
Copy
Edit
const user = {
  id: 1,
  info: {
    name: 'Alice',
    location: {
      city: 'Paris',
      zip: 75000
    }
  }
};

const { info: { name, location: { city } } } = user;
console.log(name); // Alice
console.log(city); // Paris
Note: The variable names match the structure of the nested object.

🔹 3. Arrow Function
Arrow functions are a shorter syntax for writing functions, introduced in ES6.

✅ Example:
javascript
Copy
Edit
const add = (a, b) => a + b;
console.log(add(2, 3)); // 5
✅ With block body:
javascript
Copy
Edit
const greet = (name) => {
  return `Hello, ${name}!`;
};
✅ Without parentheses (for one parameter only):
javascript
Copy
Edit
const square = x => x * x;
Key characteristics:

Shorter syntax

No own this (lexical this)

Can't be used as constructors

Would you like a real-world example using all three together?




🔹 1. Object Destructuring
Object destructuring allows you to extract values from an object and assign them to variables in a concise way.

✅ Example:
javascript
Copy
Edit
const person = {
  name: 'John',
  age: 25
};

const { name, age } = person;
console.log(name); // John
console.log(age);  // 25
Why use it?
It's cleaner and avoids repetitive code like:

javascript
Copy
Edit
const name = person.name;
const age = person.age;
🔹 2. Nested Destructuring
Nested destructuring lets you extract values from deeply nested objects (or arrays) in one step.

✅ Example:
javascript
Copy
Edit
const user = {
  id: 1,
  info: {
    name: 'Alice',
    location: {
      city: 'Paris',
      zip: 75000
    }
  }
};

const { info: { name, location: { city } } } = user;
console.log(name); // Alice
console.log(city); // Paris
Note: The variable names match the structure of the nested object.

🔹 3. Arrow Function
Arrow functions are a shorter syntax for writing functions, introduced in ES6.

✅ Example:
javascript
Copy
Edit
const add = (a, b) => a + b;
console.log(add(2, 3)); // 5
✅ With block body:
javascript
Copy
Edit
const greet = (name) => {
  return `Hello, ${name}!`;
};
✅ Without parentheses (for one parameter only):
javascript
Copy
Edit
const square = x => x * x;
Key characteristics:

Shorter syntax

No own this (lexical this)

Can't be used as constructors

Would you like a real-world example using all three together?




Ask ChatGPT



