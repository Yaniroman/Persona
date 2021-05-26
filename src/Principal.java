
public class Principal {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Yani", "Roman",32448956,34,168,80);
		Persona persona2 = new Persona("Guille", "Fink", 32022487,35,190,110);
		System.out.println(persona1.nombre + " " + persona1.edad);
		System.out.println(persona2.nombre);
		System.out.println(persona1.edad);
	}

}
