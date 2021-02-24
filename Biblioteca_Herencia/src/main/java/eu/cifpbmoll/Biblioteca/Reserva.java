package eu.cifpbmoll.Biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Reserva {
    private static int idReserva; // estatica , comun para todos
    private int id;// individual
    private Libro libro;
    private String fechaReserva;
    private String horaReserva;
    private String fechaDevolucion;
    //Constructor vacío
    public Reserva() {
        idReserva++;
        id= idReserva;
	}
    //Constructor
	public Reserva(Libro libro, String fechaReserva, String horaReserva, String fechaDevolucion) {
		idReserva++;
        id= idReserva;
		this.fechaReserva = fechaReserva;
		this.horaReserva = horaReserva;
		this.fechaDevolucion = fechaDevolucion;
	}
    //Constructor copia
	public Reserva(Reserva reservas) {
        idReserva++;
        id = idReserva;
        this.libro = reservas.libro;
        this.fechaReserva = reservas.fechaReserva;
        this.horaReserva = reservas.horaReserva;
        this.fechaDevolucion = reservas.fechaDevolucion;
    }
	//Getters & Setters
	public static int getIdReserva() {
		return idReserva;
	}
	public static void setIdReserva(int idReserva) {
		Reserva.idReserva = idReserva;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public String getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public String getHoraReserva() {
		return horaReserva;
	}
	public void setHoraReserva(String horaReserva) {
		this.horaReserva = horaReserva;
	}
	public String getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	//String
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", libro=" + libro + ", fechaReserva=" + fechaReserva + ", horaReserva="
				+ horaReserva + ", fechaDevolucion=" + fechaDevolucion + "]";
	}
	
}