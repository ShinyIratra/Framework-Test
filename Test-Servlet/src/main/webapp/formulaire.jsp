<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>${titre}</h1>

    <form action="formulaire" method="post">
        <div>
            <label for="id">Id:</label>
            <input type="number" id="id" name="e.id" value="1" required>
        </div> <br>
        <div>
            <label for="name">Name:</label>
            <input type="text" id="name" name="e.name" value="Robert" required>
        </div> <br>
        <div>
            <label for="departement0">Departement 1:</label>
            <input type="text" id="departement0" name="e.departements[0].name" value="Informatique" required>
        </div> <br>
        <div>
            <label for="departement1">Departement 2:</label>
            <input type="text" id="departement1" name="e.departements[1].name" value="Ressources Humaines">
        </div> <br>
        <div>
            <button type="submit">Submit</button>
        </div> 
    </form>
</body>
</html>