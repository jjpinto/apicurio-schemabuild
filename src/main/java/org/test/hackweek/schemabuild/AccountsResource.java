package org.test.hackweek.schemabuild;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.test.hackweek.schemabuild.beans.Account;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/accounts")
public interface AccountsResource {
  @GET
  @Produces("application/json")
  List<Account> listAccounts();

  @POST
  @Consumes("application/json")
  void createNewAccount(Account data);

  @Path("/{id}")
  @GET
  @Produces("application/json")
  Account getAnAccount(@PathParam("id") String id);

  @Path("/{id}")
  @PUT
  @Consumes("application/json")
  void updateAnAccount(@PathParam("id") String id, Account data);

  @Path("/{id}")
  @DELETE
  void deleteAnAccount(@PathParam("id") String id);
}
