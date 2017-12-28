package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.faces.context.FacesContext;

public class DBHelper {
	private static DBHelper instance;
	
	private DBHelper(){}
	
	public Connection connect() throws ClassNotFoundException {
        Connection conn = null;
        String path = "jdbc:sqlite:"+FacesContext.getCurrentInstance().getExternalContext().getRealPath("/")+"resources\\db\\pizza.db";
        try {
        	Class.forName("org.sqlite.JDBC");
        	conn = DriverManager.getConnection(path);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
	
	public static DBHelper getInstance() {
		if (instance == null) {
			instance = new DBHelper();
		}
		return instance;
	}
}
