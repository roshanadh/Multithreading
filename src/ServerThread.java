public class ServerThread implements Runnable {

	private Thread thread;
	private String threadName;
	private int index;

	public ServerThread(Thread thread, String threadName, int index) {
		this.thread = thread;
		this.threadName = threadName;
		this.index = index;
	}

	@Override
	public void run() {
		try {
			for (int i = index; i < index + 5; Thread.sleep(5000), i++) {
				System.out.println("Running: " + threadName + ", i = " + i);
			}
		}
		catch (InterruptedException e){
			System.out.println("Interrupted Exception occurred!");
		}
		System.out.println("Exiting: " + threadName);
	}

	public void start() {
		thread = new Thread(this, threadName);
		System.out.println("Starting: " + threadName);
		thread.start();
	}
}
