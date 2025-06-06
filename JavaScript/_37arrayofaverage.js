const arrayavg = (arr) => {
    let sum=0,flag=0;
    for(let i=0;i<arr.length;i++){
        sum+=arr[i];
        flag++;
    }
    return sum/flag;
}

arr=[3,3,3];
result=arrayavg(arr);
console.log(result);