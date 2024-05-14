<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">

    <title>Clients1 List</title>
</head>
<body>
<header>
    <h1>Clients1 List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">NOM</th>
            <th scope="col">EMAIL</th>
            <th scope="col">TELEPHONE</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${client1Vue}" var="client1">
            <tr>
                <td>${client1.id}</td>
                <td>${client1.nom}</td>
                <td>${client1.email}</td>
                <td>${client1.telephone}</td>
                <td>${client1.client1State}</td>
                <td>
                    <a
                            onclick="return confirm('vous voulez vraiment supprimer ce client?')"
                            href="deleteClient1?id=${client1.id}">
                        Delete
                    </a>
                </td>
                <td>
                    <a
                            href="editClient1?id=${client1.id}">
                        Edit
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</main>
<footer>
    <a href="createClient1">Customer Creation</a>
</footer>
</body>
</html>