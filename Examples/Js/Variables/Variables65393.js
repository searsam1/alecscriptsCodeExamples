function scopeTesting(){
    let x = 5; 
    if (x == 5){
        let x = 10; 
        console.log(x);
        // 10
    }
    console.log(x);
    // 5
}
scopeTesting(); 
// 10 
// 5
