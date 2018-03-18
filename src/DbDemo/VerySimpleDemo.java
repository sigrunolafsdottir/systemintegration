package DbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//Try with resources saves a lot of closing...
public class VerySimpleDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try (Connection con = DriverManager.getConnection(
                             "jdbc:mysql://localhost:3306/MyClothesShop",
                             "sigrun",
                             "secretpassword");
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
