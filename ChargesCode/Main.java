import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			LeerFichero leer = new LeerFichero();
			Departamentos departamentos = new Departamentos();
			InterfazGrafica interfaz= new InterfazGrafica();
			
			leer.leerFichero(departamentos);
			interfaz.inicializarDepartamentos(departamentos);		
							
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en el programa.", "Error", JOptionPane.WARNING_MESSAGE);
		}
	}
}
