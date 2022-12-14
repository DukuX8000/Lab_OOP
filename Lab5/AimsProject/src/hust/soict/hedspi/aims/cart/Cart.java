package hust.soict.hedspi.aims.cart;

import java.util.Collections;

import hust.soict.hedspi.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

	public ObservableList<Media> getItemsOrdered(String title) {
		ObservableList<Media> mediaList = FXCollections.observableArrayList();
		if (title == "")
			return itemsOrdered;
		for (Media media : itemsOrdered) {
			if (media.getTitle().toLowerCase().contains(title.toLowerCase())) {
				mediaList.add(media);
			}
		}
		return mediaList;
	}

	public ObservableList<Media> getItemsOrdered(int id) {
		// find by ID
		ObservableList<Media> mediaList = FXCollections.observableArrayList();
		mediaList.add(findMediaById(id));
		return mediaList;
	}

	public void addMedia(Media media) throws Exception {
		if (!itemsOrdered.contains(media)) {
			itemsOrdered.add(media);
			System.out.println("Added successfully");
		} else
			throw new Exception("Your number of medias in cart is full");
	}

	public int countDVDInCast() {
		int cnt = 0;
		for (Media media : itemsOrdered)
			if (media.getCategory().equals("DVD"))
				cnt++;
		return cnt;
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Removed successfully");
		} else
			System.out.println("The media doen't exists");
	}

	public double totalCost() {
		double total = 0;
		for (int i = 0; i < itemsOrdered.size(); i++)
			total += itemsOrdered.get(i).getCost();
		return total;
	}

	public void SearchById(int id) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getId() == id) {
				System.out.println(itemsOrdered.get(i));
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println("This product was not found");

	}

	public void SearchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				System.out.println(itemsOrdered.get(i));
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println("This product was not found");

	}

	// find media by id
	public Media findMediaById(int id) {
		for (Media media : itemsOrdered)
			if (media.getId() == id)
				return media;
		return null;
	}

	// find media by title
	public Media findMediaByTitle(String title) {
		for (Media media : itemsOrdered)
			if (media.getTitle().equals(title))
				return media;
		return null;
	}

	// sort by title
	public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}

	// sort by cost
	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}

	// set null cart
	public void setEmtpyCart() {
		itemsOrdered.removeAll(itemsOrdered);
	}

	@Override
	public String toString() {
		return "Cart [itemsOrdered=" + itemsOrdered + "]";
	}

}
