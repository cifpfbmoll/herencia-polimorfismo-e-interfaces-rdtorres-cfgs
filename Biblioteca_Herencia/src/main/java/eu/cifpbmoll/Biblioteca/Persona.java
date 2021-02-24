package eu.cifpbmoll.Biblioteca;

import java.util.Scanner;

public class Persona {
		public static Scanner lectorPersona=new Scanner(System.in);
		//Atributos
	    private String nombre;
	    private String apellido1;
	    private String apellido2;
	    private int edad;
	    
	    //Constructor vacío
	    public Persona() {
		}
	    
	    //Constructor con parámetros
	    public Persona(String nombre, String apellido1, String apellido2, int edad) {
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.edad = edad;
		}
	    
		//Constructor copia Persona
		public Persona(Persona persona) {
			this.nombre = persona.nombre;
	        this.apellido1 = persona.apellido1;
	        this.apellido2 = persona.apellido2;
	        this.edad = persona.edad;
		}

		//Getters And Setters

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

	    //To String
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad="
					+ edad + "]";
		}
		
		//Métodos
		public void solicitarDatosPersona() {
			System.out.println("Nombre: ");
			String newNombre = lectorPersona.nextLine();
			System.out.println("Primer apellido: ");
			String newApellido1 = lectorPersona.nextLine();
			System.out.println("Segundo apellido: ");
			String newApellido2 = lectorPersona.nextLine();
			System.out.println("Edad: ");
			int newEdad = lectorPersona.nextInt();
			lectorPersona.nextLine();
			//Insertamos valores
			this.setNombre(newNombre);
			this.setApellido1(newApellido1);
			this.setApellido2(newApellido2);
			this.setEdad(newEdad);
		}
}
