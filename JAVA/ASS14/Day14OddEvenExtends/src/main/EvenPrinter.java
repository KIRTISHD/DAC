package main;

public class EvenPrinter extends Thread{
	private int begin=20;
	private int end=30;
	
	EvenPrinter(int begin, int end,String name){
		super(name);
		this.begin=begin;
		this.end = end;
		start();
	}
	
	EvenPrinter(String name){
		super(name);
		start();
	}

	public EvenPrinter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		
		for (int i = begin; i <= end; i++) {
			if (i%2== 0) {
				System.out.println("Even-"+i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					System.out.println("Even Thread err" + e);
				}
			}
			
		}
		
	}

}
