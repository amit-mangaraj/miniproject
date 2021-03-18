package com.ltts.project.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Movie implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7105783923904121474L;
	
	
	
	@Id
	private int movieId;
	private String movieName;
	private String cast;
	private String releaseDate;
	
	public Movie() {
		super();
	}

	public Movie(int movieId, String movieName, String cast, String releaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.cast = cast;
		this.releaseDate = releaseDate;
	}

	
	
	
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", cast=" + cast + ", releaseDate="
				+ releaseDate + "]";
	}
	
	

}
