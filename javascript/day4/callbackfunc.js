function greet(name)
{
    console.log("heLLO," +name);

}
function user(callback)
{

    let name="Muskan";
    callback(name);

}

user(greet);