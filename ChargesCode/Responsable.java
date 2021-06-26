import java.util.*;
import javax.swing.*;

public class Responsable extends Cargo implements Percel{

	private ArrayList<Miembro> responsables = new ArrayList<Miembro>();
	private int responsablesDisponibles = 3;
	private int numPercel = 0;
	
	
	public ArrayList<Miembro> getResponsables() {
		return responsables;
	}
	public void setResponsables(ArrayList<Miembro> responsables) {
		this.responsables = responsables;
	}
	public int getResponsablesDisponibles() {
		return responsablesDisponibles;
	}
	public void setResponsablesDisponibles(int responsablesDisponibles) {
		this.responsablesDisponibles = responsablesDisponibles;
	}
	
	public int getNumPercel() {
		return numPercel;
	}
	
	//DESDE CARGO
	
	@Override
	public String escribirNombreMiembro(int numMiembro) {
		return responsables.get(numMiembro).getNombre();
	}
	
	@Override
	public void ocuparCargo(Miembro miembro) {
		//AL USAR ARRAYLISTS NO NECESITAMOS TRY PARA EL ARRAYOUTOFINBOUNDS
		if (responsablesDisponibles > 0) {
			responsablesDisponibles--;
		}
		else {
			JOptionPane.showMessageDialog(null,"Los responsables del departamento " + miembro.getDepartamento() + " estan ocupados, cambie los miembros." , "Error", JOptionPane.WARNING_MESSAGE);
			System .exit(0);	
		}
	}
	
	@Override
	public Miembro requisitosCargo(Miembro miembro) {
		if((miembro.getCociente() > 70) && ((2020 - miembro.getAnioNacimiento() > 25))){
			return miembro;
		}
		else {
			return null;
		}
	}
	
	@Override
	public void escribirRequisitos() {
		JOptionPane.showMessageDialog(null, "Edad (>25) y el cociente de habilidad espacial (>70).", "Requisitos", JOptionPane.INFORMATION_MESSAGE);
		
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