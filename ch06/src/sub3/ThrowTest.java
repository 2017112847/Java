package sub3;

class MinusException extends Exception{
	public MinusException(String message) {
		super(message);
	}
}
class OverException extends Exception{
	public OverException(String message) {
		super(message);
	}
}
class Score{
	public void check(int score)throws MinusException, OverException {
		if(score < 0) {
			//예외 발생 시키기
			throw new MinusException("점수는 음수가 안됨");
		}else if(score > 100) {
			//예외 발생 시키기
			throw new OverException("100점을 초과할 수 없음");
		}else	 {
			System.out.println("점수가 이상 없음");
		}
	}
}
	
public class ThrowTest {public static void main(String[] args) {
	Score sc = new Score();
	try {
		//sc.check(-3);
		//sc.check(103);
		sc.check(99);
	} catch (MinusException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (OverException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
