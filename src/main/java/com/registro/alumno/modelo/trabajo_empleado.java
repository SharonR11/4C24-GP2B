package com.registro.alumno.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="trabajo_empleado")
public class trabajo_empleado {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String correo;
	private Integer contraseña;
	private String dni;
	private String direccion;
	private Long empresa;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Integer getContraseña() {
		return contraseña;
	}
	public void setContraseña(Integer contraseña) {
		this.contraseña = contraseña;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Long empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return "trabajo_empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" 
	+correo + ",contraseña ="+contraseña+",dni ="+dni+", direccion=" + direccion +", empresa=" + empresa + "]";
	}
}
