<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE-edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css ">

    <title>Client1 Edition</title>
</head>

<body>
<header>
    <h1>Client1 Edition</h1>
</header>
<main>
    <form action="updateClient1" method="post">
        <div>
            <label hidden="hidden"  for="id">Nom :
            </label>
            <input hidden="hidden" type="text" id="id" name="id" value="${client1View.id}">
        </div>
        <div>
            <label for="nom">Nom :
            </label>
            <input type="text" id="nom" name="nom" value="${client1View.nom}">
        </div>
        <div>
            <label for="email">Email:
            </label>
            <input type="email" id="email" name="email" value="${client1View.email}">
        </div>
        <div>
            <label for="telephone">Telephone:
            </label>
            <input type="tel" id="telephone" name="telephone" value="${client1View.telephone}">
        </div>
        <div>
            <input type="" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="client1List">Client1 List</a>
</footer>
</body>
</html>
