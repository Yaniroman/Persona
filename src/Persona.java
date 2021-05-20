
public class Persona {

	public String nombre;
	public String apellido;
	public int dni;
	public int edad;
	public int altura;
	public int peso;
	public String estado;

	public Persona(String nombre, String apellido, int dni, int edad, int altura, int peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.estado = "Parado";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void Caminar() {

	}

	public void Sentarse() {

	}

	public void Pararse() {

	}

	public void Cumplir() {

	}

	public void Engordar() {

	}

	public void Adelgazar() {

	}

}
