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
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" value="Andriatsara Iratra" required>
        </div> <br>
        <div>
            <label for="date_naissance">Date de naissance:</label>
            <input type="date" id="date_naissance" name="date_naissance" required>
        </div> <br>
        <div>
            <p>Genre :</p>
            <input type="radio" id="homme" name="genre" value="Homme" required>
            <label for="homme">Homme</label>
            <input type="radio" id="femme" name="genre" value="Femme">
            <label for="femme">Femme</label>
        </div> <br>
        <div>
            <input type="checkbox" id="test" name="test">
            <label for="test">Test</label>
        </div> <br>
        <div>
            <button type="submit">Submit</button>
        </div> 
    </form>
</body>
</html>