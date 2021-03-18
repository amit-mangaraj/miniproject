package com.ltts.project.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Screen implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -212103894384517480L;

	@Id
	private int screenId;
	
	private String screenName;
	private String showTime;
	
	
	 
	  private int movieid;

	public Screen(int screenId, String screenName, String showTime, int movieid) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.showTime = showTime;
		this.movieid = movieid;
	}

	public Screen() {
		super();
	}

	
	
	
	
	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenName=" + screenName + ", showTime=" + showTime + ", movieid="
				+ movieid + "]";
	}
	
	
	
	
}
