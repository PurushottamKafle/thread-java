package pksoft;

public class five {
public static void main(String[] args) {
	Thread thread = new Thread(new fourth("one"));
	Thread thread1 = new Thread(new fourth("two"));
	Thread thread2 = new Thread(new fourth("three"));
	Thread thread3 = new Thread(new fourth("fourth"));
	thread.start();
	thread1.start();
	thread2.start();
	thread3.start();


}
}
