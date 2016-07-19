<%-- 
    Document   : index
    Created on : Jul 19, 2016, 2:16:21 PM
    Author     : federico.calarco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>University Finder</title>
    </head>
    <body>
        <div>
            <div id="header"><h1>University Finder</h1></div>

            <div id="main">


            </div>

            <div id="footer"></div>
        </div>

        <script>

            function addUniversity() {

                $.ajax({
                    type: "GET",
                    url: "${pageContext.request.contextPath}/sales/addSaleAjax",
                    datatype: 'json',
                    data: {sales: "order"},
                    success: function (res) {
                        noname(res);
                    },
                    error: function (e) {
                        alert('Error 2: ' + e);
                    }
                });
            }
        </script>


    </body>
</html>
