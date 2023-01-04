package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(String id, String title, float cost) {
		super(id, title, cost);
	}
	
	public Book(String id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	public Book(String id, String title, String category, float cost, ArrayList<String> authors) {
		super(id, title, category, cost);
		if(authors.size() != 0) {
			this.authors = authors;
		}else {
			System.out.println("Khong co tac gia nao ca!");
		}
	}

    public void addAuthor(String authorName){
        for(int i = 0; i < authors.size(); i++){
            if(authorName.equals(authors.get(i))){
                System.out.println("Ten da ton tai!");
                return;
            }
        }
        authors.add(authorName);
        System.out.println("Tac gia :" +authorName);
    }

    public void removeAuthor(String authorName){
        for(int i = 0; i < authors.size(); i++){
            if(authorName.equals(authors.get(i))){
                authors.remove(authorName);
                return;
            }
        }
        System.out.println("Khong tim thay tac gia!");
    }

}
