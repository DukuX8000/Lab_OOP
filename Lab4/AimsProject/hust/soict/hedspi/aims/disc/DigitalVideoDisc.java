package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Playable;
import hust.soict.hedspi.aims.media.Disc;

public class DigitalVideoDisc extends Disc  implements Playable {
    private String director;
    private int length;
    
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

    public DigitalVideoDisc(String title) {
        super(title);
    }
    
    public DigitalVideoDisc(String id, String title, float cost) {
		super(id, title, cost);
	}
	
	public DigitalVideoDisc(String id, String title, int length, float cost) {
		super(id, title, cost);
		this.length = length;
	}

    public DigitalVideoDisc(String id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
	
	public DigitalVideoDisc(String id, String title, String category, int length, float cost ) {
		super(id, title, category, cost);
		this.length = length;
	}
	
	public DigitalVideoDisc(String id, String title, String category, int length, String director, float cost) {
		this(id, title, category, length, cost);
		this.director = director;
	}
    
    public boolean Search(String string){
        String title = this.getTitle();
        int count = 0;

        String sTitle[] = title.split(" ");
        String getTitle[] = string.split(" ");
        for(int i = 0;  i < getTitle.length; i++){
            for(int j = 0; j < sTitle.length; j++){
                if(sTitle[j].equalsIgnoreCase(getTitle[i])){
                    count++;
                }
            }
        }
        if(count == sTitle.length)
            return true;
        return false;
    }

    public String toString() {
		return "Title: " + this.title + "\nCategory: " + this.category + "\nDirector: " + this.director + "\nLength: "
				+ this.length + "\nCost: " + this.cost;
	}


    @Override
    public void play() {
        System.out.println("Playing DigitalVideoDisc: " + this.getTitle());
        System.out.println("DigitalVideoDisc length:  " + this.getLength());
    }

}