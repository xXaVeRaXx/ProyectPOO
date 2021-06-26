import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InterfazGrafica {
	
	private JFrame panelDepartamentos;
	private JFrame panelCargos;
	private JFrame panelMiembros;
	private JFrame panelPercel;
	private int cargoElegido = 0;
	
	public int getCargoElegido() {
		return cargoElegido;
	}

	
	
	//////////////////////////////////////////
	/*		INTERFAZ DEPARTAMENTOS			*/
	//////////////////////////////////////////
	public void inicializarDepartamentos(Departamentos departamentos) {
		
		panelDepartamentos = new JFrame();
		panelDepartamentos.setBounds(100, 100, 450, 300);
		panelDepartamentos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelDepartamentos.getContentPane().setLayout(null);
		panelDepartamentos.setLocationRelativeTo(null);
		
		
		JButton Direccion = new JButton("Direccion");
		Direccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicializarCargos(departamentos.getDireccion());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		Direccion.setBounds(35, 67, 148, 22);
		panelDepartamentos.getContentPane().add(Direccion);
		
		
		JButton Logistica = new JButton("Logistica");
		Logistica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicializarCargos(departamentos.getLogistica());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		Logistica.setBounds(35, 105, 148, 22);
		panelDepartamentos.add(Logistica);
		
		
		JButton Control_robots = new JButton("Control Robots");
		Control_robots.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inicializarCargos(departamentos.getControl_robots());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		Control_robots.setBounds(35, 141, 148, 22);
		panelDepartamentos.getContentPane().add(Control_robots);
		
		
		JButton Medico = new JButton("Medico");
		Medico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicializarCargos(departamentos.getMedico());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		Medico.setBounds(35, 179, 148, 22);
		panelDepartamentos.add(Medico);
		
		
		JButton Inv_biologica = new JButton("Inv. Biologica");
		Inv_biologica.setBounds(35, 217, 148, 22);
		panelDepartamentos.add(Inv_biologica);
		Inv_biologica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicializarCargos(departamentos.getInv_biologica());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		
		JButton Const_Mantenimiento = new JButton("Construccion Man.");
		Const_Mantenimiento.setBounds(238, 67, 148, 22);
		panelDepartamentos.add(Const_Mantenimiento);
		Const_Mantenimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicializarCargos(departamentos.getConstruccion_mantenimiento());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		
		JButton Sis_informaticos = new JButton("Sis. Informaticos");
		Sis_informaticos.setBounds(238, 105, 148, 22);
		panelDepartamentos.add(Sis_informaticos);
		Sis_informaticos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicializarCargos(departamentos.getSistemas_informaticos());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		
		JButton Inv_astronomica = new JButton("Inv. Astronomica");
		Inv_astronomica.setBounds(238, 141, 148, 22);
		panelDepartamentos.add(Inv_astronomica);
		Inv_astronomica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicializarCargos(departamentos.getInvestigacion_astronomica());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		
		JButton Cometologia = new JButton("Cometologia");
		Cometologia.setBounds(238, 179, 148, 22);
		panelDepartamentos.add(Cometologia);
		Cometologia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicializarCargos(departamentos.getCometologia());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		
		JButton Navegacion = new JButton("Navegacion");
		Navegacion.setBounds(238, 217, 148, 22);
		panelDepartamentos.add(Navegacion);
		Navegacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicializarCargos(departamentos.getNavegacion());
				panelDepartamentos.setVisible(false);
				panelCargos.setVisible(true);
			}
		});
		
		JLabel Departamentos = new JLabel("Departamentos:");
		Departamentos.setFont(new Font("Tahoma", Font.BOLD, 16));
		Departamentos.setBounds(145, 26, 138, 22);
		panelDepartamentos.getContentPane().add(Departamentos);
		
		JLabel miembrosTotales = new JLabel((100 - departamentos.getMiembrosTotales()) + " / 100");
		miembrosTotales.setBounds(350, 11, 118, 14);
		panelDepartamentos.add(miembrosTotales);
		
	
		panelDepartamentos.setVisible(true);
	}
	
	
	
	
	//////////////////////////////////
	/*		INTERFAZ CARGOS			*/
	//////////////////////////////////
	public void inicializarCargos(Departamento departamento) {
		
		
		
		panelCargos = new JFrame();
		panelCargos.setBounds(100, 100, 450, 300);
		panelCargos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelCargos.getContentPane().setLayout(null);
		panelCargos.setLocationRelativeTo(null);
		
		JLabel Cargos = new JLabel("Cargos:");
		Cargos.setFont(new Font("Tahoma", Font.BOLD, 16));
		Cargos.setBounds(176, 25, 82, 20);
		panelCargos.add(Cargos);
		
		JButton Director = new JButton("Director");
		Director.setBounds(49, 75, 118, 23);
		panelCargos.add(Director);
		Director.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargoElegido = 1;
				inicializarMiembros(departamento.getDirector().getDirectores(),1 -  departamento.getDirector().getDirectoresDisponibles());
				departamento.getDirector().escribirRequisitos();
				panelCargos.setVisible(false);
				panelMiembros.setVisible(true);
			}
		});
		
		JButton Subdirector = new JButton("Subdirector");
		Subdirector.setBounds(265, 75, 118, 23);
		panelCargos.add(Subdirector);
		Subdirector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargoElegido = 2;
				panelCargos.setVisible(false);
				inicializarPercel(departamento);
				panelPercel.setVisible(true);
			}
		});
		
		JButton Responsable = new JButton("Responsable");
		Responsable.setBounds(49, 131, 118, 23);
		panelCargos.add(Responsable);
		Responsable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargoElegido = 3;
				panelCargos.setVisible(false);
				inicializarPercel(departamento);
				panelPercel.setVisible(true);
			}
		});
		
		JButton Coordinador = new JButton("Coordinador");
		Coordinador.setBounds(265, 131, 118, 23);
		panelCargos.add(Coordinador);
		Coordinador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargoElegido = 4;
				panelCargos.setVisible(false);
				inicializarPercel(departamento);
				panelPercel.setVisible(true);
				
			}
		});
		
		JButton Operario = new JButton("Operario");
		Operario.setBounds(160, 189, 118, 23);
		panelCargos.add(Operario);
		Operario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargoElegido = 5;
				panelCargos.setVisible(false);
				inicializarPercel(departamento);
				panelPercel.setVisible(true);
				
			}
		});
		
		JButton BackCargos = new JButton("<-");
		BackCargos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCargos.setVisible(false);
				panelDepartamentos.setVisible(true);
			}
		});
		BackCargos.setBounds(379, 227, 45, 23);
		panelCargos.add(BackCargos);
		
		JLabel miembrosDepartamento = new JLabel(departamento.getMiembrosDepartamento()+ " / 41");
		miembrosDepartamento.setBounds(350, 11, 118, 14);
		panelCargos.add(miembrosDepartamento);
	}


	/////////////////////////////////////
	/*       INTERFAZ PERCELES         */
	/////////////////////////////////////
	public void inicializarPercel(Departamento departamento) {
		
		panelPercel = new JFrame();
		panelPercel.setBounds(100, 100, 349, 176);
		panelPercel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelPercel.getContentPane().setLayout(null);
		panelPercel.setLocationRelativeTo(null);
		
		JLabel textoPercel = new JLabel("Perceles maximos en este cargo:");
		textoPercel.setBounds(60, 28, 258, 14);
		panelPercel.add(textoPercel);
		
		JTextField numPerceles = new JTextField();
		numPerceles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoRecibido = numPerceles.getText();
				try {
					int percelesPermitidos = Integer.valueOf(textoRecibido);
					if (cargoElegido == 2) {
						departamento.getSubdirector().comprobarPerceles(percelesPermitidos);
						panelPercel.setVisible(false);
						inicializarMiembros(departamento.getSubdirector().getSubdirectores(), 1 - departamento.getSubdirector().getSubdirectoresDisponibles());
						departamento.getSubdirector().escribirRequisitos();
						panelMiembros.setVisible(true);
					}
					else if (cargoElegido == 3) {
						departamento.getResponsable().comprobarPerceles(percelesPermitidos);
						panelPercel.setVisible(false);
						inicializarMiembros(departamento.getResponsable().getResponsables(), 3 - departamento.getResponsable().getResponsablesDisponibles());
						departamento.getResponsable().escribirRequisitos();
						panelMiembros.setVisible(true);	
					}
					else if (cargoElegido == 4) {
						departamento.getCoordinador().comprobarPerceles(percelesPermitidos);
						panelPercel.setVisible(false);
						inicializarMiembros(departamento.getCoordinador().getCoordinadores(), 9 - departamento.getCoordinador().getCoordinadoresDisponibles());
						departamento.getCoordinador().escribirRequisitos();
						panelMiembros.setVisible(true);	
					}
					else if (cargoElegido == 5) {
						departamento.getOperario().comprobarPerceles(percelesPermitidos);
						panelPercel.setVisible(false);
						inicializarMiembros(departamento.getOperario().getOperarios(), 27 - departamento.getOperario().getOperariosDisponibles());
						departamento.getOperario().escribirRequisitos();
						panelMiembros.setVisible(true);	
					}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "No se ha introducido un numero.", "Error", JOptionPane.WARNING_MESSAGE);
					System.exit(0);

				}
			}
		});
		numPerceles.setBounds(123, 69, 86, 20);
		panelPercel.add(numPerceles);
	}
	
	
	//////////////////////////////////////
	/*		INTERFAZ MIEMBROS			*/
	//////////////////////////////////////
	
	public void inicializarMiembros(ArrayList<Miembro> cargo, int numMiembrosCargo) {	
		
		EscribirMiembro escribirMiembro = new EscribirMiembro();
		
		panelMiembros = new JFrame();
		panelMiembros.setBounds(100, 100, 450, 300);
		panelMiembros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelMiembros.getContentPane().setLayout(null);
		panelMiembros.setLocationRelativeTo(null);
		
		JLabel Miembros = new JLabel("Miembros:");
		Miembros.setFont(new Font("Tahoma", Font.BOLD, 16));
		Miembros.setBounds(175, 25, 138, 22);
		panelMiembros.add(Miembros);
		
		String[] nombresMiembros = null;
		
		try {
			if (cargo.size() > 0) {
				nombresMiembros = new String[cargo.size()];
				for(int i = 0; i <cargo.size(); i++) {
				    nombresMiembros[i] = cargo.get(i).getNombre();
				}
			}
			else {
				nombresMiembros = new String[1];
				nombresMiembros[0] = "No hay miembros.";
				
			}
		}
		catch(NullPointerException e) {
			System.out.println("Error al imprimir los miembros.");
			System.exit(0);
		}
		
		
		JComboBox comboBox = new JComboBox(nombresMiembros);
		comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    
                String nombreSeleccionado = (String) comboBox.getSelectedItem();  
                int numSeleccionado = comboBox.getSelectedIndex();
                switch (nombreSeleccionado) {
                    case "No hay miembros.":                            
                        break;
                    default:
					try {
						escribirMiembro.escribirResultadoMiembro(cargo.get(numSeleccionado));
						JOptionPane.showMessageDialog(null, "Se ha escrito el miembro elegido en el fichero.", "Imprimir", JOptionPane.INFORMATION_MESSAGE);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "No se ha detectado un miembro.", "Error", JOptionPane.WARNING_MESSAGE);
					}
                        break;                        
                }
            }
        });
		comboBox.setBounds(115, 92, 208, 37);
		panelMiembros.add(comboBox);
		
		
		
 
		JButton BackMiembros = new JButton("<-");
		BackMiembros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMiembros.setVisible(false);
				panelCargos.setVisible(true);	
				cargoElegido = 0;
			}
		});
		BackMiembros.setBounds(379, 227, 45, 23);
		panelMiembros.add(BackMiembros);
		
		
		JLabel miembrosCargo = new JLabel( numMiembrosCargo + " / " + miembrosCargoElegido());
		miembrosCargo.setBounds(350, 11, 118, 14);
		panelMiembros.add(miembrosCargo);
		
		
	}
	
	
	public int miembrosCargoElegido() {
		if (cargoElegido == 1) {
			return 1;
		}
		else if (cargoElegido == 2) {
			return 1;
		}
		else if (cargoElegido == 3) {
			return 3;
		}
		else if (cargoElegido == 4) {
			return 9;
		}
		else if (cargoElegido == 5) {
			return 27;
		}
		else {
			return 0;
		}
	}
}