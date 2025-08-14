//스레드

package sub1;
class subThread extends Thread{
	private String name;
	public subThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i =0; i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+"작업 ㅅ ㅡ레드 실행 :" + i);
		}
		System.out.println(name +"작업 스레드 end");
	}
}

public class ThreadTest {public static void main(String[] args) {
	//자식 스레드 객체 생성
	subThread st1 = new subThread("ST1");
	subThread st2 = new subThread("ST2");
	//작업 스레드 실행
	st1.start();
	st2.start();
	for(int i =0; i<10;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main실행 :" + i);
	}
	System.out.println("end");
}

}
