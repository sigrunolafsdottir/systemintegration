package V3_övn7_tomtensDashboard;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class Repository {

    private Properties p = new Properties();
    
    public Repository(){
        try {
            p.load(new FileInputStream("src/V3_övn7_tomtensDashboard/Settings.properties"));
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
      
    public List<Child> getAllChildren(){
        List<Child> allElves = new ArrayList<>();
        
        try (Connection con = DriverManager.getConnection(p.getProperty("connectionString"),
                             p.getProperty("name"),
                             p.getProperty("password"));
                Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from child")){
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                boolean nice = rs.getBoolean("nice");
                allElves.add(new Child(id, name, nice));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return allElves;
    }



}
