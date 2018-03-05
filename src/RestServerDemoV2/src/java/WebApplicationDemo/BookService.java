package WebApplicationDemo;

import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.POST;
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  

@Path("/BookService") 

public class BookService {  
   private static BookDao bookDao = new BookDao();
   private static List<Book> bookList =  bookDao.getAllBooks(); 
   

   @GET 
   @Path("/books") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<Book> getBooks(){ 
      return bookList; 
   }  
   
   @GET 
   @Path("/booksJSON") 
   @Produces(MediaType.APPLICATION_JSON) 
   public List<Book> getBooksJSON(){ 
      return bookList; 
   }  
   
   @GET 
   @Path("/booksHTML") 
   @Produces(MediaType.TEXT_HTML) 
   public String getBooksHTML(){ 
      String res = "<HTML><HEAD><TITLE>Books</TITLE></HEAD><BODY><TABLE>";
      for (Book b : bookList){
          res += "<TR><TD>"+b.getId()+"</TD><TD>"+b.getAuthor()+"</TD><TD>"+b.getTitle()+"</TD></TR>";
      }
      res += "</TABLE></HTML>";
      return res;
   } 
   
   
   @GET 
   @Path("/book/{id}") 
   @Produces(MediaType.APPLICATION_XML) 
   public Book getBookById(@PathParam("id") int id){ 
       Book res = new Book();
       for (Book b : bookList){
           if (b.getId() == id){
               res = b;
           }
       }
      return res;
   } 
   
   @GET 
   @Path("/bookJSON/{id}") 
   @Produces(MediaType.APPLICATION_JSON) 
   public Book getBookByIdJson(@PathParam("id") int id){ 
       Book res = new Book();
       for (Book b : bookList){
           if (b.getId() == id){
               res = b;
           }
       }
      return res;
   } 
   
   @GET 
   @Path("/book/{id}/delete") 
   @Produces(MediaType.APPLICATION_XML) 
   public Response deleteBookById(@PathParam("id") int id){ 
       Response res = new Response("Book deleted", Boolean.FALSE);
       
       int indexToRemove = -1;
       for (int i = 0; i < bookList.size(); i++){
           if (bookList.get(i).getId() == id){
               indexToRemove = i;
           }
       }

       if (indexToRemove != -1){
            bookList.remove(indexToRemove);
            res.setStatus(Boolean.TRUE);
       }
       
      return res;
   } 
   
   @POST
   @Path("/book/add") 
   public Response addBook(Book b){ 
       Response res = new Response("Book added", Boolean.FALSE);
       bookList.add(b);
       res.setStatus(Boolean.TRUE);
       return res;
   } 
   
   @POST
   @Path("/book/update") 
   public Response upsertBook(Book b){ 
       Response res = new Response("Book updated", Boolean.FALSE);
       
       int indexToUpdate = -1;
       for (int i = 0; i < bookList.size(); i++){
           if (bookList.get(i).getId() == b.getId()){
               indexToUpdate = i;
           }
       }
       
       if (indexToUpdate == -1){
            bookList.add(b);
            res.setMessage("Book inserted");
            res.setStatus(Boolean.TRUE);
       }
       else{
           bookList.set(indexToUpdate, b);
           res.setStatus(Boolean.TRUE);
       }
       
       return res;
   } 

}