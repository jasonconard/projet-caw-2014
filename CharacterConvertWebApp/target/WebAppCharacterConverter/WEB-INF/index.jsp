<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>ProjetCAW2014</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/blog.css" rel="stylesheet">
  <link href="../css/styles.css" rel="stylesheet">

  </head>

  <body>
   

  <script type="text/javascript">          //Envoie des données
    $(document).ready( function () {
    $("#submit").click(function() {

    var chaine-caractere= {
         caractere: $('#caractere').val()
               };

    $.ajax({                   
      type     :  POST,
      url      : "controller.jsp",    
      data     :  chaine-caractere,
      cache    :  false,
      dataType :  "json",
      success    : function() {           // Info Debuggage si erreur     
                   alert("fin de traitement");
                 },
	$.getJSON('json_file.json', function(donnees) {
	var i = 0;
	while(i != donnees.length){
	$('#r').html('<tr><td>'+ donnees.characters.tableau[i].char +'</td>'); 
	$('#r').append('<td>' + donnees.characters.tableau[i].dec + '</td>');
	$('#r').append('<td>' + donnees.characters.tableau[i].hex + '</td>'); 
	$('#r').append('<td>' + donnees.characters.tableau[i].html + '</td></tr>');
	i++;
	}   
            });
        });
     });
    });
})
 
</script>

    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Project CAW 2014 - GitHub</a>
        </div>
      </div>
    </div>


    <br/><br/><br/><br/>
         
    <div class="container">
  		<div class="row">
  		  <div class="col-xs-12">
          <!--
          <form role="form" class="form-inline" action="#">
            <div class="form-group" >
                <label class="sr-only" for="caractere">Caractère : </label>
                <input type="text" id="caractervalue" class="form-control" name="caractervalue" placeholder="Caractères">
                <button type="submit" class="btn btn-default">Envoyer</button>
            </div>
          </form>-->
           <h2 class="sub-header">Insérer des caractères : </h2>
          <form role="form" action="#">
            <div class="row">
              <!--<div class="col-xs-2"><label for="exampleInputEmail1"  class="sr-only">Caractère : </label></div>-->
              <div class="col-md-8">
                <label for="caractere" id="caractere" class="sr-only">Caractère : </label>
                <input type="caractere" class="form-control" id="caractere" placeholder="Caractère">
              </div>
              <div class="col-md-2">
                <button id="submit" type="submit" class="btn  btn-default btn-block" title="Envoyer">Envoyer</button>
              </div>
              <div class="col-md-2">
                <button type="erase" class="btn  btn-default btn-block" title="Effacer">Effacer</span></button>
              </div>
            </div>

           </form><br/><br/>
        </div>
  		</div>
      <div class="row">
        <div class="col-xs-12">
          <div class="table-responsive">
            <table class="table table-striped table-bordered table-hover table-condensed">
            <thead>
              <tr>
                <th>Caractère</th>
                <th>Décimal</th>
                <th>Hexadécimal</th>
                <th>HTML</th>
              </tr>
              </thead>
              <tbody id ="r">

              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>


<br/><br/>
    <div class="blog-footer">
      <p>Touts droits réservée au Group   
      <a href="http://matis.univ-lehavre.fr/">MATIS</a>  <br/>
      <b>supervised by: </b>Monsieur Yoann Pigné<br/>
      <b>Client developed by: </b>Saidane, Roshanak, Mounir, Hilali<br/>
      <b> Serveur develiped by:  </b>Jason, Quentin, Mounirit, Bastien</p>
      <p>
      </p>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="../js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../js/bootstrap.min.js"></script>
  </body>
</html>
