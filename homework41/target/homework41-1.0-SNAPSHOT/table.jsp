<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Table of prime numbers</title>

    <style>
        .chess-board {
            border-collapse: collapse;
            position: absolute;
            left: 600px;
            top: 240px;
        }

        .chess-board td {
            border: 1px solid;
            width: 2em;
            height: 2em;
        }

        .chess-board .light {
            background: #eee;
        }

    </style>

</head>
<body>

<%
    ArrayList<Integer> list = new ArrayList<>();
    int count = 0;
    for (int j = 2; j <= 541; j++) {
        count = 0;
        for (int i = 1; i <= j; i++) {
            if (j % i == 0) {
                count++;
            }
        }
        if (count == 2)
            list.add(j);
    }

%>
<table class="chess-board">
    <% int k = 0;
        for (int f = 0; f < 10; f++) { %>
    <tr>
        <% for (int j = 0; j < 10; j++) { %>
        <td>

            <%
                out.print(list.get(k));
                k++;%>

        </td>

        <% } %>

    </tr>

    <% } %>
</table>
</body>
</html>