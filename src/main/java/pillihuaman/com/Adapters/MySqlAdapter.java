package pillihuaman.com.Adapters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import pillihuaman.com.*;

import java.io.IOException;
import java.sql.*;

public class MySqlAdapter {
	 public static Connection connectDatabase() throws IOException {
	        String url = null;
	        Connection connection = null;
	        try {
	        	AppPropertiesConfig AppPropertiesConfig= new AppPropertiesConfig();
	        	String host=AppPropertiesConfig.getPropValues("host");
	        	String port=AppPropertiesConfig.getPropValues("port");
	        	String database=AppPropertiesConfig.getPropValues("database");
	        	String user=AppPropertiesConfig.getPropValues("user");
	        	String password=AppPropertiesConfig.getPropValues("password");
	        	
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	            } catch (ClassNotFoundException ex) {
	                System.out.println("Error al registrar el driver de MySQL: " + ex);
	            }
	          
	            url ="jdbc:mysql://" + host + ":" + port + "/" + database;
	            // Database connect
	            // Conectamos con la base de datos
	            connection = DriverManager.getConnection(
	                    url,
	                    user, password);           
	            boolean valid = connection.isValid(50000);
	            System.out.println(valid ? "TEST OK" : "TEST FAIL");
	        } catch (java.sql.SQLException sqle) {
	            System.out.println("Error al conectar con la base de datos de MySQL (" + url + "): " + sqle);
	        }
			return connection;
	    }       
	 public static EntityDBConnection getConnectionString() throws IOException 
	 {   EntityDBConnection obj= new EntityDBConnection();
	  try {
	        AppPropertiesConfig AppPropertiesConfig= new AppPropertiesConfig();
			obj.setHost(AppPropertiesConfig.getPropValues("host"));
			obj.setPort(AppPropertiesConfig.getPropValues("port"));
			obj.setDatabase(AppPropertiesConfig.getPropValues("database"));
			obj.setUser(AppPropertiesConfig.getPropValues("user"));
			obj.setPassword(AppPropertiesConfig.getPropValues("password"));
			obj.setUrl("jdbc:mysql://"+obj.getHost()+":"+obj.getPort()+"/"+obj.getDatabase());
		} catch (Exception e) {
			// TODO: handle exception
			 throw e;
		}
			return obj;
	 }
}


