package datos;

import java.sql.*;

public class Conexion {

	//ESTA CLASE SE ENCARGA DE LA CONEXION
	private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "julicastro_";
	
	public static Connection getConnection() throws SQLException{
		//retorna un tipo interface Connection
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	}
	public static void close(ResultSet rs) throws SQLException {
		rs.close();
	}
	public static void close(PreparedStatement smtm) throws SQLException {
		smtm.close();
	}
	public static void close(Connection conn) throws SQLException {
		conn.close();
	}
}
