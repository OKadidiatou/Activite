package Model.DAO.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.DAO.DAOInter.ActiviteCompetenceInter;
import Model.Entites.Activite;
import Model.Entites.Competence;
import Model.InterfaceDB.Database;

public class ActiviteCompetenceDAOImpl implements ActiviteCompetenceInter {
	
	private final Database db;
	private final CompetenceDAOImpl competenceTable;

	public ActiviteCompetenceDAOImpl(Database db, CompetenceDAOImpl competenceTable) {
		this.db = db;
		this.competenceTable = competenceTable;
	}
	

	@Override
	public void creer(Activite activite) {
		// TODO Auto-generated method stub
		
		String query = "INSERT INTO activite_competence(activiteId,competenceId) VALUES (?,?)";
		try (Connection conn = this.db.connexion(); PreparedStatement ptmt = conn.prepareStatement(query)) {
			List<Competence> competences = activite.getCompetences();
			for (Competence competence : competences) {
				ptmt.setInt(1, activite.getId());
				ptmt.setInt(2, competence.getId());
				ptmt.executeUpdate();
			}
		} catch (SQLException e) {
			System.out.println("Erreur :" + e.getMessage());
		}
		
	}

	@Override
	public List<Competence> lire(Activite activite) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM activite_competence where activiteId = ?";
		List<Competence> competences = new ArrayList<>();
		try (Connection conn = this.db.connexion(); PreparedStatement ptmt = conn.prepareStatement(query)) {
			ptmt.setInt(1, activite.getId());
			try (ResultSet rs = ptmt.executeQuery()) {
				while (rs.next()) {
					competences.add(this.competenceTable.trouverCompetenceParId(rs.getInt("competenceId")).get());
				}
			} catch (SQLException e) {
				System.out.println("Erreur :" + e.getMessage());
			}
		} catch (SQLException e) {
			System.out.println("Erreur :" + e.getMessage());
		}
		return competences;
	}

}
