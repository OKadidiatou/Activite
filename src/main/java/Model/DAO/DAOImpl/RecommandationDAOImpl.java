package Model.DAO.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.DAO.DAOInter.ActiviteInter;
import Model.DAO.DAOInter.RecommandationDAOInter;
import Model.Entites.Activite;
import Model.Entites.Utilisateur;
import Model.InterfaceDB.Database;

<<<<<<< Updated upstream
public class RecommandationDAOImpl implements RecommandationInter {

	private Database db;

	// Constructeur conseillé
	public RecommandationDAOImpl(Database db) {
		this.db = db;
	}

	public List<Recommandation> afficher(int profilId) {

		List<Recommandation> liste = new ArrayList<>();
		String sql = "SELECT * FROM recommandation WHERE profilId = ?";

		try (Connection conn = this.db.connexion(); PreparedStatement ps = conn.prepareStatement(sql)) {

			// Remplacement du ? par l'identifiant du profil
			ps.setInt(1, profilId);

			try (ResultSet rs = ps.executeQuery()) {

				while (rs.next()) {

					Recommandation r = new Recommandation();

					r.setId(rs.getInt("id"));
					r.setDateAjout(rs.getDate("dateAjout"));

					liste.add(r);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return liste;
	}

	@Override
	public void ajouter(Recommandation r) {
		// TODO Auto-generated method stub

		String sql = "INSERT INTO recommandation(activiteId, profilId, dateAjout) VALUES (?, ?, ?)";

		try (Connection conn = this.db.connexion(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, r.getActivite().getId());
			ps.setInt(2, r.getProfil().getId());
			ps.setDate(3, new java.sql.Date(r.getDateAjout().getTime()));

			ps.executeUpdate();

			System.out.println("Ajout réussi");

		} catch (Exception e) {
			e.printStackTrace();
		}

=======
public class RecommandationDAOImpl implements RecommandationDAOInter{

	private final Database db;
	private final ActiviteInter activiteInter;

	public RecommandationDAOImpl(Database db,ActiviteInter activiteInter) {
		this.db = db;
		this.activiteInter = activiteInter;
>>>>>>> Stashed changes
	}

	@Override
	public void creer(Utilisateur personne, List<Activite> activites) {
		String query = "INSERT INTO recommandation(personneId,activiteId) VALUES (?,?)";
		try (Connection conn = this.db.connexion(); PreparedStatement ptmt = conn.prepareStatement(query)) {
			for (Activite activite : activites) {
				ptmt.setInt(1, personne.getId());
				ptmt.setInt(2, activite.getId());
				ptmt.executeUpdate();
			}
		} catch (SQLException e) {
			System.out.println("Erreur: " + e.getMessage());
		}
	}

<<<<<<< Updated upstream
		String sql = "DELETE FROM recommandation WHERE id = ?";

		try (Connection conn = this.db.connexion(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, id);
			ps.executeUpdate();

			System.out.println("Suppression réussie");

		} catch (Exception e) {
			e.printStackTrace();
		}
=======
	@Override
	public List<Activite> liste(int profilId) {

	    String query = """
	        SELECT *
	        FROM recommandation
	        WHERE profilId = ?
	        AND dateAjout = (
	            SELECT MAX(dateAjout)
	            FROM recommandation
	            WHERE profilId = ?
	        )
	        """;

	    List<Activite> activites = new ArrayList<>();

	    try (Connection conn = this.db.connexion();
	         PreparedStatement ptmt = conn.prepareStatement(query)) {

	        ptmt.setInt(1, profilId);
	        ptmt.setInt(2, profilId);

	        ResultSet rs = ptmt.executeQuery();

	        while (rs.next()) {
	            Activite activite = this.activiteInter.lire(rs.getInt("activiteId"));

	            if (activite != null) {
	                activites.add(activite);
	            }
	        }

	    } catch (SQLException e) {
	        System.out.println("Erreur : " + e.getMessage());
	    }

	    return activites;
>>>>>>> Stashed changes
	}

}
