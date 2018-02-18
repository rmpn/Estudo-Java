package thread;

public class ThreadExB {

	public static void main(String[] args) {
		
		ThreadExC threadA = new ThreadExC("threada");
		ThreadExC threadB = new ThreadExC("threadb");
		
		threadA.start();
		threadB.start();
		
		//threadA.sleepTime();
		threadB.sleepTime();
		
		System.out.println(threadA.getNome());
		System.out.println(threadB.getNome());
		
		/*
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
       */
		
	}

}
