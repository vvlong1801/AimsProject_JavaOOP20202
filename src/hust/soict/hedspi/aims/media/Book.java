package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book() {
		super();
	}
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}
	public Book(String title, String category) {
		super(title, category);
	}
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category, ArrayList<String> authors) {
		super(title, category);
		this.authors = authors;
	}
	
	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
}
