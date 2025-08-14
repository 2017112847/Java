package sub2;
class SubThread extends Thread{
	@Override
	public void run() {
		int i = 1;
		try {
		while(true) {
			System.out.println("SubThread  :"+i);
			i++;
			Thread.sleep(1000);	//1초 대기
			}
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
public class ThreadInterrupTest {public static void main(String[] args) {
	SubThread sub = new SubThread();
	// 작업스레드 실행
	sub.start();
	
	try {//	메인스레드 5초 대기
		Thread.sleep(1000*5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// 작업 스레드 일시정시 발생시키기
	sub.interrupt();
	System.out.println("end");
	}

}
