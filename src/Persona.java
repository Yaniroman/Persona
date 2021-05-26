
public class Persona {

	public String nombre;
	public String apellido;
	public int dni;
	private int edad;
	public int altura;
	public float peso;
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

	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void Caminar() {

	}

	public void Sentarse() {
		this.estado = "Sentado";
	}

	public void Pararse() {
		this.estado = "Parado";

	}

	public void Cumplir() {

	}

	public void Engordar(int kilos) {
		this.peso = this.peso + kilos;
	}

	public void Adelgazar(int kilos) {
		this.peso = this.peso - kilos;
	}

}
