package sub4;
// 스레드 제어
class WorkObject{
	public synchronized void method1() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+ " - Method1 실행");
		// 다른 스레드를 실행 상태로 전환
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void method2() {
		synchronized(this) {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName()+ " - Method2 실행");
			// 다른 스레드를 실행 상태로 전환
			notify();
			// 자신은 일시정지 상태로 전환
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class ThreadA extends Thread{
	private WorkObject work;
	public ThreadA(WorkObject work) {
		this.work = work;
		setName("ThreadA");	//부모클래스 메소드를 스레드 이름 초기화
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for( int i= 0 ; i< 10; i++) {
			work.method1();
		}
	}
}
class ThreadB extends Thread{
	private WorkObject work;
	public ThreadB(WorkObject work) {
		this.work = work;
		setName("ThreadB");	//부모클래스 메소드를 스레드 이름 초기화
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for( int i= 0 ; i< 10; i++) {
			work.method2();
		}
	}
}
public class ThreadNotifyTest {public static void main(String[] args) throws InterruptedException {
	WorkObject work = new WorkObject();
	ThreadA thA = new ThreadA(work);
	ThreadB thB = new ThreadB(work);
	thA.start();
	thB.start();
	thA.join();
	thB.join();
	System.out.println("end");
	}
}