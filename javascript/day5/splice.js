const colors = ["red", "blue", "green", "yellow"];

colors.splice(2, 1, "purple"); 
// remove 1 item at index 2 and add "purple"

console.log("Updated Colors:", colors); 
// ["red", "blue", "purple", "yellow"]