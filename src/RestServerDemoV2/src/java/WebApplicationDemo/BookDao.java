package WebApplicationDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BookDao {
    
    public List<Book> getAllBooks(){ 
      
      List<Book> bookList = new ArrayList<>(); 
      Book b1 = new Book(1,"Wuthering Heights", "Emily Bronte");
      Book b2 = new Book(2, "Jayne Eyre", "Charlotte Bronte");
      Book b3 = new Book(3, "Crime and Punishment", "Fjodor Dostovjevsky");
      Book b4 = new Book(4, "Madame Bovary", "Gustave Flaubert");
      Book b5 = new Book(5, "Catcher in the Rye", "J.D. Salinger");
      Book b6 = new Book(6, "Pale King", "David Foster Wallace");
      Book b7 = new Book(7, "Sandman, vol 1", "Neil Gaiman");
      
      bookList.add(b1);
      bookList.add(b2);
      bookList.add(b3);
      bookList.add(b4);
      bookList.add(b5);
      bookList.add(b6);
      bookList.add(b7);
      
      return bookList; 
   } 
    
   public Map<Integer, Book> getMap(){ 
      
      Map<Integer, Book> bookMap = new HashMap<>(); 
      Book b1 = new Book(1,"Wuthering Heights", "Emily Bronte");
      Book b2 = new Book(2, "Jayne Eyre", "Charlotte Bronte");
      Book b3 = new Book(3, "Crime and Punishment", "Fjodor Dostovjevsky");
      Book b4 = new Book(4, "Madame Bovary", "Gustave Flaubert");
      Book b5 = new Book(5, "Catcher in the Rye", "J.D. Salinger");
      Book b6 = new Book(6, "Pale King", "David Foster Wallace");
      Book b7 = new Book(7, "Sandman, vol 1", "Neil Gaiman");
      
      bookMap.put(1, b1);
      bookMap.put(2, b2);
      bookMap.put(3, b3);
      bookMap.put(4, b4);
      bookMap.put(5, b5);
      bookMap.put(6, b6);
      bookMap.put(7, b7);
      
      return bookMap; 
   } 
       
}
