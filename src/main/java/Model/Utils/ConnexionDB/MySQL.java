package Model.Utils.ConnexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.InterfaceDB.Database;

public class MySQL implements Database {
	private Connection conn;

	@Override
	public Connection connexion() {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/application_recommandation";
		String username = "root";
		String passwd = "AbdoulayeDiallo@223";

		try {
			conn = DriverManager.getConnection(url, username, passwd);
		} catch (SQLException e) {
			System.out.println("Erreur: " + e.getMessage());
		}
		return conn;
	}

	@Override
	public void deconnexion(Connection conn) {
		// TODO Auto-generated method stub
		if (conn == null) {
			return;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Erreur: " + e.getMessage());
		}
		
	}

}
