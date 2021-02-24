package eu.cifpbmoll.Biblioteca;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/**
*
* @author Roberto
*/
public class Biblioteca {
	public static Scanner lector=new Scanner(System.in);
	private String nombreBiblioteca;
	private ArrayList <Libro> listaLibros;
	private ArrayList <Persona> listaPersonas;

	//Constructores
	
	//Constructor vacio
	public Biblioteca(){
		
	}
	//Constructor completo
	/**
	 * @param nombreBiblioteca
	 * @param listaLibros
	 * @param listaPersonas
	 */
	public Biblioteca(String nombreBiblioteca, ArrayList<Libro> listaLibros, ArrayList<Persona> listaPersonas) {
		this.nombreBiblioteca = nombreBiblioteca;
		this.listaLibros = listaLibros;
		this.listaPersonas = listaPersonas;
	}
	//Constructor copia
	public Biblioteca(Biblioteca biblioteca){
        this.nombreBiblioteca=biblioteca.nombreBiblioteca;
        this.listaLibros=biblioteca.listaLibros;
        this.listaPersonas=biblioteca.listaPersonas;
        }
	//Setters and Getters
	public String getnombreBiblioteca() {
		return nombreBiblioteca;
	}

	public void setnombreBiblioteca(String nombreBiblioteca) {
		while((Character.getType(nombreBiblioteca.charAt(0)))!=1){
			System.out.println("La biblioteca debe empezar por mayúscula.");
			System.out.println("Escribelo bien.");
			nombreBiblioteca= lector.nextLine();
		}
		this.nombreBiblioteca = nombreBiblioteca;
	}
	public ArrayList<Persona> getlistaPersonas() {
		return listaPersonas;
	}
	public void setlistaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	public ArrayList<Libro> getlistaLibros() {
		return listaLibros;
	}
	public void setlistaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	//ToString
	@Override
	public String toString() {
        return "Biblioteca{" + "nombreBiblioteca=" + nombreBiblioteca + ", listaLibros=" + listaLibros +
        		", listaPersonas=" + listaPersonas + '}';
    }
	
	//Metodos
	public  void mostrarLibros(){
		Iterator<Libro> libro = listaLibros.iterator();
		while (libro.hasNext())
			System.out.println(libro.next());
    }
	
	public void mostrarLibrosDisponibles(){
		for (int i=0;i<listaLibros.size();i++){
            if (listaLibros.get(i).getNumeroCopiasDisponibles()>0){
                System.out.println(listaLibros.get(i).toString());
            }
        }
	}
}
