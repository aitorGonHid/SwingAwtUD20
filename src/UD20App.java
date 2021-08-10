import javax.swing.JOptionPane;

public class UD20App {

	public static void main(String[] args) {

		String[] opciones = { "Ejercicio1", "Ejercicio2", "Ejercicio3", "Ejercicio4", "Salir" };    
		int opcion = JOptionPane.showOptionDialog(null, "Elegir ejercicio", "Ejercicios:",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]);
		
		System.out.println(opcion);
			
		switch (opcion) {
		case(0):
			Ejercicio1 ej1 = new Ejercicio1();
			break;
		case(1):
			Ejercicio2 ej2 = new Ejercicio2();
			break;
		case(2):
			Ejercicio3 ej3 = new Ejercicio3();
			break;
		case(3):
			Ejercicio4 ej4 = new Ejercicio4();
			break;
		case(4):
			JOptionPane.showMessageDialog(null, "Saliendo...");
		}		
	}
}

