package edu.neu.cs5200.rest.hello;

import java.util.List;

import javax.persistence.*;


public class MovieDAO {
	EntityManagerFactory factory= Persistence.createEntityManagerFactory("cs5200");
	EntityManager em=factory.createEntityManager();
	
	public Movie findMovieById(int id)
	{
		return em.find(Movie.class, id);
	}
	
	public List<Movie>findAllMovies()
	{
		Query selectAll=em.createQuery("select m from MOVIE m");
		return selectAll.getResultList();
	}
	
	public void createMovie(Movie movie)
	{
		em.getTransaction().begin();
		em.persist(movie);
		em.getTransaction().commit();
	}

}
