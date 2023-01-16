
const jsdom = require("jsdom");  // JSDOM
const fs = require('fs'); // writeFile, readFile

const fileInfo = {
    path : "", 
    name : "", 
    controller  : "",
    ext  : ""
}

function randomN(){
    // generate random int up to 100,000
    return Math.floor(Math.random() * 100000);
}

function write(content){
    // write each pre element (content)
    // into its own file 
    // using fs.writeFile
    fs.writeFile(`/Users/111244rfsf/Desktop/AScode/${fileInfo.controller}/${fileInfo.name}/${fileInfo.name}${randomN()}.${fileInfo.ext}` , content, err => {
        if (err) {
            console.error(err);
            return 
        }
        // wrote content to file 
    });
}

function getAllPreCodeLangs(err, data) {
    // get all pre elements
    // to capture the code 
    // inside  
    if (err) {
        console.log(err)
        return 
    }
    // create new JSDOM object for I/O
    const dom = new jsdom.JSDOM(data);
    // find all <pre> ... </pre> elements
    let doc = dom.window.document.querySelectorAll("pre");
    // map each pre element to write()
    doc.forEach(
        content => write(content.textContent + "\n")
    )

}

function openFile(filePath) {
    // start of the chain.
    // open -> getAllPreCodeLangs -> write -> file.ext
    fs.readFile(filePath, 'utf8', getAllPreCodeLangs)
}



function main() {
    // get command line arguments with 
    // process.argv
    process.argv.forEach(function (val, index, files) {
        fileInfo.path = files[2]; 
        fileInfo.name = files[3]; 
        fileInfo.controller = files[4]; 
        fileInfo.ext = files[5]; 
    });    
    
    openFile(fileInfo.path)

}   

main()
