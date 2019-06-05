const express = require("express");
const bodyparser = require('body-parser');
const PORT = process.env.PORT || 4001;
const expressValidator = require('express-validator');
const expressSession = require('express-session');
const l1 = require('./login');

const app= express();
app.use(bodyparser.urlencoded({extended:false}));
app.use(expressValidator());


var logger=function(req,resp,next){
    console.log(req.url);
    next();
}
app.use(logger);

app.listen(PORT, ()=> {
    console.log(`Server on port ${PORT}`);
});

app.get('/', (req,res) =>{
    res.sendFile("login.html",{root:__dirname});
});

app.post('/login', (req,res) =>{
    //status = login.check(req.body.name)
    status = l1.check(req.body.user,req.body.pass);
    console.log(status);
    if (status == 1){
        res.send(" Username cannot be empty");
        console.log(" Username cannot be empty")
    }
    else if (status == 2){
        res.send(" Username has to be greator then 8 character");
        console.log(" Username has to be greator then 8 character")
    }
    else if (status == 3){
        res.send(" Password cannot be empty");
        console.log("  Password cannot be empty")
    }
    else {
        res.send("successful");
    }
});