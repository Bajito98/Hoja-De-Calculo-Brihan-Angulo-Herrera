package vista;
import javax.swing.JOptionPane;

public class InterfazGui {
	

	public InterfazGui() {
		
	}
	
	public String recibirDato(String mensaje) {
		
		 String resultado = JOptionPane.showInputDialog(null, mensaje);
		 return resultado;
	}

	public void getMensaje(String mensaje) {
		
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
