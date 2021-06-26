import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Director extends Cargo{
	
	
	private ArrayList<Miembro> directores = new ArrayList<Miembro>();
	private int directoresDisponibles = 1;
	
	
	public ArrayList<Miembro> getDirectores() {
		return directores;
	}
	public void setDirectores(ArrayList<Miembro> directores) {
		this.directores = directores;
	}
	public int getDirectoresDisponibles() {
		return directoresDisponibles;
	}
	public void setDirectoresDisponibles(int directoresDisponibles) {
		this.directoresDisponibles = directoresDisponibles;
	}
	
	//DESDE CARGO
	
	@Override
	public String escribirNombreMiembro(int numMiembro) {
		return directores.get(numMiembro).getNombre();	 
	}
	
	@Override
	public void ocuparCargo(Miembro miembro) {
		//AL USAR ARRAYLISTS NO NECESITAMOS TRY PARA EL ARRAYOUTOFINBOUNDS
		if (directoresDisponibles > 0) {
			directoresDisponibles--;
		}
		else {
			JOptionPane.showMessageDialog(null,"Los directores del departamento " + miembro.getDepartamento() + " estan ocupados, cambie los miembros." , "Error", JOptionPane.WARNING_MESSAGE);
			System .exit(0);
		}
	}
	
	@Override
	public Miembro requisitosCargo(Miembro miembro) {
		if((miembro.getAniosExperiencia() > 20) && (miembro.getPercel().equalsIgnoreCase("no"))){
			return miembro;
		}
		else {
			return null;
		}
	}
	
	@Override
	public void escribirRequisitos() {
		JOptionPane.showMessageDialog(null, "Años de experiencia (>20) y no ser percel. ", "Requisitos", JOptionPane.INFORMATION_MESSAGE);
		
	}

	
}
