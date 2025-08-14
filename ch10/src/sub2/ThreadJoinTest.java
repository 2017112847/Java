package sub2;
// 스레드 상태
class WorkThread extends Thread{
	@Override
	public void run() {
	for(int i = 1 ; i < 10 ; i++) {
		System.out.println("WorkThread " + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
public class ThreadJoinTest {public static void main(String[] args) {
	WorkThread work = new WorkThread();
	//작업 스레드
	work.start();
	//작업 스레드 종료 대기
	try {
		work.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("end");
}

}
