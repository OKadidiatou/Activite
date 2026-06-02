<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter un agent du terrain</title>

    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="Ajouter_Agent_Terrain.css">
</head>

<body>

<div class="container">

    <!-- HEADER -->
    <div class="header">

        <a href="<%= request.getContextPath() %>/agents" class="back-btn">
            <span class="arrow">
                <i></i>
            </span>
        </a>

        <h1>Ajouter un agent du terrain</h1>

        <div class="spacer"></div>

    </div>

    <!-- Messages d'erreur / succès -->
    <% if (request.getAttribute("erreur") != null) { %>
        <div class="alert alert-error"><%= request.getAttribute("erreur") %></div>
    <% } %>
    <% if (request.getAttribute("succes") != null) { %>
        <div class="alert alert-success"><%= request.getAttribute("succes") %></div>
    <% } %>

    <!-- FORM -->
    <form action="<%= request.getContextPath() %>/ajouterAgent" method="post">

        <div class="form-row">
            <div class="form-group">
                <label for="nom">Nom</label>
                <input type="text" id="nom" name="nom" required>
            </div>

            <div class="form-group">
                <label for="telephone">Téléphone</label>
                <input type="text" id="telephone" name="telephone" required>
            </div>
        </div>

        <div class="form-row">
            <div class="form-group">
                <label for="prenom">Prénom</label>
                <input type="text" id="prenom" name="prenom" required>
            </div>

            <div class="form-group">
                <label for="motDePasse">Mot de passe</label>
                <input type="password" id="motDePasse" name="motDePasse" required>
            </div>
        </div>

        <div class="btn-container">
            <button type="submit">Ajouter</button>
        </div>

    </form>

</div>

</body>
</html>
