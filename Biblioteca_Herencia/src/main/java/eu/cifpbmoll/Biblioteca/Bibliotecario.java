package eu.cifpbmoll.Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotecario extends Persona{
	public static Scanner lectorBibliotecario=new Scanner(System.in);
	private String puestoTrabajo;
	private String NIF;
	private String contraseña;
	
	//Constructor Vacio
	public Bibliotecario (){
		
	}
	//Constructor Completo
	//Constructor Completo
	/**
     *
     * @param puestoTrabajo
     * @param NIF
     * @param contrasenia
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param edad
     */
    public Bibliotecario(String puestoTrabajo, String NIF, String contraseña, String nombre, String apellido1, String 
    		apellido2, int edad) {
        super(nombre, apellido1, apellido2, edad);
        this.puestoTrabajo = puestoTrabajo;
        this.NIF = NIF;
        this.contraseña = contraseña;
    }
	//Constructor Copia
    public Bibliotecario(Bibliotecario bibliotecario) {
        super(bibliotecario.getNombre(), bibliotecario.getApellido1(), bibliotecario.getApellido2(), bibliotecario.getEdad());
        this.puestoTrabajo = bibliotecario.puestoTrabajo;
        this.NIF = bibliotecario.NIF;
        this.contraseña = bibliotecario.contraseña;
    }
	//Getters & Setters
	public static Scanner getLectorBibliotecario() {
		return lectorBibliotecario;
	}
	public static void setLectorBibliotecario(Scanner lectorBibliotecario) {
		Bibliotecario.lectorBibliotecario = lectorBibliotecario;
	}
	public String getPuestoTrabajo() {
		return puestoTrabajo;
	}
	public void setPuestoTrabajo(String puestoTrabajo) {
		this.puestoTrabajo = puestoTrabajo;
	}
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	//ToString
	@Override
	public String toString() {
		return "Bibliotecario [puestoTrabajo=" + puestoTrabajo + ", NIF=" + NIF + ", contraseña=" + contraseña + "]";
	}
	
	//Metodos
	public void solicitarDatosPersona() {
		super.solicitarDatosPersona();
		System.out.println("Puesto de Trabajo: ");
		String newPuestoTrabajo = lectorBibliotecario.nextLine();
		System.out.println("NIF: ");
		String newNIF = lectorBibliotecario.nextLine();
		System.out.println("Contraseña: ");
		String newContraseña = lectorBibliotecario.nextLine();
		lectorBibliotecario.nextLine();
		//Insertamos valores
		this.setPuestoTrabajo(newPuestoTrabajo);
		this.setNIF(newNIF);
		this.setContraseña(newContraseña);
	}
}
