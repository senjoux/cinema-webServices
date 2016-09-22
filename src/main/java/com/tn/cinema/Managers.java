package com.tn.cinema;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.tn.cinema.entities.Manager;
import com.tn.cinema.services.ManagerServiceLocal;

@RequestScoped
@Path("manager")
@Produces("application/json")
@Consumes("application/json")
public class Managers {
		
	@EJB 
	ManagerServiceLocal managerServiceLocal;
	
	@GET
	public List<Manager> getAllManagers(){
		return managerServiceLocal.findAllManagers();
	}
	
	@GET
	@Path("{id}")
	public Manager findManagerByID(@PathParam("id") Integer id){
		return managerServiceLocal.findManagerByID(id);
	}
	
	
}
