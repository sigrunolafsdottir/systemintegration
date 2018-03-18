package V3_övn10_printChildren;

import java.util.List;
import V3_övn10_printChildren.Models.Child;


public class PrintAllChildren {
    
    public static void main (String args[]){
        Repository r = new Repository();
        r.getAllChildren().forEach(c -> c.print());
    }

}
