package Model.Service.ServiceImpl;

import Model.DAO.DAOImpl.ProfilDAOImpl;
import Model.Entites.Profil;
import Model.Service.ServiceInter.ProfilServiceInter;

public class ProfilServiceImpl implements ProfilServiceInter {

	private ProfilDAOImpl profilDAOImpl;

	public ProfilServiceImpl(ProfilDAOImpl profilDAOImpl) {
		this.profilDAOImpl = profilDAOImpl;
	}

	@Override
	public void creerProfil(Profil profil) {
		// TODO Auto-generated method stub

		if (profil.getDisponibilite() <= 0) {
			System.out.println("Disponibilité invalide.");
			return;
		}

		if (profil.getCapital() < 0) {
			System.out.println("Capital invalide.");
			return;
		}

		if (profil.getZone() == null) {

			System.out.println("Zone obligatoire.");
			return;
		}

		profilDAOImpl.ajouter(profil);

	}

	@Override
	public Profil obtenirProfilParId(int id) {
		// TODO Auto-generated method stub
		if (id <= 0) {
			System.out.println("ID invalide.");
			return null;
		}

		return profilDAOImpl.trouverParId(id);
	}

	@Override
	public Profil obtenirProfilParUtilisateur(int utilisateurId) {
		// TODO Auto-generated method stub
		if (utilisateurId <= 0) {
			System.out.println("Utilisateur invalide.");
			return null;
		}

		return profilDAOImpl.trouverParUtilisateur(utilisateurId);
	}

	@Override
	public void modifierProfil(Profil profil) {
		// TODO Auto-generated method stub

		if (profil == null) {
			System.out.println("Profil introuvable.");
			return;
		}

		profilDAOImpl.modifier(profil);

		System.out.println("Profil modifié.");

	}

	@Override
	public void supprimerProfil(int id) {
		// TODO Auto-generated method stub
		if (id <= 0) {
			System.out.println("ID invalide.");
			return;
		}

		profilDAOImpl.supprimer(id);

	}

}
