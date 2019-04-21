package modelo;

import java.text.DecimalFormat;

public class Credito {
	
	double cuota;
	double anualidad;
	double tasa;
	double saldo;
	double amortizacion;
	double interes;
	double inversion;
	double periodo;
	
	public Credito() {
	
	}
	
	public double calcularTasa(double interes) {

		this.interes = interes;
		interes/=100;
		tasa =  Math.pow(1+interes, 0.083333333);
		tasa-=1;
		tasa*=100;
		return tasa;	
	}	
	
	public double calcularAnual(double periodo) {
		
		this.periodo = periodo;
		tasa=tasa / 100;
		tasa=tasa + 1;
		periodo = -1*periodo;
		anualidad = Math.pow(tasa,periodo);
		tasa= tasa - 1;
		anualidad=1-anualidad;
		anualidad= anualidad/tasa;
		return anualidad;	
	}
	
	
	public double calcularCuota(double inversion) {
		
		this.saldo = inversion;
		this.inversion = inversion;
		cuota = inversion/anualidad;
		return cuota;	
	}
	
	
	public String calcularTabla() {
	
		String q = "";
		DecimalFormat df = new DecimalFormat("#,###");
		
		for(int x=0; x<=periodo; x++) {
			
			interes = saldo*tasa;
			amortizacion = cuota-interes;
			saldo -= amortizacion;
			
			q+="El Saldo Es:  "+df.format(saldo)+"  La Cuota Es:  "+df.format(cuota)+"  El Interes Es:  "+df.format(interes)+"  La Amortizacion Es:  "+df.format(amortizacion)+"\n";
		}
		return q;	
	}
}
