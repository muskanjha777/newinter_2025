const names = ["Muskan", "Avi", "Riya", "Raj", "Meena", "Ravi"];

const longNames = names.filter(function(name) {
  return name.length > 4;
});

console.log("Names longer than 4 letters:", longNames);
