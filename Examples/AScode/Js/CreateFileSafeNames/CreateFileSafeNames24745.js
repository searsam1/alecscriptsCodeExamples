function removePunctuation(txt){
    let cleanTxt = "";
    for (let char of txt){
        if (char.match(/[a-zA-Z ]/i)){
            cleanTxt += char; 
        }
    }
    cleanTxt = cleanTxt.trim(" ")
    return cleanTxt.split(" ").join("-");
}
removePunctuation("testing tesT!$#!! ")
// "testing-tesT" 

