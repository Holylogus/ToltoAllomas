package Model;

public class Starship extends Urhajo{
	

	public Starship(String kapitany, boolean tartalyAllapot, double hajoAllapot) {
		super(kapitany, tartalyAllapot, hajoAllapot);
		
	}

	public Starship(String kapitany) {
		super(kapitany);
	}

	@Override
	public void tankol() {
		setHajoAllapot(1.5);
		setTartalyAllapot(true);
	}
	
	
	
	

}
