const prints = () => {
    let id=setInterval(()=>{

        console.log("Hello World")
        console.log(id);
        id=+1;
    
    },2000)
        setTimeout(()=>{
            clearInterval(id);
        },10000);
    
}

prints();