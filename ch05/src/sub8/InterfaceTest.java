package sub8;

	//07.16/인터페이스
public class InterfaceTest {public static void main(String[] args) {
	
	//인터페이스 역할1 - 통일화된 표준화 설계
	RemoteControl lg = new RemoteLG();
	lg.poweoff();
	lg.poweon();
	lg.chdown();
	lg.chup();
	
	RemoteControl samsung = new RemoteSamsung();
	samsung.chdown();
	samsung.chup();
	samsung.soundup();
	samsung.sounddown();
	
	//인터페이스 역할2 - 결합도 완화(유연성)
	Bulb bulb = new Bulb();
	Socket socket = new Power(bulb);
	
	socket.switchon();
	socket.switchoff();
	
	//인터페이스 역할1 - 다중 상속 효과
	SmartTv smarttv = new SmartTv();
	smarttv.process();
	
}

}
