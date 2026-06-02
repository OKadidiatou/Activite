package Controller.Profil;

import Model.DAO.DAOImpl.ProfilDAOImpl;
import Model.Entites.Competence;
import Model.Entites.Profil;
import Model.Entites.Utilisateur;
import Model.Enumeration.TypeZone;
import Model.InterfaceDB.Database;

import Model.Service.ServiceImpl.ProfilServiceImpl;
import Model.Service.ServiceInter.ProfilServiceInter;
import Model.Utils.ConnexionDB.MySQL;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/profil")
public class CreerProfilServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProfilServiceInter profilService;

	@Override
	public void init() throws ServletException {

		Database db = new MySQL();
		ProfilDAOImpl profilDAO = new ProfilDAOImpl(db);
		this.profilService = new ProfilServiceImpl(profilDAO);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/RenseignerProfil.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			int utilisateurId = Integer.parseInt(request.getParameter("utilisateurId"));
			double disponibilite = Double.parseDouble(request.getParameter("disponibilite"));
			double capital = Double.parseDouble(request.getParameter("capital"));
			String zoneStr = request.getParameter("zone");
			boolean accessInternet = Boolean.parseBoolean(request.getParameter("accessInternet"));

			String[] competencesSaisies = request.getParameterValues("competences");
			List<Competence> listeCompetences = new ArrayList<>();

			if (competencesSaisies != null) {
				for (String nomComp : competencesSaisies) {
					Competence comp = new Competence();
					comp.setNom(nomComp); //
					listeCompetences.add(comp);
				}
			}

			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setId(utilisateurId);

			Profil profil = new Profil();
			profil.setUtilisateur(utilisateur);
			profil.setDisponibilite(disponibilite);
			profil.setCapital(capital);
			profil.setAccessInternet(accessInternet);
			if (zoneStr != null) {
				profil.setZone(TypeZone.valueOf(zoneStr));
			}
			profil.setCompetences(listeCompetences);

			profilService.creerProfil(profil);

			response.sendRedirect(request.getContextPath() + "/succes.jsp");

		} catch (IllegalArgumentException e) {

			request.setAttribute("error", e.getMessage());

			request.getRequestDispatcher("/RenseignerProfil.jsp").forward(request, response);

		} catch (Exception e) {

			request.setAttribute("error", "Une erreur inattendue est survenue : " + e.getMessage());
			request.getRequestDispatcher("/RenseignerProfil.jsp").forward(request, response);
		}
	}
}