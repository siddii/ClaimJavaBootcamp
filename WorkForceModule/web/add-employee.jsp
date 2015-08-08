<%--
  Created by IntelliJ IDEA.
  User: siddique
  Date: 7/20/15
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.4.js"></script>

    <style>
        .spinner {
            display: none;
        }

        .success-message {
            display: none;
        }

        .validation-error {
            display: none;
        }

    </style>

    <script type="text/javascript">

        function successCb() {
            $('.spinner').fadeOut();
            $('.success-message').html("Employee Added Successfully").fadeIn();
        }

        $(function (){
            $( "#add-employee" ).submit(function( event ) {

                var firstName = $('#firstName').val(), lastName = $('#lastName').val(), ssn = $('#ssn').val();

                if (firstName == "" || lastName == "" || ssn == "") {
                    $(".validation-error").html("One or more input value should be filled in..").fadeIn();
                }
                else {
                    $('.spinner').show();

                    $.ajax({
                        type: "POST",
                        url: 'employee',
                        data: {firstName: firstName, lastName: lastName, ssn: ssn},
                        success: successCb
                    });

                }
                event.preventDefault();
            });
        })
    </script>

</head>
<body>

<div class="container">
    <h1>Add Employee <span class="glyphicon glyphicon-user"></span></h1>

    <div class="alert alert-danger validation-error" role="alert"></div>
    <div class="alert alert-success success-message" role="alert"></div>

    <form class="form-h" id="add-employee">
        <div class="form-group">
            <label for="firstName">First Name</label>
            <input class="form-control" type="text" id="firstName" name="firstName"/>
        </div>
        <div class="form-group">
            <label for="lastName">Last Name</label>
            <input class="form-control" type="text" id="lastName" name="lastName"/>
        </div>
        <div class="form-group">
            <label for="ssn">SSN</label>
            <input class="form-control" type="text" id="ssn" name="ssn"/>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>

        <img class="spinner" src="ajax-loader.gif"/>
    </form>
</div>

</body>
</html>
