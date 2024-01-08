package Model;

public class Moon extends Urhajo{

	public Moon(String kapitany, boolean tartalyAllapot, double hajoAllapot) {
		super(kapitany, tartalyAllapot, hajoAllapot);
		
	}

	public Moon(String kapitany) {
		super(kapitany);
		
	}

	@Override
	public void tankol() {
		setTartalyAllapot(true);
		setHajoAllapot(7.5);
	}
	
}
