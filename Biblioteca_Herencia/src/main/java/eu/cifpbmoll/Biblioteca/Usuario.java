package eu.cifpbmoll.Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Persona{
	public static Scanner lectorUsuario=new Scanner(System.in);
	private int telefono;
	private String direccion;
	private int codigoPostal;
	private String email;
	private ArrayList <Reserva> listaReservas;
	
	//Constructor vacío
	public Usuario() {
		}
	//Constructor completo
	/**
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param edad
	 * @param telefono
	 * @param direccion
	 * @param codigoPostal
	 * @param email
	 * @param listaReservas
	 */
	public Usuario(String nombre, String apellido1, String apellido2, int edad, int telefono, String direccion,
			int codigoPostal, String email, ArrayList<Reserva> listaReservas) {
		super(nombre, apellido1, apellido2, edad);
		this.telefono = telefono;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.email = email;
		this.listaReservas = listaReservas;
	}
	//Constructor Copia
	/**
	 * @param usuario
	 */
	
	public Usuario(Usuario usuario) {
		super(usuario.getNombre(), usuario.getApellido1(), usuario.getApellido2(), usuario.getEdad());
		this.telefono = usuario.telefono;
		this.direccion = usuario.direccion;
		this.codigoPostal = usuario.codigoPostal;
		this.email = usuario.email;
		this.listaReservas = usuario.listaReservas;
	}
	//Getters & Setters
	public static Scanner getLectorUsuario() {
		return lectorUsuario;
	}
	public static void setLectorUsuario(Scanner lectorUsuario) {
		Usuario.lectorUsuario = lectorUsuario;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}
	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	//To String
	@Override
	public String toString() {
        return super.toString() + " Usuario{" + "telefono=" + telefono + ", direccion=" + direccion + ", codigo Postal=" 
        		+ codigoPostal + ", Email=" + email + ", listaReservas=" + listaReservas + '}';
    }
	//Metodos
	public void solicitarDatosPersona() {
		super.solicitarDatosPersona();
		System.out.println("Teléfono: ");
		int newTelefono = lectorUsuario.nextInt();
		lectorUsuario.nextLine();
		System.out.println("Dirección: ");
		String newDireccion = lectorUsuario.nextLine();
		System.out.println("Código Postal: ");
		int newCodigo_Postal = lectorUsuario.nextInt();
		lectorUsuario.nextLine();
		System.out.println("Email: ");
		String newEmail = lectorUsuario.nextLine();
		//Insertamos valores
		this.setTelefono(newTelefono);
		this.setDireccion(newDireccion);
		this.setCodigoPostal(newCodigo_Postal);
		this.setEmail(newEmail);
	}
}
