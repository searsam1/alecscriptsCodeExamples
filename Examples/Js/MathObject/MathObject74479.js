/* 
    solve quadratic question with: 
        -b ± sqrt(b^2 - 4ac) 
        --------------------
                2a
*/

function getDiscriminate(a, b, c){
    // return sqrt(b^2 - 4ac)
    return Math.sqrt(Math.pow(b, 2) - (4 * a * c))
}


// d for discriminate
function getRoots(a, b, c){
    let discriminate = getDiscriminate(a, b, c)

    // use +
    x1 = (-b + discriminate) / (2*a);
    // use -
    x2 = (-b - discriminate) / (2*a)

    return { root1 : x1, root2 : x2 }
}

var res = getRoots(1,6,-9); 
console.log(res.root1, res.root2)
// 1.2426406871192848 -7.242640687119285
