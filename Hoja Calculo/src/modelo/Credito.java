package modelo;

public class Credito {
	
	double cuota;
	double anual;
	double tasa;
	double cSaldo;
	double pSaldo;
	double amorti;
	double interes;
	double inversion;
	double periodo;
	
	
	public Credito() 	{
	
	}
	
	public double calcularTasa(double interes) {

		this.interes = interes;
		interes/=100;
		tasa =  Math.pow(1+interes, (1/12.0));
		tasa-=1;
		tasa*=100;
		return tasa;
		
	}
	
	public double calcularAnual(double periodo) {
		
		this.periodo = periodo;
		tasa=tasa / 100;
		tasa=tasa + 1;
		periodo = -1*periodo;
		anual = Math.pow(tasa,periodo);
		tasa= tasa - 1;
		anual=1-anual;
		anual= anual/tasa;
		return anual;
		
	}
	
	
	public double calcularCuota(double inversion) {
		
		this.inversion = inversion;
		cuota = inversion/anual;
		return cuota;
		
	}
	
	public String calcularTabla() {
	
		String q = "";
		for(double x=0; x<periodo; x++) {
			
			cSaldo = inversion/anual;
			interes = inversion*tasa;
			pSaldo = inversion-amorti;
			amorti = cSaldo-interes;
			q+="El Saldo Es: "+pSaldo+" La Cuota Es: "+cSaldo+" El Interes Es: "+interes+" La Amortizacion Es: "+amorti+"\n";
		}
		return q;	
	}
}
