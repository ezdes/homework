package Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserService {
    @GET
    @Path("/{name}/{password}")
    @Produces(MediaType.APPLICATION_JSON)
    public String check(@PathParam("name") String name, @PathParam("password") String password) {
         if (name.equals("Ermek") && password.equals("12345"))
             return "Success";

         else
             return "Error";
    }
}
