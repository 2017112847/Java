package sub5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//스레드풀
class Task implements Runnable{
	private String job;
	public Task(String job) {
		this.job = job;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" - "+ this.job);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}
}
public class ThreadpoolTest {public static void main(String[] args) {
	//스레드풀 생성
	ExecutorService ex = Executors.newFixedThreadPool(2);	// 고정된 스레드 갯수로 생성
	// 작업 제ㅜㄹ(요청)
	for(int i=1; i< 10 ;i ++) {
		ex.execute(new Task("Task - " + i));
	}
	// 모든 작업이 끝난 후 스레드를 종료
	ex.shutdown();
	System.out.println("end");
}

}
