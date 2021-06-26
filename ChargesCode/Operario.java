import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operario extends Cargo implements Percel{

	
	private ArrayList<Miembro> operarios = new ArrayList<Miembro>();
	private int operariosDisponibles = 27;
	private int numPercel = 0;
	
	
	public ArrayList<Miembro> getOperarios() {
		return operarios;
	}
	public void setOperarios(ArrayList<Miembro> operarios) {
		this.operarios = operarios;
	}
	public int getOperariosDisponibles() {
		return operariosDisponibles;
	}
	public void setOperariosDisponibles(int operariosDisponibles) {
		this.operariosDisponibles = operariosDisponibles;
	}
	public int numPercel() {
		return numPercel;
	}
	
	//DESDE CARGO
	
	@Override
	public String escribirNombreMiembro(int numMiembro) {
		return operarios.get(numMiembro).getNombre();
	}
	
	@Override
	public void ocuparCargo(Miembro miembro) {
		//AL USAR ARRAYLISTS NO NECESITAMOS TRY PARA EL ARRAYOUTOFINBOUNDS
		if (operariosDisponibles > 0) {
			operariosDisponibles--;
		}
		else {
			JOptionPane.showMessageDialog(null,"Los operarios del departamento " + miembro.getDepartamento() + " estan ocupados, cambie los miembros." , "Error", JOptionPane.WARNING_MESSAGE);
			System .exit(0);
		}
	}
	
	@Override
	public Miembro requisitosCargo(Miembro miembro) {
		if((2020 - miembro.getAnioNacimiento()) > 20){
			return miembro;
		}
		else {
			return null;
		}
	}
	
	@Override
	public void escribirRequisitos() {
		JOptionPane.showMessageDialog(null, "Edad (>20). ", "Requisitos", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	//DESDE PERCEL
	
	@Override
	public void comprobarPerceles(int numPercelesPosibles) {
		if (numPercel > numPercelesPosibles) {
			JOptionPane.showMessageDialog(null,"Los miembros perceles que hay en este departamento y este cargo han superado los disponibles." , "Error", JOptionPane.WARNING_MESSAGE);
			System .exit(0);
		}
	}
	
	@Override
	public void ocuparPercel() {
		numPercel ++;
		
	}
	
}