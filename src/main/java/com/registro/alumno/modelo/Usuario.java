package com.registro.alumno.modelo;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.JoinColumn;
@Entity
@Table(name = "auth_user", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	private String correo;
	private String contraseña;
	private int dni;
	private String direccion;
	private String fecha_nacimiento;
	

	@ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
			name= "usuario_rol",
			joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id")
			)
	private Collection<Rol> roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

	public Usuario(int id, String nombre, String apellido, String correo, String contraseña, int dni,
			String direccion, String fecha_nacimiento, Collection<Rol> roles) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contraseña = contraseña;
		this.dni = dni;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.roles = roles;
	}

	public Usuario(String nombre, String apellido, String correo, String contraseña, int dni, String direccion,
			String fecha_nacimiento, Collection<Rol> roles) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contraseña = contraseña;
		this.dni = dni;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.roles = roles;
	}

	public Usuario() {
		super();
	}
	
	

}