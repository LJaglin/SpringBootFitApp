package pl.fitness.FitnessWebApp.models;

import java.util.Date;

public class FitnessWebAppLog {
	
	private long id;
	private String name;
	private long userId;
	private Date createdDate;
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "FitnessWebAppLog [id=" + id + ", name=" + name + ", userId=" + userId + ", createdDate=" + createdDate
				+ "]";
	}
	
	

}
