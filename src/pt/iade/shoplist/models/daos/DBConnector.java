package pt.iade.shoplist.models.daos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnector {
	private static final String URL = "jdbc:mysql://remotemysql.com:3306/54tXwN8Pvu?useSSL=false";
	private static final String PASS = "76xzEVYYOF";
	private static final String USER = "54tXwN8Pvu";

	private static Connection connector;
	private DBConnector () {}
	
	public static Connection getConnection() {
		try {
			if (connector == null ||
					connector.isClosed())
				connector = DriverManager.
					getConnection(URL,USER,PASS);
			return connector;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
