const scores = [40, 100, 1, 5, 25];

scores.sort(function(a, b) {
  return a - b; // for ascending order
});

console.log("Sorted:", scores); // [1, 5, 25, 40, 100]