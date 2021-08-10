import javax.swing.*;
import java.awt.event.*;

public class Ejercicio1 extends JFrame {
	
	private JPanel panel;
	
	public Ejercicio1() {
		//Contenedor
		setTitle("Tarea 1: Saludador");
		setBounds(800,500,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//Panel
		panel = new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
		//Elementos
		//descripcion
		JLabel descripcion = new JLabel("Escribre el nombre para saludar");
		descripcion.setBounds(150,20,300,20);
		panel.add(descripcion);
		//campo de texto
		JTextField campoTexto = new JTextField();
		campoTexto.setBounds(90,50,300,30);
		panel.add(campoTexto);
		//boton
		JButton botonSaludar = new JButton("Saludame !!");
		botonSaludar.setBounds(170,90,150,20);
		panel.add(botonSaludar);
			//listener
			botonSaludar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "¡ Hola " + campoTexto.getText() + " !");
				}
			});
	}
}
