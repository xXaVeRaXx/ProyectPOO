
public class Departamento {


	private Director director = new Director();
	private Subdirector subdirector = new Subdirector();
	private Responsable responsable = new Responsable();
	private Coordinador coordinador = new Coordinador();
	private Operario operario = new Operario();
	private int miembrosDepartamento = 0;
	
	
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Subdirector getSubdirector() {
		return subdirector;
	}

	public void setSubdirector(Subdirector subdirector) {
		this.subdirector = subdirector;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public Coordinador getCoordinador() {
		return coordinador;
	}

	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}

	public Operario getOperario() {
		return operario;
	}

	public void setOperario(Operario operario) {
		this.operario = operario;
	}

	public int getMiembrosDepartamento() {
		return miembrosDepartamento;
	}
	
	public void setMiembrosDepartamento(int miembrosDepartamento) {
		this.miembrosDepartamento = miembrosDepartamento;
	}
	
}