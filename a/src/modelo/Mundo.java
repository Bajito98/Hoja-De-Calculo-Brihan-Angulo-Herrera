package modelo;

public class Mundo {
	
	private Credito cr;

	public Mundo() {
		
		cr = new Credito();
	}

	public Credito getCr() {
		return cr;
	}

	public void setCr(Credito cr) {
		this.cr = cr;
	}
}
