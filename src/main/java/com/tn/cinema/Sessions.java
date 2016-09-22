package com.tn.cinema;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tn.cinema.entities.Session;
import com.tn.cinema.services.SessionServiceLocal;

@RequestScoped
@Path("session")
@Produces(MediaType.APPLICATION_JSON)
@Consumes("application/json")
public class Sessions {

	@EJB
	SessionServiceLocal sessionServiceLocal;

	@GET
	public List<Session> findAllSessions() {

		// public Response findAllSessions() {
		/*
		 * final List<Session> list = sessionServiceLocal.findAllSessions(); //
		 * get // some
		 * 
		 * final GenericEntity<List<Session>> entity = new
		 * GenericEntity<List<Session>>(list) { };
		 */
		return sessionServiceLocal.findAllSessions();
		// return Response.ok(entity).build();

	}

	@GET
	@Path("/movie/{movieID}")
	public List<Session> findAllSessionsByMovieID(@PathParam("movieID") Integer movieID) {
		return sessionServiceLocal.findAllSessionsByMovieID(movieID);
	}

	@GET
	@Path("/theater/{theaterID}")
	public List<Session> findAllSessionsByMovieTheaterID(@PathParam("theaterID") Integer theaterID) {
		return sessionServiceLocal.findAllSessionsByMovieTheaterID(theaterID);
	}
}
