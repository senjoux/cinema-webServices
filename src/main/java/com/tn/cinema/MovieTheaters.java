package com.tn.cinema;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.tn.cinema.entities.MovieTheater;
import com.tn.cinema.services.MovieTheaterServiceLocal;

@RequestScoped
@Path("theater")
@Produces("application/json")
@Consumes("application/json")
public class MovieTheaters {
	
	@EJB
	MovieTheaterServiceLocal movieTheaterServiceLocal;
	
	@GET
	public List<MovieTheater> getAllMovieTheaters(){
		return movieTheaterServiceLocal.getAllMovieTheaters();
	}
	
	@GET
	@Path("{id}")
	public MovieTheater findMovieTheaterByID(@PathParam("id") Integer id){
		return movieTheaterServiceLocal.findMovieTheaterByID(id);
	}

	@GET
	@Path("/manager/{managerID}")
	public MovieTheater getMovieTheaterByManagerID(@PathParam("managerID") Integer managerID) {		
		return movieTheaterServiceLocal.getMovieTheatersByManagerID(managerID).get(0);
	}
}
