package thread;

public class ThreadExC implements Runnable {

	Thread thread;

	private String threadname;

	public ThreadExC(String threadname) {
		super();
		this.threadname = threadname;
	}

	@Override
	public void run() {

		System.out.println(this.threadname + " excutando ... ");

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			System.out.println(this.threadname);
			try {

				Thread.sleep(5000);

			} catch (InterruptedException e) {

				System.out.println(this.threadname + " foi interrompida ...");

			}
		}

	}

	public void start() {

		System.out.println(this.threadname + " iniciou ...");
		if (thread == null) {

			this.thread = new Thread(this, this.threadname);
			this.thread.start();

		}
	}

	public String getNome() {
		return (this.thread.getName());
	}

	public void sleepTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}
}
