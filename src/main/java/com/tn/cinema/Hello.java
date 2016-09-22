package com.tn.cinema;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("hello")
@Produces("application/json")
@Consumes("application/json")
public class Hello {

	@GET
	public String cc(){
		return "Salut a tous ";
	}
}
