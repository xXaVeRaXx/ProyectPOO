import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class LeerFichero {
	
	Miembro[] arrayMiembros = new Miembro[100];
	private int numMiembros = 0;
	boolean miembroSinCargo = false;
	boolean miembroSinDepartamento = false;

	public void leerFichero(Departamentos departamentos) throws IOException{
		
		File fichero = new File("miembros.txt");
		Scanner scanner;
		
		
		try{
			scanner = new Scanner(fichero);
			while(scanner.hasNextLine()) {
					
				try {
					String linea = scanner.nextLine();
					Miembro miembro_temp = new Miembro();
					
					Scanner scanner_linea = new Scanner(linea);
					scanner_linea.useDelimiter("\\s*;\\s*");
					miembro_temp.setNombre(scanner_linea.next());
					miembro_temp.setApellidos(scanner_linea.next());
					miembro_temp.setCargo(scanner_linea.next());
					miembro_temp.setAniosExperiencia(scanner_linea.nextInt());
					miembro_temp.setAnioNacimiento(scanner_linea.nextInt());
					miembro_temp.setCociente(scanner_linea.nextInt());
					miembro_temp.setDepartamento(scanner_linea.next());
					miembro_temp.setPercel(scanner_linea.next());
					
					try {
						//USAMOS UN ARRAY PARA AYUDARNOS A GUARDAR EL NUEVO MIEMBRO
						arrayMiembros[numMiembros] = miembro_temp;
						comprobarDepartamento(departamentos);
						numMiembros++;
					}
					//POR SI RECIBIMOS MAS DE 100 MIEMBROS
					catch(ArrayIndexOutOfBoundsException e){
						JOptionPane.showMessageDialog(null, "Superan los 100 miembros, cambie el numero de miembros;", "Error", JOptionPane.WARNING_MESSAGE);
						System.exit(0);
					}
				}
				//POR SI EL TEXTO NO SE GUARDA
				catch(NullPointerException e){
					JOptionPane.showMessageDialog(null, "El texto introducido no se guarda correctamente.", "Error", JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}
			}
			scanner.close();
		}
		//POR SI EL FICHERO NO SE ENCUENTRA
		catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo para leer.", "Error", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	//GUARDAR EL MIEMBRO EN EL DEPARTAMENTO CORRECTO
	public void comprobarDepartamento(Departamentos departamentos) {
		
		if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("direccion") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("dirección"))) {
			comprobarCargo(departamentos.getDireccion(),departamentos);
		}
		else if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("logistica") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("logística"))) {
			comprobarCargo(departamentos.getLogistica(),departamentos);
		}
		else if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("control de robots") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("control robots"))) {
			comprobarCargo(departamentos.getControl_robots(),departamentos);
		}
		else if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("medico") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("médico"))) {
			comprobarCargo(departamentos.getMedico(),departamentos);
		}
		else if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("investigacion biologica") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("investigación biológica"))) {
			comprobarCargo(departamentos.getInv_biologica(),departamentos);
		}
		else if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("construccion y mantenimiento") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("construcción y mantenimiento"))) {
			comprobarCargo(departamentos.getConstruccion_mantenimiento(),departamentos);
		}
		else if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("sistemas informaticos") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("sistemas informáticos"))) {
			comprobarCargo(departamentos.getSistemas_informaticos(),departamentos);
		}
		else if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("investigacion astronomica") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("investigación astronomica"))) {
			comprobarCargo(departamentos.getInvestigacion_astronomica(),departamentos);
		}
		else if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("cometologia") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("cometología"))) {
			comprobarCargo(departamentos.getCometologia(),departamentos);
		}
		else if(arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("navegacion") || (arrayMiembros[numMiembros].getDepartamento().equalsIgnoreCase("navegación"))) {
			comprobarCargo(departamentos.getNavegacion(),departamentos);
		}
		else {
			//PARA QUE SOLO LO ESCRIBA UNA VEZ
			if(miembroSinDepartamento == false) {
				JOptionPane.showMessageDialog(null, "Se ha detectado un miembro sin departamento. No se guardará.", "Error", JOptionPane.WARNING_MESSAGE);
				miembroSinDepartamento = true;
			}
		}
	}
	
	//COMPROBAR QUE CADA MIEMBRO SE GUARDE EN EL CARGO CORRECTO Y VER SI ES PERCEL
	public void comprobarCargo(Departamento departamento,Departamentos departamentos) {
		
		Miembro miembroRequisitos = new Miembro();
		
		if (arrayMiembros[numMiembros].getCargo().equalsIgnoreCase("director")) {			
			miembroRequisitos = departamento.getDirector().requisitosCargo(arrayMiembros[numMiembros]);
			if (miembroRequisitos != null) {
				departamento.getDirector().getDirectores().add(miembroRequisitos);
				departamento.getDirector().ocuparCargo(miembroRequisitos);
				departamentos.ocuparDepartamento(departamento);
				departamentos.ocuparMiembrosTotales();
			}
		}
		else if (arrayMiembros[numMiembros].getCargo().equalsIgnoreCase("subdirector")) {
			miembroRequisitos = departamento.getSubdirector().requisitosCargo(arrayMiembros[numMiembros]);
			if (miembroRequisitos != null) {
				if(miembroRequisitos.getPercel().equalsIgnoreCase("si")) {
					departamento.getSubdirector().ocuparPercel();
				}
				departamento.getSubdirector().getSubdirectores().add(miembroRequisitos);
				departamento.getSubdirector().ocuparCargo(miembroRequisitos);
				departamentos.ocuparDepartamento(departamento);
				departamentos.ocuparMiembrosTotales();
			}
		}
		else if (arrayMiembros[numMiembros].getCargo().equalsIgnoreCase("responsable")) {
			miembroRequisitos = departamento.getResponsable().requisitosCargo(arrayMiembros[numMiembros]);
			if (miembroRequisitos != null) {
				if(miembroRequisitos.getPercel().equalsIgnoreCase("si")) {
					departamento.getResponsable().ocuparPercel();
				}
				departamento.getResponsable().getResponsables().add(miembroRequisitos);
				departamento.getResponsable().ocuparCargo(miembroRequisitos);
				departamentos.ocuparDepartamento(departamento);
				departamentos.ocuparMiembrosTotales();
			}
		}
		else if (arrayMiembros[numMiembros].getCargo().equalsIgnoreCase("coordinador")) {
			miembroRequisitos = departamento.getCoordinador().requisitosCargo(arrayMiembros[numMiembros]);
			if (miembroRequisitos != null) {
				if(miembroRequisitos.getPercel().equalsIgnoreCase("si")) {
					departamento.getCoordinador().ocuparPercel();
				}
				departamento.getCoordinador().getCoordinadores().add(miembroRequisitos);
				departamento.getCoordinador().ocuparCargo(miembroRequisitos);
				departamentos.ocuparDepartamento(departamento);
				departamentos.ocuparMiembrosTotales();
			}
		}
		else if (arrayMiembros[numMiembros].getCargo().equalsIgnoreCase("operario")) {
			miembroRequisitos = departamento.getOperario().requisitosCargo(arrayMiembros[numMiembros]);
			if (miembroRequisitos != null) {
				if(miembroRequisitos.getPercel().equalsIgnoreCase("si")) {
					departamento.getOperario().ocuparPercel();
				}
				departamento.getOperario().getOperarios().add(miembroRequisitos);
				departamento.getOperario().ocuparCargo(miembroRequisitos);
				departamentos.ocuparDepartamento(departamento);
				departamentos.ocuparMiembrosTotales();
			}
		}
		else {
			//PARA QUE SOLO LO ESCRIBA UNA VEZ
			if(miembroSinCargo == false) {
				JOptionPane.showMessageDialog(null, "Se ha detectado un miembro sin cargo. No se guardará.", "Error", JOptionPane.WARNING_MESSAGE);
				miembroSinCargo = true;
			}
		}
		
	}
	
}