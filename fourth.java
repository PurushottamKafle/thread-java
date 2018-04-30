package pksoft;
import java.util.Random;

public class fourth implements Runnable {

 int time;
Random r = new Random();

String name;

	public fourth(String x) {
		time = r.nextInt(999);
		name = x;
	}
	
public void run() {
	try {
		System.out.printf("%s us sleeping for %d\n", name, time);
		Thread.sleep(time);
		System.out.printf("%s is done\n", name);
		
	}catch(Exception e) {
		
	}
}
}
