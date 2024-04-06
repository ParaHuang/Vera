//how to obtain the present time
//javascript is language based on object (some object exist already)
//but some object we have to initialize by ourselves
//we can use some object directly, such as window,document,history,location

function showTime() {
    //create an object
    var d = new Date();   //new means create

    var year = d.getFullYear();
    var month = d.getMonth() + 1;   //Jan - reality:one - code:0
    var date = d.getDate();

    var hour = d.getHours();
    var min = d.getMinutes();
    var sec = d.getSeconds();
    //console.log(date,"/",month,"/",year,"  ",hour,":",min,":",sec);
    document.getElementById("time").innerText = date + "/" + month + "/" + year + "  " + hour + ":" + min + ":" + sec;
}

setInterval(showTime, 1000);