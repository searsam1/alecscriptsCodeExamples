



function randomByte(){
    return Math.floor(Math.random() * 256);
}

let rgb_ = []
// generate 3 random numbers 
// from  0 - 255
for (let i=0; i<3; i++){
    rgb_[i] = randomByte()
}
// [89, 195, 4]



