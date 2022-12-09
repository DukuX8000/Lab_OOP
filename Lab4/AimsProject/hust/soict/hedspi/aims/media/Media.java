package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class Media {

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    protected String id;
    protected String title;
    protected String category;
    protected float cost;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    protected Media(){
    }

    protected Media(String title){
        this.title = title;
    }

    protected Media(String title, String category){
        this.title = title;
        this.category = category;
    }

    protected Media(String title, String category, float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    protected Media(String id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Media other = (Media) obj;
        if (title != other.title) {
            return false;
        }
        ;
        return true;
    }

    public void printDetail(){
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Cost: " + cost);
        System.out.println("ID: " + id);
    }
    @Override
    public String toString() {
        return "Media [category=" + category + ", cost=" + cost + ", id=" + id + ", title=" + title + "]";
    }
    
}