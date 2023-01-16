let demo = document.querySelector("#DEMO2")

function f(){
    this.style.backgroundColor = 
    this.style.backgroundColor == "red" ? "black" : "red" 
}

demo.addEventListener("mouseover", f, false)

