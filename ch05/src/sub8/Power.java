package sub8;

public class Power implements Socket{

	private Bulb bulb;
	
	public Power(Bulb bulb) {
		this.bulb = bulb;
	}
	
	@Override
	public void switchon() {
		bulb.lighton();	
	}

	@Override
	public void switchoff() {
		bulb.lightoff();
	}

}
