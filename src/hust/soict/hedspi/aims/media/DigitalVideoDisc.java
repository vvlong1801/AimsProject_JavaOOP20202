package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	
	public DigitalVideoDisc() {
		super();
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}


	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
//	

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}


	public boolean search(String title) {
		int check = this.getTitle().toLowerCase().indexOf(title.toLowerCase());
		if(check >= 0) return true;
		else return false;
	}
}
