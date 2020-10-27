
var respuesta = document.getElementById('respuesta');
var formulario = document.getElementById('formulario');

    fetch('http://172.17.0.1:8080/user',{
        method: 'GET',
        headers:{
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Request-Method': 'OPTIONS,POST,GET',
                'Access-Control-Request-Headers': 'Content-Type',
                 'Content-Length': 'content.length.toString()',
                  'X-Custom-Header': 'ProcessThisImmediately'
              },
    })
        .then( res => res.json())
        .then( data => {
            //console.log(data)
            if(data === 'error'){
                respuesta.innerHTML = `
                <div class="alert alert-danger" role="alert">
                    Campos vacios
                </div>
                `
            }else{

                          tbody=document.querySelector('#tablaUsuarios tbody');
                          tbody.innerHTML = '';

                         for(var i=0;i<data.length;i++){
                           var fila =tbody.insertRow(i);
                           var idCell = fila.insertCell(0);
                           var nombreCell = fila.insertCell(1);
                           var apellidoCell = fila.insertCell(2);
                           var emailCell = fila.insertCell(3);

                           idCell.innerHTML = data[i].id;
                           nombreCell.innerHTML = data[i].nombre;
                           apellidoCell.innerHTML = data[i].apellido;
                           emailCell.innerHTML = data[i].email;
                           tbody.appendChild(fila);

                              }

            }
        } )

 $(document).ready(function(){
 	$("input[name=id]").change(function(){
 		$('input[name=id]').val();
 		var respuesta = document.getElementById('respuesta');
        var formulario = document.getElementById('formulario');

            fetch('http://172.17.0.1:8080/user/'+$('input[name=id]').val(),{
                method: 'GET',
                headers:{
                        'Content-Type': 'application/json',
                        'Access-Control-Allow-Origin': '*',
                        'Access-Control-Request-Method': 'OPTIONS,POST,GET',
                        'Access-Control-Request-Headers': 'Content-Type',
                         'Content-Length': 'content.length.toString()',
                          'X-Custom-Header': 'ProcessThisImmediately'
                      },
            })
                .then( res => res.json())
                .then( data => {
                   // console.log(data)
                    if(data === 'error'){
                        respuesta.innerHTML = `
                        <div class="alert alert-danger" role="alert">
                            Campos vacios
                        </div>
                        `
                    }else{

                                  tbody=document.querySelector('#tablaUsuarios tbody');
                                  tbody.innerHTML = '';
                                  var array =[];
                                   array.push(data);

                                  console.log(array);
                                    for(var i=0;i<array.length;i++){
                                     var fila =tbody.insertRow(i);
                                     var idCell = fila.insertCell(0);
                                     var nombreCell = fila.insertCell(1);
                                     var apellidoCell = fila.insertCell(2);
                                     var emailCell = fila.insertCell(3);

                                     idCell.innerHTML = array[i].id;
                                     nombreCell.innerHTML = array[i].nombre;
                                     apellidoCell.innerHTML = array[i].apellido;
                                     emailCell.innerHTML = array[i].email;
                                     tbody.appendChild(fila);

                                                    }
                    }
                } )
 	});
});