package Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@Path("/sum")
public class SumService {

    @GET
    @Path("/{num1}/{num2}")
    @Produces(MediaType.APPLICATION_JSON)
    public Result sum(@PathParam("num1") Integer num1, @PathParam("num2") Integer num2) { //if you return an Integer, it throws an error!!!
        return new Result(num1 + num2);
    }
}
