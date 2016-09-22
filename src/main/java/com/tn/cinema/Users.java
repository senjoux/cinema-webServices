package com.tn.cinema;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.tn.cinema.entities.User;
import com.tn.cinema.services.UsersFacadeLocal;

@RequestScoped
@Path("users")
@Produces("application/json")
@Consumes("application/json")
public class Users {
	
	@EJB
	UsersFacadeLocal usersFacadeLocal;
	
	@POST
	public User authenticate(@QueryParam("email") String email,@QueryParam("password")  String password) {
		return usersFacadeLocal.authenticate(email, password);
	}

}
