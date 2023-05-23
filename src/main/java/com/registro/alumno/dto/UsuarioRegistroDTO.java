package com.registro.alumno.dto;

public class UsuarioRegistroDTO {

	private int id;
	private String nombre;
	private String apellido;
	private String correo;
	private String contraseña;
	private int dni;
	private String direccion;
	private String fecha_nacimiento;

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

	public UsuarioRegistroDTO(int id, String nombre, String apellido, String correo, String contraseña, int dni,
			String direccion, String fecha_nacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contraseña = contraseña;
		this.dni = dni;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public UsuarioRegistroDTO(String nombre, String apellido, String correo, String contraseña, int dni,
			String direccion, String fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contraseña = contraseña;
		this.dni = dni;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public UsuarioRegistroDTO(String correo) {
		super();
		this.correo = correo;
	}

	public UsuarioRegistroDTO() {
		super();
	}

}
