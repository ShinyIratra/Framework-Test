<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire Test</title>
    <style>
        /* Reset CSS */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            background: linear-gradient(135deg, #6a11cb, #2575fc);
            font-family: 'Roboto', Arial, sans-serif;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            color: #333;
        }

        .container {
            background: #fff;
            padding: 40px 30px;
            border-radius: 16px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }

        .container h1 {
            font-size: 1.8em;
            margin-bottom: 20px;
            color: #444;
        }

        .container p {
            font-size: 1em;
            margin-bottom: 24px;
            color: #666;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group input[type="text"] {
            width: 100%;
            padding: 12px 16px;
            border: 1px solid #ddd;
            border-radius: 8px;
            font-size: 1em;
            outline: none;
            transition: border-color 0.3s;
        }

        .form-group input[type="text"]:focus {
            border-color: #6a11cb;
        }

        .btn-submit {
            background: #6a11cb;
            color: #fff;
            border: none;
            padding: 12px 20px;
            border-radius: 8px;
            cursor: pointer;
            font-size: 1em;
            transition: background 0.3s;
        }

        .btn-submit:hover {
            background: #5a0fb5;
        }

        .btn-retour {
            display: inline-block;
            margin-top: 16px;
            color: #6a11cb;
            text-decoration: none;
            font-size: 0.9em;
            transition: color 0.3s;
        }

        .btn-retour:hover {
            color: #5a0fb5;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Bienvenue</h1>
        <p>Veuillez remplir le formulaire ci-dessous :</p>
        <form action="/TestServlet/post_user" method="post">
            <div class="form-group">
                <input type="text" name="iratra" placeholder="Iratra">
                <input type="text" name="tafita" placeholder="Tafita">
            </div>
            <button type="submit" class="btn-submit">Envoyer</button>
        </form>
    </div>
</body>
</html>