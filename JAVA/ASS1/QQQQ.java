import java.util.*;

class QQQQ{
		
	public static int total;
	
	private static int calcTotal(int x, int y){
		return x*y;
	}
	
	public static void displayBill(){
		System.out.println("-------------------------------------");
		System.out.println("Total Bill now - "+ total);
		System.out.println("-------------------------------------");
		System.out.println("");
	}
	
	public static void main(String[] ss){
		Scanner sc = new Scanner(System.in);
		int choice;
		int price,quantity;
		boolean loop=true;
		while (loop){
			System.out.println("Aaj ka menu-");
			System.out.println("1. Plain Dosa");
			System.out.println("2. Set Dosa");
			System.out.println("3. Mysore Dosa");
			System.out.println("4. Cheese Dosa");
			System.out.println("5. Moong Dosa");
			System.out.println("6. Adai Dosa");
			System.out.println("7. Neer Dosa");
			System.out.println("8. Rava Dosa");
			System.out.println("9. Rava Masala Dosa");
			System.out.println("10. Thanda Rava Masala Dosa");
			System.out.println("11. Generate Bill");
			System.out.println("12. Clear Bill");
			System.out.println("13. Timepass option");
			switch(sc.nextInt()){
				case 1:
						price=50;
						quantity=0;
						System.out.printf("Price for Plain Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = total + calcTotal(price,quantity);
						displayBill();
						break;
				case 2:
						price=55;
						quantity=0;
						System.out.printf("Price for Set Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = total + calcTotal(price,quantity);
						displayBill();
						break;
				case 3:
						price=60;
						quantity=0;
						System.out.printf("Price for Mysore Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = total + calcTotal(price,quantity);
						displayBill();
						break;
				case 4:
						price=90;
						quantity=0;
						System.out.printf("Price for Cheese Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = total + calcTotal(price,quantity);
						displayBill();
						break;
				case 5:
						price=60;
						quantity=0;
						System.out.printf("Price for Moong Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = total + calcTotal(price,quantity);
						displayBill();
						break;
				case 6:
						price=61;
						quantity=0;
						System.out.printf("Price for Adai Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = total + calcTotal(price,quantity);
						displayBill();
						break;
				case 7:
						price=62;
						quantity=0;
						System.out.printf("Price for Neer Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = total + calcTotal(price,quantity);
						displayBill();
						break;
				case 8:
						price=64;
						quantity=0;
						System.out.printf("Price for Rawa Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = total + calcTotal(price,quantity);
						displayBill();
						break;
				case 9:
						price=65;
						quantity=0;
						System.out.printf("Price for Rawa Masala Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = calcTotal(price,quantity);
						displayBill();
						break;
				case 10:
						price=100;
						quantity=0;
						System.out.printf("Price for Thanda Rawa Masala Dosa is %d%n",price);
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						total = total + calcTotal(price,quantity);
						displayBill();
						break;
				case 11:
						loop=false;
						break;
				case 12:
						total = 0;
						displayBill();
						break;
				case 13:
						System.out.println("Kam Dhandhe nasnar tar DS shika");
						break;
				default:
						System.out.println("Chasma lav ma tak input");
						break;
						
			}
		}
		char xx;
		String coupon,str="Farah hai";
		System.out.println("Coupon aahe ka- y for yes/n for no");
		xx=sc.next().charAt(0);
		sc.nextLine();
		if (xx == 'y' || xx == 'Y'){
			System.out.println("Coupon tak-");
			coupon=sc.nextLine();
			if (coupon.equalsIgnoreCase(str)){
				System.out.println("Total Bill now - 0");
				System.out.println("Yaaro ke liye sab maaf");
			}
			else {
				System.out.println("Coupon chukla, aata order dya parat");
			}
		}
		else if (xx == 'n' || xx == 'N'){
			displayBill();
		}
		else {
			System.out.println("Rahude baba, parat de order");
		}
	}

}
