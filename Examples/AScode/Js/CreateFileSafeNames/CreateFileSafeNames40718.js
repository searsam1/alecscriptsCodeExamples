function removePunctuation2(txt){
    txt = txt.trim(" ")
    return txt.match(/[a-zA-Z ]/g).join("").split(" ").join("-") ;
}
removePunctuation2("testing tesT!$#!! ")
// "testing-tesT"

