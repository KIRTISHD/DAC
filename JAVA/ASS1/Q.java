class Q{
	public static void main(String[] ss){
		if (ss.length < 2){
			System.out.println("2 tak ");
		}
		else {
			double firstNumber = Double.parseDouble(ss[0]);
			double secondNumber = Double.parseDouble(ss[1]);
			System.out.println("Average yaroo-"+( (firstNumber+secondNumber) /2) );
		}
	}
}
