function reverse(n){
    // convert n to string -> array -> string
    return [...n.toString()].reverse().join("")
}

function palindrome(n){
    let check = reverse(n); 
    // check if n is the same forwards as backwards
    return check == n; 
}
console.log(palindrome(1541))
// false
