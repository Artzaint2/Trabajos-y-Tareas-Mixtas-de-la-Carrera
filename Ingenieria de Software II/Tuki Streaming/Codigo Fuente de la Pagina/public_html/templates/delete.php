<?php 
include('../BDD/db.php');

if(isset($_GET['ID'])){
    $ID = $_GET['ID'];
    $query = "DELETE FROM datos WHERE ID = $ID ";
    $result = mysqli_query($conex, $query);
    if (!$result){
        die("query Failed");
    }
    $_SESSION['message'] = 'tarea satisfactoria';
    $_SESSION['message_type'] = 'danger';
    header("location:adminPanel.php");
    
}

?>