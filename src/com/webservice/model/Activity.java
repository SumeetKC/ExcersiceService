/**
 * 
 */
package com.webservice.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Sumeet
 *
 */
@XmlRootElement
public class Activity {
	
	private String description;
	private int duration;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Activity(String description, int duration) {
		super();
		this.description = description;
		this.duration = duration;
	}
	public Activity() {
		super();
	}
	
	

}
