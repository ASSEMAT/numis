package fr.bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Lancement {

	List<TypesMonnaies> list = new ArrayList<TypesMonnaies>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		ResultSet résultats = null;
		String requete = "";
		// chargement du pilote
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e) {
			arret("Impossible de charger le pilote jdbc:odbc");
		}
		// connection a la base de données
		affiche("connexion a la base de données");
		try {
			//String DBurl = "jdbc:mysql://localhost/mySql56", "root", "root");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/numis", "root", "root");
		} catch (SQLException e) {
			arret("Connection à la base de données impossible");
		}

		// creation et execution de la requete
		affiche("creation et execution de la requête");
		requete = "SELECT * FROM TypesMonnaies";
		try {
			Statement stmt = con.createStatement();
			résultats = stmt.executeQuery(requete);
		} catch (SQLException e) {
			arret("Anomalie lors de l'execution de la requête");
		}

		// parcours des données retournées
		affiche("parcours des données retournées");
		try {
			ResultSetMetaData rsmd = résultats.getMetaData();
			int nbCols = rsmd.getColumnCount();
			boolean encore = résultats.next();
			while (encore) {
				for (int i = 1; i <= nbCols; i++)

					System.out.print(résultats.getString(i) + " ");
				System.out.println();
				encore = résultats.next();
			}
			résultats.close();
		} catch (SQLException e) {
			arret(e.getMessage());
		}
		affiche("fin du programme");
	}

	private static void affiche(String message) {
		System.out.println(message);
	}

	private static void arret(String message) {
		System.err.println(message);
		System.exit(99);
	}

}
