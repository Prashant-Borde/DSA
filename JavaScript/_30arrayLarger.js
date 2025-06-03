function largerthan(arr,num){
    let newarr = [];
    
    for(let i=0;i<=4;i++){
        if (arr[i] > num ){
            newarr.push(arr[i]);
        }
    }
    return newarr;
}

let arr=[];
for(let i=0;i<=4;i++){
    arr[i] = parseInt(prompt(`Enter a no. ${i} : `));
}

let num =parseInt(prompt("Enter a no. : "));

console.log(largerthan(arr,num));