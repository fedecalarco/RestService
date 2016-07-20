<%-- 
    Document   : index
    Created on : Jul 19, 2016, 2:16:21 PM
    Author     : federico.calarco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
        <title>University Finder</title>
    </head>
    <body>
        <div>
            <header><h1>University Finder</h1></header>

            <div id="main">

                <button onclick="getAllUniversities()">Show all universities</button> <br/><br/>

                <div id="content"></div>

            </div>



            <footer></footer>
        </div>

        <script>

            function getAllUniversities() {

                $.ajax({
                    type: "GET",
                    url: "${pageContext.request.contextPath}/universities/",
                    datatype: 'json',
                    success: function (response) {
                        showUniversities(response);
                    },
                    error: function (e) {
                        alert('Error: ' + e);
                    }
                });
            }

            function showUniversities(lstUniversities) {
                console.log(lstUniversities);
                $('#content').empty();

                for (i in lstUniversities) {
                    $('#content').append('<div>' + lstUniversities[i].name + '</div>');
                }

            }
        </script>


    </body>
</html>
