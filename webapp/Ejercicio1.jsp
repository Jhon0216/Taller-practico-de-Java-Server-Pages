<%-- 
    Document   : Ejercicio1
    Created on : 26/04/2021, 3:11:32 p. m.
    Author     : alberto_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Convertidor</title>
    </head>
    <body>
        <h1>Convertidor de COP a Dolares</h1>
        <p><h4>Recuerda que 1 COP(Pesos Colombianos) es equivalente a 0.00028 Dolares</h4></p>
        <p><h2>Ingrese la cantidad de COP(Pesos Colombianos):</h2></p>
        <form action="Ejercicio1" method="get">
            <p><input type="number" name="numero1" value="0"></p>
            <p><input type="submit" value="Convertir a Dolares" onclick="window.alert('Va a convertir COP a Dolar');"></p>
        </form>
    </body>
</html>
