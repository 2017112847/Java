package sub8;

public class SmartTv extends Tv implements Internet {

	@Override
	public void access() {
		System.out.println("인터넷 접속");
		
	}
	public void process() {
		poweron();
		access();
		System.out.println("Smart Tv on");
	}
	
}
