package main;

public class OddPrinter extends Thread{
	private int begin;
	private int end;
	
	OddPrinter(int begin, int end,String name){
		super(name);
		this.begin=begin;
		this.end = end;
		start();
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
