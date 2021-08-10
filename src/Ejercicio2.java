import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio2 extends JFrame {
	
	private JPanel panelContenido;
	
	public Ejercicio2() {
		
		//Ventana
		setVisible(true);
		setTitle("Ejercicio 2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,466,203);
		getContentPane().setLayout(null);
		
		//Panel
		panelContenido = new JPanel();
		panelContenido.setLayout(null);
		setContentPane(panelContenido);
		
		//Componentes
		//labels
		JLabel tituloLabel = new JLabel("Escribe el titulo de una pelicula:");
		tituloLabel.setBounds(26, 27, 191, 14);
		getContentPane().add(tituloLabel);

		JLabel PeliculasLabel = new JLabel("Peliculas");
		PeliculasLabel.setBounds(246, 27, 70, 14);
		getContentPane().add(PeliculasLabel);
		
		//text input
		JFormattedTextField tituloInput = new JFormattedTextField();
		tituloInput.setToolTipText("Introduce un titulo");
		tituloInput.setBounds(26, 50, 149, 20);
		getContentPane().add(tituloInput);
		
		//ComboBox
		JComboBox<String> peliculasBox = new JComboBox<String>();
		peliculasBox.setMaximumRowCount(10);
		peliculasBox.setBounds(246, 49, 116, 22);
		getContentPane().add(peliculasBox);
		
		//Add button
		JButton addButton = new JButton("A\u00F1adir");
		addButton.setHorizontalAlignment(SwingConstants.LEFT);
		addButton.setBounds(26, 84, 79, 23);
		getContentPane().add(addButton);
		
		//Accion: añadir texto introducido a peliculasBox
		ActionListener addFilm = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pelicula = tituloInput.getText();
				peliculasBox.addItem(pelicula);
			}
		};addButton.addActionListener(addFilm);
	}
}
