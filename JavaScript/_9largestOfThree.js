let a= prompt("Enter a no. ");
let b= prompt("Enter a no. ");
let c= prompt("Enter a no. ");

if(a>b && a>c){
    alert("A is Largest no. ");
}else if(b>a&&b>c){
    alert("B is a Largest no.");
}else if(c>a&&c>b){
    alert("c is a Largest no.");
}else{
    alert("some values are same!");
}