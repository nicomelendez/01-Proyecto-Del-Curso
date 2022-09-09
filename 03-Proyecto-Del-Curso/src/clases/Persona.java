package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private String apellido;
	private String dptoResidencia;
	private byte cantHijos;
	private LocalDate fechaNacimiento;
	
	private ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
	
	public Persona() {
		
	}

	public Persona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos,
			LocalDate fechaNacimiento) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public ArrayList<Persona> buscarPersona(int ID){
		
		try {
			
			Persona  oPersona = new Persona();
			ArrayList<Persona> listaDePersonasEncontradas = new ArrayList<Persona>();
			
			oPersona = listaDePersonas.get(ID);
			
			
			listaDePersonasEncontradas.add(oPersona);
			
			return listaDePersonasEncontradas;
		}catch(Exception error) {
			return null;
		}
		
	}
	
	public void agregarPersonal(String nombre, String apellido, String departamento, byte hijos,LocalDate fechaNacimiento) {
		
		idPersona = listaDePersonas.size();
		Persona oPersona = new Persona(idPersona,nombre,apellido,departamento,hijos,fechaNacimiento);
		
		listaDePersonas.add(oPersona);
	}
	
	public ArrayList<Persona> getListaDePersonas() {
		
		return listaDePersonas;
		
	}

	public void setListaDePersonas(ArrayList<Persona> listaDePersonas) {
		this.listaDePersonas = listaDePersonas;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
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

	public String getDptoResidencia() {
		return dptoResidencia;
	}

	public void setDptoResidencia(String dptoResidencia) {
		this.dptoResidencia = dptoResidencia;
	}

	public byte getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(byte cantHijos) {
		this.cantHijos = cantHijos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public String toString() {
		return "[ID=" + idPersona + ", Nombre:" + nombre + ", apellido=" + apellido + ", dptoResidencia="
				+ dptoResidencia + ", cantHijos=" + cantHijos + ", fechaNacimiento=" + fechaNacimiento;
	}
	
}
