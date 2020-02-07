class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("error");
			}
		}

	}
}

public class RunnableEx {
	public static void main(String[] args)
	{
		Runnable obj=()->{
			for(int i=0;i<10;i++) {
		
			System.out.println(i);
			try{
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println("error");
			}
			}};
		Thread t=new Thread(obj);
		t.start();
		
		
	}

}
