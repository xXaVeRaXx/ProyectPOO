import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Subdirector extends Cargo implements Percel{
	
	
	private ArrayList<Miembro> subdirectores = new ArrayList<Miembro>();
	private int subdirectoresDisponibles = 1;
	private int numPercel = 0;
	
	
	public ArrayList<Miembro> getSubdirectores() {
		return subdirectores;
	}
	public void setSubdirectores(ArrayList<Miembro> subdirectores) {
		this.subdirectores = subdirectores;
	}
	
	public int getSubdirectoresDisponibles() {
		return subdirectoresDisponibles;
	}
	public void setSubdirectoresDisponibles(int subdirectoresDisponibles) {
		this.subdirectoresDisponibles = subdirectoresDisponibles;
	}
	
	public int getNumPercel() {
		return numPercel;
	}
	
	//DESDE CARGO
	
	@Override
	public String escribirNombreMiembro(int numMiembro) {
		return subdirectores.get(numMiembro).getNombre();
	}
	
	@Override
	public void ocuparCargo(Miembro miembro) {
		//AL USAR ARRAYLISTS NO NECESITAMOS TRY PARA EL ARRAYOUTOFINBOUNDS
		if (subdirectoresDisponibles > 0) {
			subdirectoresDisponibles--;
		}
		else {
			JOptionPane.showMessageDialog(null,"Los subdirectores del departamento " + miembro.getDepartamento() + " estan ocupados, cambie los miembros." , "Error", JOptionPane.WARNING_MESSAGE);
			System .exit(0);	
		}
	}

	@Override
	public Miembro requisitosCargo(Miembro miembro) {
		if((miembro.getAniosExperiencia() > 10) && ((2020 - miembro.getAnioNacimiento() > 30))){
			return miembro;
		}
		else {
			return null;
		}
	}
	
	@Override
	public void escribirRequisitos() {
		JOptionPane.showMessageDialog(null, "Años de experiencia (>10) y la edad (>30).", "Requisitos", JOptionPane.INFORMATION_MESSAGE);		
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
