// Nested Destructing


const users = [
    {
    userid : 1,
    user_name: "muskan",
    gender : "female"},
    {
    userid : 2,
    user_name: "sayali",
    gender : "female"},
    {
    userid : 3,
    user_name: "shivam",
    gender : "male"},

]

// Assigning variable as well
const[,{gender:user3_gender},{user_name : user1_username,userid}] = users;
console.log(user1_username);
console.log(user3_gender);
console.log(userid);
