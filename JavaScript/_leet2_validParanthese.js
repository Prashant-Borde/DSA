var isValid = function(s) {
    let stack = [];

  for(let i=0;i<s.lenght;i++){
    let ch = s[i];

    if(ch ==="(" || ch==="[" || ch==="{"){
        stack.push(ch);
    }else{
        if(stack.length===0) return false;

        let last = stack.pop();

        if(
            ( ch === ")" && last !== "(") ||
            ( ch === "]" && last !== "[") ||
            ( ch === "}" && last !== "{") 
        ){
            return false;
        }
    }
  }
  return stack.length
};

s="()()"