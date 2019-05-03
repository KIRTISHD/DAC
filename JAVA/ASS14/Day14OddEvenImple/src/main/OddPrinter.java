package main;

public class OddPrinter implements Runnable{
	private int begin;
	private int end;
	
	OddPrinter(int begin, int end){
		this.begin=begin;
		this.end = end;
	}

	@Override
	public void run() {
		for (int i = begin; i <= end; i++) {
			if (i%2!= 0) {
				System.out.println("Odd-"+i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					System.out.println("Odd Thread err" + e);
				}
			}
			
		}
		
	}

}
