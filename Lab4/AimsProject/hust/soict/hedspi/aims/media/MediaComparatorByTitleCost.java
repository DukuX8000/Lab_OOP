package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    public int compare(Media o1, Media o2) {
        if (o1.getTitle().equals(o2.getTitle())) {
            return Float.compare(o2.getCost(), o1.getCost());
        } else {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}
