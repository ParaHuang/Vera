var o1 = {
    no:1,
    name:"Jack",
    age:17,
    gender:"male"
};
var o2 = {
    no:2,
    name:"Alice",
    age:18,
    gender:"female"
};
var o3 = {
    no:3,
    name:"Lucy",
    age:17,
    gender:"female"
};
var o4 = {
    no:4,
    name:"John",
    age:18,
    gender:"male"
};
var o5 = {
    no:5,
    name:"Tom",
    age:19,
    gender:"male"
};

var data = [o1,o2,o3,o4,o5];

var stus = document.getElementById("stus");
var noBox = document.getElementById("no");
var nameBox = document.getElementById("name");
var ageBox = document.getElementById("age");
var genderBox = document.getElementById("gender");

function addRow(stu){
    var tr = document.createElement("tr");

    var noTd = document.createElement("td");
    var nameTd = document.createElement("td");
    var ageTd = document.createElement("td");
    var genderTd = document.createElement("td");

    noTd.innerText = stu.no;
    nameTd.innerText = stu.name;
    ageTd.innerText = stu.age;
    genderTd.innerText = stu.gender;


    tr.appendChild(noTd);
    tr.appendChild(nameTd);
    tr.appendChild(ageTd);
    tr.appendChild(genderTd);
    stus.appendChild(tr);
}

//set up table data
function setUp(){
    for(var i=0 ; i<data.length ; i++){
        var stu = data[i];
        addRow(stu);
    }
}

setUp();

function add(){
    if(noBox.value=="" || nameBox.value=="" || ageBox.value=="" || genderBox.value==""){
        alert("any student infomation can't be empty");
        return;//stop the rest programe
    }
    var stu = {
        no:noBox.value,
        name:nameBox.value,
        age:ageBox.value,
        gender:genderBox.value
    };
    addRow(stu);
    noBox.value="";
    nameBox.value="";
    ageBox.value="";
    genderBox.value="";
}

function deleteStu(){
    var trs = document.getElementsByTagName("tr");
    var no = noBox.value;
    trs[no].remove();
}