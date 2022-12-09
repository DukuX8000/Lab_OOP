package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;


public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
   public int getLength(ArrayList<Track> tracks){
       int sumLength = 0;
       for(int i = 0; i < tracks.size(); i++){
           sumLength += tracks.get(i).getLength();
       }
       super.length = sumLength;
       return super.length;
   }

    public void addTrack(Track track) {
        for(int i = 0; i < tracks.size(); i++)
            if(tracks.get(i).equals(track)) {
                System.out.println("Duplicated track.");
                return;
            }
        
        tracks.add(track);
        System.out.println("Add track successful.");
    }
    
    public void removeTrack(Track track) {
        for(int i = 0; i < tracks.size(); i++)
            if(tracks.get(i).equals(track)) {
                tracks.remove(track);
                System.out.println("Remove track successful.");
                return;
            }
        
        System.out.println("Track does not exist.");       
    }

    public CompactDisc(String artist) {
    this.artist = artist;
    }

    public CompactDisc(String artist, String title) {
    super(title);
    this.artist = artist;
    }

    public CompactDisc(String artist, String title, String category) {
    super(title, category);
    this.artist = artist;
    }

    public CompactDisc(String artist, String title, String category, float cost) {
    super(title, category, cost);
    this.artist = artist;
    }

@Override
public void play() {
    System.out.println("Tile: " + this.getTitle());
    System.out.println("Category: " + this.getCategory());
    System.out.println("Cost: " + this.getCost());
    System.out.println("Director: " + this.getDirector());
    System.out.println("Artist: " + this.getArtist());
    for(int i = 0; i < tracks.size(); i++){
        tracks.get(i).play();
    }
}
}
