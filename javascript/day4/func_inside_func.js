function outerFunction() {
  console.log("I'm the outer function!");

  function innerFunction() {
    console.log("I'm the inner function!");
  }

  innerFunction(); // Call inner function
}

outerFunction();