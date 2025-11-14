<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Test</title>
    <style>
        body {
            background: #f4f4f4;
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }
        .container {
            background: #fff;
            padding: 32px 24px;
            border-radius: 12px;
            box-shadow: 0 2px 8px rgba(0,0,0,0.08);
            text-align: center;
        }
        .error-box {
            background-color: #e53935;
            color: #fff;
            width: 220px;
            height: 60px;
            display: flex;
            align-items: center;
            justify-content: center;
            border-radius: 8px;
            margin: 18px auto;
            font-weight: bold;
            font-size: 1.1em;
        }
        .btn-retour {
            background: #1976d2;
            color: #fff;
            border: none;
            padding: 8px 18px;
            border-radius: 6px;
            cursor: pointer;
            font-size: 1em;
            margin-top: 12px;
            transition: background 0.2s;
        }
        .btn-retour:hover {
            background: #1565c0;
        }
    </style>
</head>
<body>
    <div class="container">
        <p>Pour tester l'affichage avec Model View</p>
        <div class="error-box">
            Erreur : <%= request.getAttribute("error") %>
        </div>

        <% for(Integer num : (Integer[]) request.getAttribute("numbers")) { %>
            <span><%= num %> </span>
        <% } %>
    </div>
</body>
</html>