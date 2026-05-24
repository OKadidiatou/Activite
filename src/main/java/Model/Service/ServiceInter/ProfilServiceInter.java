package Model.Service.ServiceInter;

import Model.Entites.Profil;

public interface ProfilServiceInter {
	void creerProfil(Profil profil);

    Profil obtenirProfilParId(int id);

    Profil obtenirProfilParUtilisateur(int utilisateurId);

    void modifierProfil(Profil profil);

    void supprimerProfil(int id);
}
