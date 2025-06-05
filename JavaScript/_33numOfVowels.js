function findVowels(str){
    let vowels="aeiouAeiou", flag=0;
    for(let i=0;i<str.length;i++){
        let find = str[i];
        for(let j=0;j<vowels.length;j++){
            let vowelsslice=vowels[j];
            if(find===vowelsslice){
                flag+=1;
            }
        }

    }
    console.log(flag);
    return flag
}

let string=prompt("Enter a String to count No. of Vowels : ");
let count=findVowels(string)
console.log(`count of NO. of Vowels in ${string} is ${count}`);