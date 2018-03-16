package V3_övn7_tomtensDashboard;


public class Child {

    private int id;
    private boolean nice;
    private String name;
    
    public Child(int id, String name, boolean nice){
        this.id = id;
        this.name = name;
        this.nice = nice;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public boolean getNice(){
        return nice;
    }
    
    public void setNice(boolean nice){
        this.nice = nice;
    }
    
//    public void printAllNames(){
//        System.out.println(name + " ");
//    }
}
