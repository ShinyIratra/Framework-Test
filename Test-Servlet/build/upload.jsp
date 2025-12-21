<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Test Upload Framework</title>
</head>
<body>
    <h1>Test d'Upload</h1>
    <form action="upload" method="post" enctype="multipart/form-data">
        
        <p>
            <label>Image 1 :</label>
            <input type="file" name="file1" />
        </p>
        
        <p>
            <label>PDF ou Image 2 :</label>
            <input type="file" name="file2" />
        </p>

        <button type="submit">Envoyer au serveur</button>
    </form>
</body>
</html>