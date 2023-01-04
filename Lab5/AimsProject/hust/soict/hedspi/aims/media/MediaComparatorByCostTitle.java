package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    public int compare(Media o1, Media o2) {
        if (o1.getCost() == o2.getCost()) {
            return o1.getTitle().compareTo(o2.getTitle());
        } else {
            return Float.compare(o2.getCost(), o1.getCost());
        }
    }
}