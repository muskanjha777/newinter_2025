function myfunc()
{
    function user()
    {
        console.log("i am user");
    }
    return user;
}

const display=user();
console.log(user());