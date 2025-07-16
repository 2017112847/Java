package sub8;

public class RemoteLG implements RemoteControl{
	
	@Override
	public void poweon() {
		System.out.println("전원 온");
		
	}

	@Override
	public void poweoff() {
		System.out.println("전원 오프");
		
	}

	@Override
	public void chup() {
		System.out.println("채널위");
		
	}

	@Override
	public void chdown() {
		System.out.println("채널아래");
		
	}

	@Override
	public void soundup() {
		System.out.println("소리업");
		
	}

	@Override
	public void sounddown() {
		System.out.println("소리 다운");
		
	}

}
