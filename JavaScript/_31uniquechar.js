function unique(str) {
    let newstr = "";
    for (let i = 0; i < str.length; i++) {
        if (!newstr.includes(str[i])) {
            newstr += str[i];
        }
    }
    return newstr;
}

let str = "abcdefghabzjkopwfhcd";
let newstr = unique(str);
console.log(newstr); // Output: abcdefgh
