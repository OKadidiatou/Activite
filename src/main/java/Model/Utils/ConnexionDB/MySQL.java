package Model.Utils.ConnexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.InterfaceDB.Database;

public class MySQL implements Database {
	private Connection conn;

	@Override
	public Connection connexion() {

		String url = "jdbc:mysql://localhost:3306/application_recommandation";

<<<<<<< HEAD
	    String username = "root";
	    String passwd = "2309";
=======
		String username = "root";
		String passwd = "12345";
>>>>>>> 3874f14e1ecc678826c4bddaa2ac2f01204bc6f8

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, passwd);

			System.out.println("Connexion MySQL réussie");

		} catch (Exception e) {

			System.out.println("Erreur connexion : " + e.getMessage());

			e.printStackTrace();
		}

		return conn;
	}

	@Override
	public void deconnexion(Connection conn) {
		// TODO Auto-generated method stub

	}

}
