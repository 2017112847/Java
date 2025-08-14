package sub3;

public class ThreadSyncTest {public static void main(String[] args) throws InterruptedException {
	Count count = new Count();
	CountThread c1 = new CountThread(count);
	CountThread c2 = new CountThread(count);
	CountThread c3 = new CountThread(count);
	c1.start();
	c2.start();
	c3.start();
	c1.join();
	c2.join();
	c3.join();
	System.out.println(count.getNum());
}
}