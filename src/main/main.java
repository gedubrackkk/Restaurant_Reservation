package main;
import java.sql.^;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public class DatabaseConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestoManagement", "username", "password");
            // here RestoManagement is the database name, username is your database username, password is your database password
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
}
