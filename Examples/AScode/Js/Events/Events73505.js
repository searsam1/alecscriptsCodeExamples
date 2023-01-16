let demo = document.querySelector("#DEMO")

function f(){
    this.style.backgroundColor = 
    this.style.backgroundColor == "red" ? "black" : "red" 
}

demo.addEventListener("click", f, false)

