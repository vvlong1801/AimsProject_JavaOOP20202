package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;;

public class DiskTest {
	public static void main(String[] args) {
		DigitalVideoDisc disc = new DigitalVideoDisc("Harry potter");
		System.out.println(disc.search("Pot"));
	}
}
