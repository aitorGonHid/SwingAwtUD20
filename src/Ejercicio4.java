import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Ejercicio4 extends JFrame{
	
	public Ejercicio4() {
		
		//Ventana
		setVisible(true);
		setTitle("Ejercicio 4");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,273,217);
		getContentPane().setLayout(null);
		
		//Componentes
		//Label
		JLabel operacionLabel = new JLabel("Operacion");
		operacionLabel.setBounds(10, 51, 62, 14);
		getContentPane().add(operacionLabel);
		
		//TextFields
		JTextField operando1 = new JTextField();
		operando1.setHorizontalAlignment(SwingConstants.CENTER);
		operando1.setSize(100, 25);
		operando1.setLocation(10, 10);
		getContentPane().add(operando1);
		
		JTextField simboloOperacion = new JTextField();
		simboloOperacion.setFont(new Font("Tahoma", Font.BOLD, 11));
		simboloOperacion.setEditable(false);
		simboloOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		simboloOperacion.setSize(35, 25); 
		simboloOperacion.setLocation(75,46);
		getContentPane().add(simboloOperacion);
		
		JTextField operando2 = new JTextField();
		operando2.setHorizontalAlignment(SwingConstants.CENTER);
		operando2.setSize(100, 25);
		operando2.setLocation(10, 79);
		getContentPane().add(operando2);
		
		JTextField resultado = new JTextField();
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setSize(100, 30);
		resultado.setLocation(10, 115);
		getContentPane().add(resultado);
		
		//Buttons
		JButton suma = new JButton();
		suma.setFont(new Font("Tahoma", Font.PLAIN, 11));
		suma.setText("+");
		suma.setBounds(130, 10, 50, 30);
		getContentPane().add(suma);
		
		JButton resta = new JButton();
		resta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		resta.setText("-");
		resta.setSize(50, 30);
		resta.setLocation(191, 10);
		getContentPane().add(resta);
		
		JButton division = new JButton();
		division.setText("/");
		division.setSize(50, 30);
		division.setLocation(130, 50);
		getContentPane().add(division);
		
		JButton multiplicacion = new JButton();
		multiplicacion.setText("*");
		multiplicacion.setSize(50, 30);
		multiplicacion.setLocation(191, 50);
		getContentPane().add(multiplicacion);
		
		JButton operar = new JButton();
		operar.setText("=");
		operar.setLocation(130, 115);
		operar.setSize(111, 30);
		getContentPane().add(operar);
				
		//ActionListener
		ActionListener setOperation = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton source = (JButton)e.getSource(); //copia el boton que se ha pulsado
				simboloOperacion.setText(source.getText()); 
			}
		};//Add a los botones de operaciones aritmeticas
		suma.addActionListener(setOperation);
		resta.addActionListener(setOperation);
		multiplicacion.addActionListener(setOperation);
		division.addActionListener(setOperation);
		
		ActionListener showResultado = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String operacion = simboloOperacion.getText();
				Double op1 = Double.parseDouble(operando1.getText());
				Double op2 = Double.parseDouble(operando2.getText());
				Double result;
				DecimalFormat df = new DecimalFormat("#.0000000");
				
				switch(operacion) {
				case ("+"):
					result = op1+op2;
					resultado.setText(df.format(result));
					break;
				case ("-"):
					result = op1-op2;
					resultado.setText(df.format(result));
					break;
				case ("*"):
					result = op1*op2;
					resultado.setText(df.format(result));
					break;
				case ("/"):
					result = op1/op2;
					resultado.setText(df.format(result));
					break;
				}
			}
		};//Add al boton operar
		operar.addActionListener(showResultado);
		

	}
	
}
