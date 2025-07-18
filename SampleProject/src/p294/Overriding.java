package p294;

class Cannon extends Weapon{
	protected int fire() {
		return 10;
	}
}

public class Overriding {public static void main(String[] args) {
	Weapon wep = new Weapon();
	System.out.println("기본 무기의 살상 능력은 "+ wep.fire());
	
	wep = new Cannon();
	System.out.println("캐논의 살상 능력은" +wep.fire());
	
}
	
}
