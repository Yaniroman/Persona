
public class Principal {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Yani", "Roman",32448956,34,168,80);
		Persona persona2 = new Persona("Guille", "Fink", 32022487,35,190,110);
		System.out.println(persona1.nombre + " " + persona1.getEdad());
		persona1.nombre = "Filomena";
		persona1.setEdad(10);
		//persona1.estado = "soltera";
		System.out.println(persona1.nombre + " " + persona1.getEdad() +" " + persona1.estado);
		System.out.println(persona2.nombre + " " + persona2.getEdad() +" " + persona2.estado);
		persona1.Sentarse();
		System.out.println(persona1.nombre + " " + persona1.getEdad() +" " + persona1.estado);
		System.out.println(persona2.nombre + " " + persona2.getEdad() +" " + persona2.estado);
		System.out.println(persona2.nombre + " " + persona2.peso);
		persona2.Engordar(2);
		System.out.println(persona2.nombre + " " + persona2.peso);
		persona2.Adelgazar(3);
		System.out.println(persona2.nombre + " " + persona2.peso);
		persona2.Adelgazar(9);
	
		if (persona2.peso>100) {
			System.out.println("Hacer actividad fisica");
		}else {
			System.out.println("Se feliz!!!");
		}
		
		if (persona2.altura < 180 && persona2.peso > 85) {
			System.out.println("Supera el indice de masa");
		}else {
			System.out.println("Saludable");
		}
		
		
		//System.out.println(persona2.nombre);
		//System.out.println(persona1.getEdad());
		
		
		
	}

}
