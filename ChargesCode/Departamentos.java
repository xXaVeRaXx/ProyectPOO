import javax.swing.JOptionPane;

public class Departamentos {

	private Departamento direccion = new Departamento();
	private Departamento logistica = new Departamento();
	private Departamento control_robots = new Departamento();
	private Departamento medico = new Departamento();
	private Departamento inv_biologica = new Departamento();
	private Departamento construccion_mantenimiento = new Departamento();
	private Departamento sistemas_informaticos = new Departamento();
	private Departamento investigacion_astronomica= new Departamento();
	private Departamento cometologia = new Departamento();
	private Departamento navegacion = new Departamento();
	private int miembrosTotales = 100;
	
	public Departamento getDireccion() {
		return direccion;
	}
	public void setDireccion(Departamento direccion) {
		this.direccion = direccion;
	}
	public Departamento getLogistica() {
		return logistica;
	}
	public void setLogistica(Departamento logistica) {
		this.logistica = logistica;
	}
	public Departamento getControl_robots() {
		return control_robots;
	}
	public void setControl_robots(Departamento control_robots) {
		this.control_robots = control_robots;
	}
	public Departamento getMedico() {
		return medico;
	}
	public void setMedico(Departamento medico) {
		this.medico = medico;
	}
	public Departamento getInv_biologica() {
		return inv_biologica;
	}
	public void setInv_biologica(Departamento inv_biologica) {
		this.inv_biologica = inv_biologica;
	}
	public Departamento getConstruccion_mantenimiento() {
		return construccion_mantenimiento;
	}
	public void setConstruccion_mantenimiento(Departamento construccion_mantenimiento) {
		this.construccion_mantenimiento = construccion_mantenimiento;
	}
	public Departamento getSistemas_informaticos() {
		return sistemas_informaticos;
	}
	public void setSistemas_informaticos(Departamento sistemas_informaticos) {
		this.sistemas_informaticos = sistemas_informaticos;
	}
	public Departamento getInvestigacion_astronomica() {
		return investigacion_astronomica;
	}
	public void setInvestigacion_astronomica(Departamento investigacion_astronomica) {
		this.investigacion_astronomica = investigacion_astronomica;
	}
	public Departamento getCometologia() {
		return cometologia;
	}
	public void setCometologia(Departamento cometologia) {
		this.cometologia = cometologia;
	}
	public Departamento getNavegacion() {
		return navegacion;
	}
	public void setNavegacion(Departamento navegacion) {
		this.navegacion = navegacion;
	}
	
	public int getMiembrosTotales() {
		return miembrosTotales;
	}
	
	public void ocuparDepartamento(Departamento departamento) {
		if (departamento.getMiembrosDepartamento() < 41 ) {
			departamento.setMiembrosDepartamento(departamento.getMiembrosDepartamento() + 1);
		}
		else {
			JOptionPane.showMessageDialog(null, "Hay departamentos que superan los 41 miembros, cambie el documento.", "Error", JOptionPane.WARNING_MESSAGE);
			System.exit(0);	
		}	
	}
	
	public void ocuparMiembrosTotales() {
		miembrosTotales--;
	}
}