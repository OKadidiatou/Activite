<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="Model.Entites.Activite" %>
<%@ page import="Model.Entites.Utilisateur" %>
<%
    // 1. Récupération sécurisée de l'utilisateur connecté depuis la session
    Utilisateur user = (Utilisateur) session.getAttribute("utilisateurConnecte");
    if (user == null) {
        response.sendRedirect("connexion.jsp");
        return;
    }

    // 2. Récupération de la liste des activités envoyée par le Servlet
    List<Activite> listActivites = (List<Activite>) request.getAttribute("activites");
    int totalActivites = (listActivites != null) ? listActivites.size() : 0;
%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mon_Activite - Liste des Activités</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Recommandation.css">
</head>
<body>

  <div class="container">

    <div class="menu">
        <div>
            <div class="logo">
                <img src="assets/logo.png" alt="Mon_Activite Logo">
            </div>

            <ul class="menu-list">
                <li><a href="client" class="menu-link"><i class="bi bi-house-door"></i> Tableau de bord</a></li>
                <li><a href="CreerProfilServelet" class="menu-link"><i class="bi bi-people"></i> Renseigner Profil</a></li>
                <li><a href="#" class="menu-link"><i class="bi bi-cash-coin"></i> Simuler Revenus</a></li>
                <li><a href="ListeActivitesServelet" class="menu-link active"><i class="bi bi-grid-1x2"></i> Liste Activité</a></li>
                <li><a href="Recommandation.jsp" class="menu-link"><i class="bi bi-check-square"></i> Recommandation</a></li>
                <li><a href="#" class="menu-link"><i class="bi bi-heart"></i> Favoris</a></li>
                <li><a href="VoirProfilServlet" class="menu-link"><i class="bi bi-person"></i> Voir Profil</a></li>
            </ul>
        </div>

        <div class="d-flex align-items-center">
            <i class="bi bi-box-arrow-left text-white me-3 fs-3"></i>
            <a href="DeconnexionServelet"
               class="btn btn-deconnexion text-decoration-none text-center">
               Déconnexion
            </a>
        </div>
    </div>

    <div class="contenu">

        <div>
            <div class="d-flex justify-content-between align-items-center mb-4">

                <h1 class="fw-bold mb-0"
                    style="color: #000; font-size: 36px;">
                    Liste des recommandation
                </h1>

                <div class="profil">
                    <i class="bi bi-person-circle"></i>
                    <span class="fw-semibold text-dark">
                        <%= user.getPrenom() %>
                    </span>
                </div>

            </div>

            <div class="row entete-table align-items-center mx-0 margin-top-auto">
                <div class="col-md-4">Nom</div>
                <div class="col-md-5">Description</div>
                <div class="col-md-3 text-end">Action</div>
            </div>

        </div>

    </div>

</div>
</body>
</html>