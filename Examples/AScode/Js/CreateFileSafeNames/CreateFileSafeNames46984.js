
function replaceSpecials(string){
    // ^ inside [] means don't match 
    // [ don't match a through z or A though Z or spaces ]
    string = string.trim(" ")
    return string.replace(/[^a-zA-Z ]/g,'').replace(/ /, "-");
}
replaceSpecials("testing tesT!$#!! ")
// "testing-tesT" 

