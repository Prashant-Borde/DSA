function rollADice(){
    let dice = Math.floor(Math.random()*6+1);

    return dice;
}

let roll = rollADice();
console.log(roll);