// create random number 
// in the range 0 - 255
function randomByte(){
    return Math.floor(Math.random() * 256);
}
// random color in form {"r" : r, "g" : g, "b": b}
function randomColor(){
    let r = randomByte(), g = randomByte(), b = randomByte()
    return {"r" : r, "g" : g, "b": b}
}

function changeColor(){
    // get all red circles on the page
    let elements = document.getElementsByClassName("randomColor");
    let RGB;

    for (let ele of elements){
        RGB = randomColor();
        // [1, 11, 111] 
        ele.style.backgroundColor = `rgb(${RGB.r}, ${RGB.g}, ${RGB.b})`    
        // rgb(1, 11, 111)
        ele.textContent = `#${RGB.r.toString(16)}${RGB.g.toString(16)}${RGB.b.toString(16)}`;
        // #010b6f
    }
    
}

