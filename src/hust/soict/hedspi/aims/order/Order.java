package hust.soict.hedspi.aims.order;
import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMIT_ORDERS =5;
	private static int nbOrders =0;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private MyDate dateOrdered = new MyDate();
	
	//getter, setter & constructor==============
	public Order() {
		super();
		if(nbOrders > MAX_LIMIT_ORDERS) System.out.println("You have " + MAX_LIMIT_ORDERS + "orders, so can't order now!");
		else setNbOrders(getNbOrders()+1);
	}
	
	public static int getNbOrders() {
		return nbOrders;
	}

	public static void setNbOrders(int nbOrders) {
		Order.nbOrders = nbOrders;
	}

	public MyDate getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	//method========================
	public void addMedia (Media media) {
		if(this.itemsOrdered.size()>=MAX_NUMBERS_ORDERED) {
			System.out.println("The order is full!! Can't add " + media.getTitle());
			return;
		}
		else this.itemsOrdered.add(media);
	}
	
	public void addMedia (Media[] medias) {
		for(Media m : medias) {
			this.addMedia(m);
		}
	}
	
	public void removeMedia (Media media) {
		for(int i=0; i < this.itemsOrdered.size(); i++) {
			if(this.itemsOrdered.indexOf(media) == i) {
				this.itemsOrdered.remove(i);
				System.out.println("Remove " + media.getTitle() + " is successfull!!");
				return;
			}
		}
	}

	
	public float totalCost() {
		float total=0;
		for(int i=0; i<this.itemsOrdered.size(); i++) {
			if(i!=this.getALuckyItem()) total += this.itemsOrdered.get(i).getCost();
		}
		return total;
	}
	
	public void show() {
		System.out.println("**********************Order**********************");
		System.out.println(this.dateOrdered);
		for(Media m : this.itemsOrdered) {
			System.out.println(m);
		}
		System.out.println("\nTotal cost: "+this.totalCost() + '$');
		System.out.println("*************************************************");
	}
	
	public int getALuckyItem() {
		int luckyNum = (int)(Math.random()*10);
		for(int i=0; i < this.itemsOrdered.size(); i++) {
			if(i==luckyNum) return i;
		}
		return -1;
	}
}