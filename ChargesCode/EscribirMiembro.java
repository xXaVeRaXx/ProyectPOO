import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EscribirMiembro {

public void escribirResultadoMiembro(Miembro miembro) throws IOException{
        
		
		BufferedWriter bufferedwriter;
		
		try
		{
			//ESCRIBIR EN EL FICHERO EL RESULTADO DEL MIEMBRO ELEGIDO
			bufferedwriter = new BufferedWriter(new FileWriter("miembro_elegido.txt"));
			bufferedwriter.write("");
			bufferedwriter.append("Miembro elegido: \n");
			bufferedwriter.append(miembro.getNombre() + " " + miembro.getApellidos() + "\n");
			bufferedwriter.append("Cargo: " + miembro.getCargo() + "\n");
			bufferedwriter.append("Anio Nacimiento: " + miembro.getAnioNacimiento() + "\n");
			bufferedwriter.append("Percel: " + miembro.getPercel() + "\n");
			bufferedwriter.append("Cociente Habilidad: " + miembro.getCociente() + "\n");
				
			
			bufferedwriter.close();			
		}
		//NO HACE FALTA YA QUE SI EL FICHERO NO EXISTE, LO CREA
		catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"No se ha encontrado el fichero para escribir." , "Error", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		
		} 
    }
}
