
public class Miembro {

	//ATRIBUTOS
	private String nombre;
	private String apellidos;
	private String cargo; 
	private int aniosExperiencia;
	private int anioNacimiento;
	private int cociente;
	private String departamento;
	private String percel;
	
	public Miembro() {
		nombre=null;
		apellidos=null;
		cargo=null;
		aniosExperiencia=0;
		anioNacimiento=0;
		cociente=0;
		departamento=null;
		percel = null;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
	public int getCociente() {
		return cociente;
	}
	
	public void setCociente(int cociente) {
		this.cociente = cociente;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getPercel() {
		return percel;
	}
	
	public void setPercel(String percel) {
		this.percel = percel;
	}
	
}
