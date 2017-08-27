package pl.fitness.FitnessWebApp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USERS")
public class Users {
	
	private long userId;
	private String login;
	private String eMail;
	private String password;
	private Date createdDate;
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "USER_ID", unique = true)
	public long getUserId() {
		return userId;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	@NotNull
	@Column(name = "USER_LOGIN")
	public String getLogin() {
		return login;
	}

	@NotNull
	@Column(name = "USER_EMAIL")
	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@NotNull
	@Column(name = "USER_PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotNull
	@Column(name = "CREATED_DATE")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	

}
