import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;


public class Ejercicio3 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel panelContenido;
	
	public Ejercicio3() {
		
		//Ventana
		setVisible(true);
		setTitle("Ejercicio 3");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,397,309);
		getContentPane().setLayout(null);
		
		//Panel
		panelContenido = new JPanel();
		setContentPane(panelContenido);
		panelContenido.setLayout(null);
		
		//Select SO Label
		JLabel selectSO = new JLabel("Selecciona sistema operativo:");
		selectSO.setBounds(10, 11, 182, 14);
		panelContenido.add(selectSO);
		
		//Select SO buttons
		JRadioButton so1 = new JRadioButton("Windows");
		so1.setBounds(13, 38, 109, 23);
		panelContenido.add(so1);
		
		JRadioButton so2 = new JRadioButton("Linux");
		so2.setBounds(135, 38, 109, 23);
		panelContenido.add(so2);
		
		JRadioButton so3 = new JRadioButton("Mac");
		so3.setBounds(257, 38, 109, 23);
		panelContenido.add(so3);
		
		ButtonGroup selectSo = new ButtonGroup();
		selectSo.add(so1);
		selectSo.add(so2);
		selectSo.add(so3);
		
		//Select specialty		
		JLabel selectSpecialty = new JLabel("Selecciona especialidad");
		selectSpecialty.setBounds(10, 78, 148, 14);
		panelContenido.add(selectSpecialty);
		
		JCheckBox spec1 = new JCheckBox("Programacion");
		spec1.setBounds(10, 98, 109, 23);
		panelContenido.add(spec1);
		
		JCheckBox spec2 = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		spec2.setBounds(10, 124, 109, 23);
		panelContenido.add(spec2);
		
		JCheckBox spec3 = new JCheckBox("Administracion");
		spec3.setBounds(10, 150, 131, 23);
		panelContenido.add(spec3);
		
		//Select horas ddedicdas
		JLabel selectHoras = new JLabel("Horas dedicadas:");
		selectHoras.setBounds(213, 78, 122, 14);
		panelContenido.add(selectHoras);
		
		//formateo del spinner
		SpinnerNumberModel modelo;
		modelo = new SpinnerNumberModel(0, 0, 10, 1);
		JSpinner spinnerHoras = new JSpinner(modelo);
		spinnerHoras.setBounds(213, 99, 44, 20);
		panelContenido.add(spinnerHoras);
		
		//Mostrar contenido
		JButton printButton = new JButton("Mostrar");
		printButton.setBounds(188, 135, 89, 23);
		panelContenido.add(printButton);
		
		JTextArea customerInfo = new JTextArea("");
		customerInfo.setBackground(UIManager.getColor("Button.background"));
		customerInfo.setEditable(false);
		customerInfo.setLineWrap(true);
		customerInfo.setEnabled(false);
		customerInfo.setBounds(10, 211, 356, 105);
		panelContenido.add(customerInfo);
		
		JLabel outputLabel = new JLabel("Valores escogidos:");
		outputLabel.setForeground(UIManager.getColor("CheckBox.background"));
		outputLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		outputLabel.setBounds(10, 187, 131, 30);
		panelContenido.add(outputLabel);
		
		ActionListener showInfo = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder out = new StringBuilder();
				out.append("Sistema operativo: ");
				//variable SO
				if (so1.isSelected()) out.append("Windows");
				if (so2.isSelected()) out.append("Linux");
				if (so3.isSelected()) out.append(("Mac"));
				//variable Specs
				out.append("\nEspecialidades: ");
				if (spec1.isSelected()) out.append(spec1.getText()+" ,");
				if (spec2.isSelected()) out.append(spec2.getText()+" ,");
				if (spec3.isSelected()) out.append(spec3.getText()+" ,");
				out.delete(out.length()-2, out.length()); //elimina el ultimo punto y coma
				//variable horas
				out.append(".\nHoras dedicadas: ");
				out.append(spinnerHoras.getValue());
				
				//Mostrar en etiqueta oculta
				outputLabel.setForeground(UIManager.getColor("CheckBox.black"));
				customerInfo.setEnabled(true);
				customerInfo.setText(out.toString());
			}
		};printButton.addActionListener(showInfo);
	}
}
