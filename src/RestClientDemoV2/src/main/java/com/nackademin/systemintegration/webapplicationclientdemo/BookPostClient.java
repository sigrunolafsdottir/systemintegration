package com.nackademin.systemintegration.webapplicationclientdemo;

import java.io.IOException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class BookPostClient { 
    
    private static ClientConfig config = new DefaultClientConfig();
    private static Client client = Client.create(config);
    private static WebResource service = client.resource(
            UriBuilder.fromUri("http://localhost:8080/WebApplicationDemo").build());
    
    public static void main(String[] args) throws IOException {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);

        Book book = new Book(8, "Designing data intensive applications", "Marin Kleppman");
        
        ClientResponse response = service.path("rest/BookService/book/add")
                .accept(MediaType.APPLICATION_XML).post(ClientResponse.class, book);
        
        System.out.println("Response " + response.getEntity(String.class));
    }
}
