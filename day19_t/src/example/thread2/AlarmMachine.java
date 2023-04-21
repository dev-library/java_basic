package example.thread2;

public class AlarmMachine implements Runnable {

	@Override
	public void run() {
		try {
			for(int i = 0; i < 1000; i++) {
				System.out.println("경고음 삑삑");
				Thread.sleep(2000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
