package thread;

public class ThreadExA implements Runnable {

	@Override
	public void run() {

	}

	public static void main(String[] args) {
		Thread threadA = new Thread("threada");
		Thread threadB = new Thread("threadb");
		
		threadA.start();
		threadB.start();
		
		try {

			threadA.sleep(1000);
			
			System.out.println(threadA.getName());
			System.out.println(threadB.getName());

		} catch (InterruptedException e) {

			System.out.println("msg: " + e);

		}
		
		threadA.setPriority(1);
		
		System.out.println(threadA.getPriority());
		System.out.println("Executando ...");

	}

}
