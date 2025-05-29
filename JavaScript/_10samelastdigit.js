let a= prompt("enter A : ");
let b= prompt("enter B : ");

if(a[a.length-1]===b[b.length-1]){
    let num=a[a.length-1];
    alert(`a = ${a} and b= ${b} has same last digit value ${num}. `);
}else{
    alert(`a = ${a} and b= ${b} not having same last digit value .`);
}