/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let sum=0,flag=0;
    for(let i=0;i<s.length;i++){
          if((s[i]+s[i+1])==="IV"){
            sum+=4;
            i+=1;
            flag=1;
        }  if((s[i]+s[i+1])==="IX"){
            sum+=9;
            i+=1;
            flag=1;
        }  if((s[i]+s[i+1])==="XL"){
            sum+=40;
            i+=1;
            flag=1;
        }  if((s[i]+s[i+1])==="XC"){
            sum+=90;
            i+=1;
            flag=1;
        }  if((s[i]+s[i+1])==="CD"){
            sum+=400;
            i+=1;
            flag=1;
        }  if((s[i]+s[i+1])==="CM"){
            sum+=900;
            i+=1;
            flag=1;
        }if(flag===0){
            
        if(s[i]==="I"){
            sum+=1;
        }
        if(s[i]==="V"){
            sum+=5;
        }
        if(s[i]==="X"){
            sum+=10;
        }
        if(s[i]==="L"){
            sum+=50;
        }
        if(s[i]==="C"){
            sum+=100;
        }
        if(s[i]==="D"){
            sum+=500;
        }
        if(s[i]==="M"){
            sum+=1000;
        }
        }
        // if(s.length>6&&i===4){
        //     sum=sum-10;
        // }
        
    }
    return sum;
};


let s="III";
s="LVIII";
s="MCMXCIV";
console.log(romanToInt(s))
