
public class Principal {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Yani", 34);
		Persona persona2 = new Persona("Guille", 35);
		System.out.println(persona1.nombre + " " + persona1.edad);
		System.out.println(persona2.nombre);
		System.out.println(persona1.edad);
	}

}
