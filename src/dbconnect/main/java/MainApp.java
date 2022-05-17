package dbconnect.main.java;

import java.lang.System.Logger;
import java.sql.SQLException;

import dbconnect.main.java.api.Connector;

public class MainApp {

	
	
		public static void main(String[] args) {
			try {
				new Connector().connect();
			} catch (SQLException | ClassNotFoundException e) {

				e.printStackTrace();
			}
		}
}
