const prices = [100, 200, 300];

const total = prices.reduce(function(sum, price) {
  return sum + price;
}, 0); // 0 is the starting value

console.log("Total:", total); // 600