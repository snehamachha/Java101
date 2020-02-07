
class MyThread extends Thread
{
	
	public void run()
	{
		for (int j = 1; j <= 10; j++)
		{
			System.out.println(j);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Error");
			}
		}
		
	}
}
public class SampleProgram {

	public static void main(String args[]) {

	
		MyThread t = new MyThread();
		
		t.start();
	}
}
