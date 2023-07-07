package com.registro.alumno.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="auth_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String first_name;
	private String last_name;
	private String username;
	private Integer is_superuser;
	private String password;
	private String last_login;
	private String email;
	private Integer is_staff;
	private Integer is_active;
	private String date_joined;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getIs_superuser() {
		return is_superuser;
	}
	public void setIs_superuser(Integer is_superuser) {
		this.is_superuser = is_superuser;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIs_staff() {
		return is_staff;
	}
	public void setIs_staff(Integer is_staff) {
		this.is_staff = is_staff;
	}
	public Integer getIs_active() {
		return is_active;
	}
	public void setIs_active(Integer is_active) {
		this.is_active = is_active;
	}
	public String getDate_joined() {
		return date_joined;
	}
	public void setDate_joined(String date_joined) {
		this.date_joined = date_joined;
	}
	@Override
	public String toString() {
		return "auth_user [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", username=" 
	+username + ",is_superuser ="+is_superuser+",password ="+password+", last_login=" + last_login + ", email=" 
				+ email + ", is_staff=" + is_staff + ", is_active=" + is_active + ", date_joined=" + date_joined + "]";
	}
	
}
