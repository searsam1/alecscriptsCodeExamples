function changeColor(){        
    // element to change background color
    let Color = document.querySelector("#Color")

    // set background to new color input (this.value)
    Color.style.backgroundColor = this.value
    }

// get the color input 
let colorInp = document.querySelector("#colorInp")

// listen to when there is input to the button, 
// and run `changeColor` when a change event occurs 
colorInp.addEventListener("change",  changeColor, false)


