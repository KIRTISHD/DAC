<?php

    $email = $name = $age = $pass = "";

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $email = $_POST["email"];
        $name = $_POST["name"];
        $age = $_POST["age"];
        $pass = $_POST["pass"];
    }

    if(isset($_POST["add"])){

        $servername = "localhost";
        $uname = "root";
        $p = "actscdac";
        $db = "mydb";
    
        $conn = mysqli_connect($servername,$uname,$p,$db);
        
        if (!$conn){
            die( " Connection failed" . mysqli_connect_error());
        }
    
       // $query = "INSERT INTO lalala(naav,email,pass,age) values ('$name','$email','$pass','$age')";
       $query = "INSERT INTO lalala(naav,email,pass,age) values (?,?,?,?)";

       $ustmt = mysqli_prepare($conn,$query);
       mysqli_stmt_bind_param($ustmt,'sssi',$name,$email,$pass,$age);
       mysqli_stmt_execute($ustmt);

    /*
        if (mysqli_query($conn,$query)){
            echo "JHALA RE TU ADD";
        }
        else{
            echo "LUCK NAHI TUJA CHANGLA" . "Ha error aala-" . mysqli_error($conn) ;
        }
    */
        mysqli_close($conn);
    }

    if(isset($_POST["find"])){

        $servername = "localhost";
        $uname = "root";
        $p = "actscdac";
        $db = "mydb";
    
        $conn = mysqli_connect($servername,$uname,$p,$db);
        
        if (!$conn){
            die( " Connection failed" . mysqli_connect_error());
        }
    
       // $query = "INSERT INTO lalala(naav,email,pass,age) values ('$name','$email','$pass','$age')";
       $query = "SELECT * FROM lalala where naav  = ?";

       $ustmt = mysqli_prepare($conn,$query);
       mysqli_stmt_bind_param($ustmt,'s',$name);
       mysqli_stmt_execute($ustmt);
       $result = mysqli_stmt_get_result($ustmt,'ssi',$email,$pass,$age);


       
    /*
        if (mysqli_query($conn,$query)){
            echo "JHALA RE TU ADD";
        }
        else{
            echo "LUCK NAHI TUJA CHANGLA" . "Ha error aala-" . mysqli_error($conn) ;
        }
    */
        mysqli_close($conn);
    }


?>
