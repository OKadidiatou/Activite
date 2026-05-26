<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tableau de bord</title>

<link rel="stylesheet" href="Dashbord.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

</head>
<body>

<div class="container">


    <div class="sidebar">

        <div class="logo">
            <img src="assets/logo.png" alt="logo">
        </div>

        <ul class="menu">

            <li class="active">
                <i class="fa-solid fa-house"></i>
                <span>Tableau de bord</span>
            </li>

            <li>
                <i class="fa-solid fa-file"></i>
                <span>Activités</span>
            </li>

            <li>
                <i class="fa-solid fa-users"></i>
                <span>Liste des clients</span>
            </li>

        </ul>

        <div class="logout">
            <i class="fa-solid fa-right-from-bracket"></i>
            <span>Déconnexion</span>
        </div>

    </div>


    <div class="main-content">


        <div class="header">

            <h1>Tableau de bord</h1>

            <div class="user">

                <div class="user-icon">
                    <i class="fa-solid fa-user"></i>
                </div>

                <span>${nomUtilisateur}</span>

            </div>

        </div>


        <div class="welcome-card">

            <div>

                <h3>
                    Bienvenue ${nomUtilisateur} !
                </h3>

                <p>
                    Gérez vos missions et suivez vos activités
                </p>

                <p>
                    en un seul endroit.
                </p>

            </div>

            <div class="welcome-icon">
                <i class="fa-regular fa-user"></i>
            </div>

        </div>

        <!-- STATISTIQUES -->

        <div class="stats">

            <div class="card">
                <p>Activités inserer</p>
                <h2>${nbActivites}</h2>
            </div>

            <div class="card">
                <p>Clients inscrits</p>
                <h2>${nbClients}</h2>
            </div>

            <div class="card">
                <p>Missions</p>
                <h2>${nbMissions}</h2>
            </div>

        </div>

    </div>

</div>

</body>
</html>