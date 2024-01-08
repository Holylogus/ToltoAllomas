package Model;

public class Shepard extends Urhajo{

	public Shepard(String kapitany, boolean tartalyAllapot, double hajoAllapot) {
		super(kapitany, tartalyAllapot, hajoAllapot);
		
	}

	public Shepard(String kapitany) {
		super(kapitany);
		
	}

	@Override
	public void tankol() {
		setTartalyAllapot(true);
		setHajoAllapot(5);
	}
	
	
	
}
