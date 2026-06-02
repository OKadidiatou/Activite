<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>Gestion agents terrain</title>

<link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
<link rel="stylesheet" href="Dashboard_Agent_Terrain.css">
</head>

<body>

<div class="wrapper">

    <!-- SIDEBAR -->
    <div class="sidebar">

        <div class="logo">
            <div class="logo-circle">
                mon<br>activité
            </div>
        </div>

        <div class="nav">
            <a href="#"><i class="fa fa-home"></i> Dashboard</a>
            <a href="#"><i class="fa fa-list"></i> Activités</a>
            <a href="#"><i class="fa fa-cogs"></i> Compétences</a>
            <a class="active" href="#"><i class="fa fa-users"></i> Agents terrain</a>
        </div>

        <div class="logout">
            <i class="fa fa-sign-out"></i> Déconnexion
        </div>

    </div>

    <!-- MAIN -->
    <div class="main">

        <div class="header">
            <div class="title">Gestion des agents du terrain</div>

            <div class="profile">
                <i class="fa fa-user-circle"></i>
                Aicha
            </div>
        </div>

        <div class="toolbar">
            <div class="filter">
                <i class="fa fa-sliders"></i>
                Filtre par
            </div>

            <button class="add">
                <i class="fa fa-plus"></i>
            </button>
        </div>

        <div class="table-card">

            <table>

                <thead>
                    <tr>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>Téléphone</th>
                        <th>Actions</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>Malia</td>
                        <td>Zakaría</td>
                        <td>+223 97 16 74 07</td>
                        <td>
                            <div class="actions">
                                <div class="icon edit"><i class="fa fa-pen"></i></div>
                                <div class="icon delete"><i class="fa fa-trash"></i></div>
                            </div>
                        </td>
                    </tr>

                    <tr>
                        <td>Ouattara</td>
                        <td>Kadiatou</td>
                        <td>+223 83 51 19 91</td>
                        <td>
                            <div class="actions">
                                <div class="icon edit"><i class="fa fa-pen"></i></div>
                                <div class="icon delete"><i class="fa fa-trash"></i></div>
                            </div>
                        </td>
                    </tr>

                    <tr>
                        <td>Diacko</td>
                        <td>Aliou</td>
                        <td>+223 76 04 95 39</td>
                        <td>
                            <div class="actions">
                                <div class="icon edit"><i class="fa fa-pen"></i></div>
                                <div class="icon delete"><i class="fa fa-trash"></i></div>
                            </div>
                        </td>
                    </tr>

                    <tr>
                        <td>Diallo</td>
                        <td>Dembo</td>
                        <td>+223 78 60 53 11</td>
                        <td>
                            <div class="actions">
                                <div class="icon edit"><i class="fa fa-pen"></i></div>
                                <div class="icon delete"><i class="fa fa-trash"></i></div>
                            </div>
                        </td>
                    </tr>
                </tbody>

            </table>

        </div>

    </div>

</div>

</body>
</html>