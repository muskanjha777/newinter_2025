const ages = [12, 17, 19, 20, 15];

const firstAdult = ages.find(function(age) {
  return age >= 18;
});

console.log("First adult:", firstAdult); // 19