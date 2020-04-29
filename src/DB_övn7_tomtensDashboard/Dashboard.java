package DB_övn7_tomtensDashboard;

import java.util.List;
import static java.util.stream.Collectors.toList;


public class Dashboard {
    
    public Dashboard() throws InterruptedException{
        Repository r = new Repository();
        List<Child> allChildren = r.getAllChildren();
        String naughtyOrNice;
        
        for (Child c : allChildren){
            if (c.getNice()){
                naughtyOrNice = "Nice";
            }
            else{
                naughtyOrNice = "Naughty";
            }
            System.out.println(c.getName() + " " + naughtyOrNice);
        }

    }
    
    public static void main(String args[]) throws InterruptedException {
        Dashboard d = new Dashboard();
    }

}
