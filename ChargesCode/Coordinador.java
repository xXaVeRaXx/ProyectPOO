import java.util.*;
import javax.swing.*;

public class Coordinador extends Cargo implements Percel{
	
	private ArrayList<Miembro> coordinadores = new ArrayList<Miembro>();
	private int coordinadoresDisponibles = 9;
	private int numPercel = 0;
	
	
	public ArrayList<Miembro> getCoordinadores() {
		return coordinadores;
	}
	public void setCoordinadores(ArrayList<Miembro> coordinadores) {
		this.coordinadores = coordinadores;
	}
	public int getCoordinadoresDisponibles() {
		return coordinadoresDisponibles;
	}
	public void setCoordinadoresDisponibles(int coordinadoresDisponibles) {
		this.coordinadoresDisponibles = coordinadoresDisponibles;
	}
	public int getNumPercel() {
		return numPercel;
	}
	
	//DESDE CARGO
	
	@Override
	public String escribirNombreMiembro(int numMiembro) {
		return coordinadores.get(numMiembro).getNombre();
	}
	
	@Override
	public void ocuparCargo(Miembro miembro) {
		//AL USAR ARRAYLISTS NO NECESITAMOS TRY PARA EL ARRAYOUTOFINBOUNDS
		if (coordinadoresDisponibles > 0) {
			coordinadoresDisponibles--;
		}
		else {
			JOptionPane.showMessageDialog(null,"Los coordinadores del departamento " + miembro.getDepartamento() + " estan ocupados, cambie los miembros." , "Error", JOptionPane.WARNING_MESSAGE);
			System .exit(0);	
		}
	}
	
	@Override
	public Miembro requisitosCargo(Miembro miembro) {
		if(miembro.getCociente() > 80){
			return miembro;
		}
		else {
			return null;
		}
	}
	
	@Override
	public void escribirRequisitos() {
		JOptionPane.showMessageDialog(null, "Cociente de habilidad espacial (>80).", "Requisitos", JOptionPane.INFORMATION_MESSAGE);
		
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