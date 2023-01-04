package hust.soict.hedspi.test.store;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        Media media = new Media();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        //store.addDVD(dvd1);
        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        //store.addDVD(dvd2);
        store.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia(dvd3);
        //store.addDVD(dvd1);
        //store.addDVD(dvd2);
        //store.addDVD(dvd3);
        //store.removeDVD(dvd1);
        // store.removeDVD(dvd2);
        // store.removeDVD(dvd3);
    }
}
