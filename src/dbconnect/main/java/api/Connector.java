package dbconnect.main.java.api;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import dbconnect.main.java.model.Alumno;

public class Connector {
	
	
	private static String USER;
	private final static String DB_USER_KEY="db.user";

	private static String PASS;
	private final static String DB_PASS_KEY="db.pass";
	
	private static String JDBC_URL;
	private final static String DB_URL_KEY="db.url";
	
	private final static String PROPERTIES_URI = "./resources/db.properties";
	
	public Connector() {
		super();
		loadProperties();
	}
	
	public void loadProperties() {
		try {
			Properties properties = new Properties();
			properties.load(new FileReader(PROPERTIES_URI));
			USER = properties.getProperty(DB_USER_KEY);
			PASS = properties.getProperty(DB_PASS_KEY);
			JDBC_URL = properties.getProperty(DB_URL_KEY);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void connect() throws SQLException, ClassNotFoundException {
		
		

		Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASS); 
		Statement statement=connection.createStatement();  
		
		ResultSet rs=statement.executeQuery("select * from alumno");  
		
		while(rs.next()) {//Avanza de posición en el listado de registros y devuelve true si existe tal
			Alumno alumno = new Alumno(Integer.valueOf(rs.getString(1)), rs.getString(2), rs.getString(3), 
										rs.getString(4), rs.getString(5));
			System.out.println(alumno);
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		}
		connection.close();  

	}
	

}
