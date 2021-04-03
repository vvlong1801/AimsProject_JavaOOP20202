package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order;
import java.util.Scanner;

public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Additem to the order");
		System.out.println("3. Delete item byid");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order order = null;
		int choose;
		do {
			choose = sc.nextInt();
			switch(choose) {
			case 1:{
				order = new Order();
				System.out.println("Create Order is successfull!!");
			} break;
			case 2:{
				
			} break;
			case 3:{
				
			} break;
			case 4: {
				if(order == null) System.out.println("You didn't created an order, CREATE now!");
				else order.show();
			} break;
			case 0: System.exit(0);
			}
		}while(choose!=0);

		
	}
}
