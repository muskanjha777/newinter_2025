const numbers = [3, 7, 11, 2];

const hasEven = numbers.some(function(n) {
  return n % 2 === 0;
});

console.log("Has even number?", hasEven); // true