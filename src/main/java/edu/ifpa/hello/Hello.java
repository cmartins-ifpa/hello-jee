package edu.ifpa.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Um endpoint simples para "Hello World".
 * @author Claudio Martins
 */
@Path("hello")
public class Hello {
    
    @GET
    @Produces("text/plain;charset=utf-8")  
    public Response hello(){
        return Response.ok("Alô, bem-vindo à plataforma Jakarta EE!").build();
    }
        
}
