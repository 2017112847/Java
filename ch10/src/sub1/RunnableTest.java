package sub1;
class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10 ; i++) {
			System.out.println("task 실행");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class RunnableTest {public static void main(String[] args) {
	Task t1 = new Task();
	Task t2 = new Task();
	Thread tr1 = new Thread(t1);
	Thread tr2 = new Thread(t2);
	tr1.start();
	tr2.start();
	System.out.println("end");
}
	
}
