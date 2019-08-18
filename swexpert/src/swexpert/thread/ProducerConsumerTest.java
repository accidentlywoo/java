package swexpert.thread;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Producer prod = new Producer(buffer);
		Consumer cons = new Consumer(buffer);
		prod.start();
		cons.start();
	}
}
