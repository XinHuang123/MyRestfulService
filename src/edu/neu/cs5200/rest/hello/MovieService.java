package edu.neu.cs5200.rest.hello;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


// create a movie
@Path("/movie")
public class MovieService {
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createMovie(Movie movie)
	{
		MovieDAO dao=new MovieDAO();
		dao.createMovie(movie);
	}
	
	
	// find movie by id 	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Movie findMovieById(@PathParam("id") int id)
	{
		MovieDAO dao=new MovieDAO();
		return dao.findMovieById(id);
	}
	
	//find all movie
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> findAllMovies()
	{
		
		MovieDAO dao=new MovieDAO();
		return dao.findAllMovies();
	}

}
