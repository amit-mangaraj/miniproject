package com.ltts.project.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.project.model.Movie;

@Repository
public class MovieDao {
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private SessionFactory sf;
	
	
	public List<Movie> getAllMovies(){
		 Session session=sf.openSession();
	        session.beginTransaction();
	        
	        List<Movie> li=sf.openSession().createCriteria(Movie.class).list();
	        //List<ProductsModel> product=sessionFactory.openSession().createCriteria(ProductsModel.class).list();
	        
	        session.getTransaction().commit();
	        return li;
	}

}
