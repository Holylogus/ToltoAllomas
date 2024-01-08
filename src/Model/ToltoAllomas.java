package Model;
import Model.*;


public class ToltoAllomas {
	private Urhajo[] urhajok;
	private int urhajoDb;
	
	public ToltoAllomas(int db) {
		this.urhajoDb = 0;
		this.urhajok = new Urhajo[db];
	}

	public void felvesz(Urhajo urhajo) {
		if (urhajoDb < urhajok.length) {
			urhajok[urhajoDb++] = urhajo;
		} else {
			System.out.println("Nincs szabad hely");
		}
		
	}

	public String[] urhajokLeirasa() {
		String[] urhajok = new String[this.urhajok.length];
		for (int i = 0; i < urhajoDb; i++) {
			Urhajo u = this.urhajok[i];
			if (u != null) {
				urhajok[i] = u.toString();
			}
		}
		return urhajok;
	}

	public void tankoltatt(Uzemanyag uzemanyag) {
		for (int i = 0; i < urhajok.length; i++) {
			Urhajo urhajo = urhajok[i];
			if (urhajo != null) {
				urhajo.tankol();
			}
		}
		
	}

	public void kiad(String kapitanyNeve) {
		int i = 0;
		while (urhajok[i] == null || i < urhajoDb && !(urhajok[i].getKapitany().equals(kapitanyNeve))) {
			i++;
		}
		if (i < urhajoDb) {
			System.out.println(String.format("Kiadva %s hajója", kapitanyNeve));
			urhajok[i] = null;
			
		} else {
			System.out.println("Nincs nevű kapitány az adatbázisban");
		}
		
	}
	
	
	
}