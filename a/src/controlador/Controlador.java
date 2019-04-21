package controlador;

import java.text.DecimalFormat;

import modelo.Mundo;
import vista.InterfazGui;

public class Controlador {

	private InterfazGui inter;
	private Mundo mun;
	DecimalFormat dr;
	
	public Controlador() {
		
		inter = new InterfazGui();
		mun = new Mundo();
		mostraResultado();
	}
	
	public void mostrarTasa() {
		
		double x = Double.parseDouble(inter.recibirDato("Ingresa el interés"));
		x = mun.getCr().calcularTasa(x);
		DecimalFormat df = new DecimalFormat("#.#");
		String q = "La Tasa Efectiva Es: "+df.format(x);
		inter.getMensaje(q);
	}
	
	public void mostrarAnual() {
		
		double x = Double.parseDouble(inter.recibirDato("Ingrese El Periodo"));
		x = mun.getCr().calcularAnual(x);
		DecimalFormat df = new DecimalFormat("#.####");
		String q = "El Valor De Anualidad Es: "+df.format(x);
		inter.getMensaje(q);
	}
	
	public void mostrarCuota() {
		
		double x = Double.parseDouble(inter.recibirDato("Ingrese La Inversion"));
		x = mun.getCr().calcularCuota(x);
		DecimalFormat df = new DecimalFormat("$#.###");
		String q = "El Valor De La Cuota Es: "+df.format(x);
		inter.getMensaje(q);
	}
	
	public void mostrarTabla() {
		
		String z = mun.getCr().calcularTabla();
		inter.getMensaje(z);	
	}
	
	public void mostraResultado() {
		
		this.mostrarTasa();
		this.mostrarAnual();
		this.mostrarCuota();
		this.mostrarTabla();
	}
}
