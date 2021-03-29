package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	public static void main(String[] args) {
		Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
//		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
//		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 18.99f);
//		anOrder.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc[] listDVD = {dvd1, dvd2, dvd3, dvd1, dvd2, dvd3, dvd1, dvd2, dvd3, dvd1, dvd2, dvd3};
		
		anOrder.addDigitalVideoDisc(dvd1,dvd2);
		if(anOrder.getALuckyItem()!=null) System.out.println(anOrder.getALuckyItem().getTitle());
		anOrder.show();

//		anOrder.removeDigitalVideoDisc(dvd3);
//		System.out.println(anOrder.totalCost());
	}
}
