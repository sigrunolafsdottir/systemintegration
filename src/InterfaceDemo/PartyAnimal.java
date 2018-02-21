package InterfaceDemo;

public interface PartyAnimal {
    
    public String getFavoriteSnack();
    
    default String getFavouriteDrink(){
        return "Beer";
    }

}
