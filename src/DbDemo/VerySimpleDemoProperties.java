package DbDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


//Try with resources saves a lot of closing...
public class VerySimpleDemoProperties {

    public static void main(String[] args) throws  FileNotFoundException, IOException {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("klassen kunde inte hittas: com.mysql.jdbc.Driver");
            e.printStackTrace();
        }
        Properties p = new Properties();
        p.load(new FileInputStream("src/DbDemo/Settings.properties"));
        
        try (Connection con = DriverManager.getConnection(
                p.getProperty("connectionString"),
                             p.getProperty("name"),
                             p.getProperty("password"));
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("select id, name, city from customer")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");

                System.out.println("id: " + id + ", name: " + name + ", city: " + city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
