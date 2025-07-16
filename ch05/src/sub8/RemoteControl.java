package sub8;

//	인터페이스 - 클래스 구현을 위한 오직 추상 메서드만 갖는 구조체					
public interface RemoteControl {
	public abstract void poweon();
	public abstract void poweoff();
	
	public void chup();
	public void chdown();
	
	public void soundup();
	public void sounddown();
}
