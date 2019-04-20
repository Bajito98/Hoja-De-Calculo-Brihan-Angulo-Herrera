package controlador;

import modelo.Mundo;
import vista.InterfazGui;

public class Controlador {

	private InterfazGui inter;
	private Mundo mun;
	
	public Controlador() {
		
		inter = new InterfazGui();
		mun = new Mundo();
		mostrarTasa();
		mostrarAnual();
		mostrarCuota();
		mostrarTabla();
	}
	
	public void mostrarTasa() {
		
		String q = "";
		double x = (inter.recibirDato("Ingrese El Interes"));
		x = mun.getCr().calcularTasa(x);
		inter.getMensaje(x);
	}
	
	public void mostrarAnual() {
		
		String q = "";
		double x = (inter.recibirDato("Ingrese El Periodo"));
		x = mun.getCr().calcularAnual(x);
		inter.getMensaje(x);
	}
	
	public void mostrarCuota() {
		
		String q = "";
		double x = (inter.recibirDato("Ingrese La Inversion"));
		x = mun.getCr().calcularCuota(x);
		inter.getMensaje(x);
	}
	
	public void mostrarTabla() 
	{
		String q = mun.getCr().calcularTabla();
		inter.getMensaje2(q);
	}
	
}
