function alternateTableColor(){
    // get all tables in document 
    let tables = document.querySelectorAll("TABLE");
    // for each table 
    for (let table of tables){
        // get all rows from table
        let trs = table.querySelectorAll("tr")
        i = -1; 
        // for each row 
        for (let tr of trs){
            i++; 
            // if i is odd 
            if (i % 2){
                // make bg red
                tr.style.backgroundColor = "red";
            }
            
        }
    }
}
    
