let $cmdLine;
let $excel;
let $coordinates;


function buildTable(){
    let table = $("<table>")
                    .addClass("excel");
  
    for (let height = 0; height < 19; height++){
        let row = $("<tr>");
        for (let width = 0; width<5; width++){
            let textBox = $("<input type='text'>")
                .on( "focus keyup", function(){
                    let $that = $(this);
                    let coordinates = $that
                                        .parent()
                                        .attr("id")
                                        .split("-");
                    $coordinates.text("h" + coordinates[0]
                                    + "w" + coordinates[1]);
                    $cmdLine.val($that.val());
                });
            let colum = $("<td>")
                .attr("id" ,height + "-" + width)
                .append(textBox)
                ;
            row.append(colum);
        }
        table.append(row);
    }
    $excel.append(table);
}


$(document).ready(function(){
    $cmdLine = $("#comand_line");
    $excel = $("#excel");
    $coordinates = $("#coordinates");


    buildTable();
});












