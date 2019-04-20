package vista;

import javax.swing.JOptionPane;

public class InterfazGui {

public InterfazGui() {
		
	}
	
	public double recibirDato(String mensaje) {
		
		 double resultado = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
		 return resultado;
	
	}
	
	public void getMensaje(double mensaje) {
		
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void getMensaje2(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
}
