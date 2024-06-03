var express=require("express");
var app=express();

app.set("view engine","pug");
app.get("/credit_cards",function(req,res){
    var requestJSON="";
    var number=Math.floor(Math.rendom()*3)+1;
    if(number == 1){
        requestJSON = { "id": 4885, "uid": "0e05163f-c01e-4c0f-9034-d7720afa4b3e", "credit_card_number": "1211-1221-1234-2201", "credit_card_expiry_date": "2028-06-01", "credit_card_type": "forbrugsforeningen" }
    }else if(number == 2){
        requestJSON = {"id":390,"uid":"97721ce2-0813-461f-b98c-4e89f897e6ce","credit_card_number":"1228-1221-1221-1431","credit_card_expiry_date":"2025-06-02","credit_card_type":"switch"}
    }else{
        requestJSON = {"id":6613,"uid":"32b6aa84-37a2-4d14-8d77-7ab09eb29a90","credit_card_number":"1234-2121-1221-1211","credit_card_expiry_date":"2028-06-01","credit_card_type":"diners_club"}
    }
    res.json(requestJSON)
});
 
var server=app.listen(7885,function(){
    var host=server.address().address;
    var port=server.address().port;

    console.log("应用实例，访问地址为http;//%s:%s",host,prot);
});