function longestString(str){
    let newstr="";
    for(let i=0;i<str.length;i++){
        if(newstr.length<str[i].length){
            newstr=str[i];
        }
    }
    return newstr;
}

let country=["Australia","Germany","UnitedStatesofAmerica"];
let logestcountry=longestString(country);
console.log(logestcountry);