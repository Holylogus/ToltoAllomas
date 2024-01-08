package Model;

public class Urhajo {
	

	private String kapitany;
	private boolean tartalyAllapot;
	private double hajoAllapot;
	private Uzemanyag uzemanyag;
	
	public Urhajo(String kapitany) {
		this.tartalyAllapot = false;
		this.kapitany = kapitany;
		this.hajoAllapot = 100.0;
		this.setUzemanyag(Uzemanyag.Hidrogén);
	}

	public Urhajo(String kapitany, boolean tartalyAllapot, double hajoAllapot) {
		super();
		this.kapitany = kapitany;
		this.tartalyAllapot = tartalyAllapot;
		this.hajoAllapot = hajoAllapot;
	}

	public String getKapitany() {
		return kapitany;
	}

	public void setKapitany(String kapitany) {
		this.kapitany = kapitany;
	}

	public boolean isTartalyAllapot() {
		return tartalyAllapot;
	}

	public void setTartalyAllapot(boolean tartalyAllapot) {
		this.tartalyAllapot = tartalyAllapot;
	}


	@Override
	public String toString() {
		return "Urhajo [kapitany=" + kapitany + ", tartalyAllapot=" + tartalyAllapot + ", hajoAllapot=" + hajoAllapot
				+ "]";
	}

	public void tankol() {
		setTartalyAllapot(true);
		setHajoAllapot(5.0);
		
	}

	public double getHajoAllapot() {
		return hajoAllapot;
	}

	public void setHajoAllapot(double kopas) {
		if (this.hajoAllapot >= 0) {
			this.hajoAllapot -= kopas;
		} else {
			System.out.println("A hajtóművet cserélni kellett!");		};
	}

	public Uzemanyag getUzemanyag() {
		return uzemanyag;
	}

	public void setUzemanyag(Uzemanyag uzemanyag) {
		this.uzemanyag = uzemanyag;
	}

	

	
	
	
	
}
