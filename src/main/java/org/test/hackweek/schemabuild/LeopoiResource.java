package org.test.hackweek.schemabuild;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.test.hackweek.schemabuild.beans.LeoPoI;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/leopoi")
public interface LeopoiResource {
  @GET
  @Produces("application/json")
  List<LeoPoI> listLEOPoIs();

  @POST
  @Consumes("application/json")
  void createNewLeoPoI(LeoPoI data);
}
