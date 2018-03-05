package com.nackademin.systemintegration.webapplicationclientdemo;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.io.IOException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;


public class JSONBookClient {

    private static ClientConfig config = new DefaultClientConfig();
    private static Client client = Client.create(config);
    private static WebResource service = client.resource(
            UriBuilder.fromUri("http://localhost:8080/WebApplicationDemo").build());
    
    public static void main(String[] args) throws IOException {
        
        Gson gson = new Gson();
        
        //Getting one book
        String jsonBook = service.path("rest/BookService/bookJSON/1")
                .accept(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println(jsonBook);
        System.out.println();
        
        Book book = gson.fromJson(jsonBook, Book.class);
        System.out.println("Book info, id: "+book.getId()+" title: "
                +book.getTitle() +" author: "+book.getAuthor()+ "\n");
        
        //Getting all books
        String jsonString = service.path("rest/BookService/booksJSON")
        .accept(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println(jsonString);
        System.out.println();
        
        Book[] books = gson.fromJson(jsonString, Book[].class);
        for (Book b : books){
            System.out.println("Book info, id: "+b.getId()+" title: "+b.getTitle() +" author: "+b.getAuthor());
        }
        
        //COnvert POJO to JSON
        Book myBook = new Book(13, "4 Hour WorkWeek", "Tim Ferriss");
        String convertedBook = gson.toJson(myBook);
        System.out.println(convertedBook);
        
    }
}
