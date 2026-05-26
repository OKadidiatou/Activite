<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tableau de bord du client</title>

<link rel="stylesheet" href="DashboardClient.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">
    

</head>
<body>

 <div class="app-container">
        
        <div class="sidebar">
            <div>
                <div class="brand-logo">
    <img src="assets/images/logo.png" alt="Mon_Activite Logo" style="max-width: 80%; max-height: 80%; object-fit: contain;">
</div>

                <ul class="nav-menu">
                    <li><a href="#" class="nav-item-link"><i class="bi bi-house-door"></i> Tableau de bord</a></li>
                    <li><a href="CreerProfilServelet" class="nav-item-link"><i class="bi bi-people"></i> Renseigner Profil</a></li>
                    <li><a href="#" class="nav-item-link"><i class="bi bi-cash-coin"></i> Simuler Revenus</a></li>
                    <li><a href="#" class="nav-item-link active"><i class="bi bi-grid-1x2"></i> Liste Activité</a></li>
                    <li><a href="#" class="nav-item-link"><i class="bi bi-check-square"></i> Recommandation</a></li>
                    <li><a href="#" class="nav-item-link"><i class="bi bi-heart"></i> Favoris</a></li>
                    <li><a href="ModifierProfilServelet" class="nav-item-link"><i class="bi bi-person-gear"></i> Voir Profil</a></li>
                </ul>
            </div>

            <div class="d-flex align-items-center">
                <i class="bi bi-box-arrow-left text-white me-3 fs-3"></i>
                <button class="btn-logout">Deconnexion</button>
            </div>
        </div>

        <div class="main-panel">
            
            <div>
                <div class="d-flex justify-content-between align-items-center mb-5">
                    <h1 class="fw-bold mb-0" style="color: #000; font-size: 36px;">Liste des Activités</h1>
                    
                    <div class="user-profile-badge">
                        <i class="bi bi-person-circle"></i>
                        <span class="fw-semibold text-dark">Midouzer</span>
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

           

        

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>