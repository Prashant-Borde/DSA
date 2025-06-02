let num = parseInt(prompt("Enter a range no. "));

let randoms = parseInt(Math.floor(Math.random()*num)+1);
// console.log(randoms);

let    guess = (prompt("Enter a number (or type 'quit' to exit):"));

while(randoms !==parseInt(guess) && "quit"!==guess.toLowerCase()){
    guess = (prompt("Enter a no. : "));
    if(parseInt(guess)>randoms){
        console.log("Tey some lower values");
    }else if(parseInt(guess)<randoms){
        console.log("try some bigger value");
    }

}


if( "quit"===guess){
    console.log("Game Over ! ");
}
if(randoms === parseInt(guess)){
    console.log("Congratulations You Gess the Right one");
}

