package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;;

public class Store {
    public static final int MAX_NUMBERS_ORDERED = 20;
    public static final int MAX_LIMITED_ORDERED = 5;
    public static final int nbOrder = 0;
    public ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public ArrayList<Media> itemsInStore = new ArrayList<Media>();
    private int qtyOrdered = 0;
    private static int nbOrders = 0;

    public Store() {
        if (Store.nbOrders == MAX_NUMBERS_ORDERED) {
            System.out.println("Max of orders");
        } else {
            this.qtyOrdered = 0;
            Store.nbOrders++;
        }
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrder(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void print() {
        System.out.println("*************************Order*************************");
        System.out.println("Ordered Items:");
        int i = 1;
        System.out.printf("%-3s | %-6s | %-20s | %-15s |  %-5s ", "STT", "ID", "Title", "Category", "Total");
        System.out.println();
        for (Media media : itemsOrdered) {
            System.out.printf("%-3s | %-6s | %-20s | %-15s | %.2f$\n", i, media.getId(), media.getTitle(),
                    media.getCategory(), media.getCost());
            i++;
        }
        System.out.println("*******************************************************");
    }

    public void addMedia(Media media) {
        if (this.itemsOrdered.contains(media)) {
            System.err.println("ERR: The media with title: " + media.getTitle() + " is existed!");
        } else {
            this.itemsOrdered.add(media);
            System.out.println("MSG: The media with title: " + media.getTitle() + " has been added.");
        }
    }

    public void addMedia(Media[] mediaList) {
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED || this.qtyOrdered + mediaList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The order is full.");
        } else {
            for (int i = 0; i < mediaList.length; i++) {
                this.addMedia(mediaList[i]);
            }
        }
    }

    public void search(String id){
        for (Media media : itemsOrdered) {
            if (media.getId().equalsIgnoreCase(id)) {
                System.out.println("Media with ID: " + id + " is founded!");
                System.out.println(media.toString());
                break;
            }
        }
    }

    public Media searchMediaByID(String id)
    {
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered.get(i).getId().contains(id)){
                return itemsOrdered.get(i);
            }
        }
        return null;
    }

    public Media searchMedia(String title)
    {
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered.get(i).getTitle().contains(title)){
                return itemsOrdered.get(i);
            }
        }
        return null;
    }

    public void addMedia(Media media1, Media media2) {
        this.addMedia(media1);
        this.addMedia(media1);
    }

    public boolean removeMedia(String id) {
        boolean tmp = false;
        for (Media media : itemsOrdered) {
            if (media.getId().equalsIgnoreCase(id)) {
                this.removeMedia(media);
                tmp = true;
                break;
            }
        }
        if (tmp == false) {
            System.err.println("ERR: Id isn't founded!");
        }
        return tmp;
    }

    public void removeMedia(Media item) {
        if (itemsOrdered.contains(item)) {
            System.out.println("MSG: Media with ID: " + item.getId() + " has been deleted!");
            itemsOrdered.remove(item);
        } else {
            System.err.println("ERR: The media may not exist!");
        }
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(ArrayList<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }

    

}
