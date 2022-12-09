package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.cart.Carts;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.media.*;


public class Aims {

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");       
        System.out.println("1. View store");   
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");       
        System.out.println("--------------------------------");     
        System.out.println("1. See a media’s details");       
        System.out.println("2. Add a media to cart");    
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        }

        public static void mediaDetailsMenu() {

        System.out.println("Options: ");  
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");   
        System.out.println("2. Play");
        System.out.println("0. Back");  
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2"); 
        }

        public static void cartMenu() {
        System.out.println("Options: ");  
        System.out.println("--------------------------------"); 
        System.out.println("1. Filter medias in cart");    
        System.out.println("2. Sort medias in cart");    
        System.out.println("3. Remove media from cart");        
        System.out.println("4. Play a media");          
        System.out.println("5. Place order");           
        System.out.println("0. Back");     
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3-4-5"); 
        }
        
    public static void main(String[] args) { 


        Scanner keyboard = new Scanner(System.in);
        int option = 5;

        Carts anOrder = new Carts();
        Store Store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);
        Store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);
        Store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd3);
        Store.addMedia(dvd3);

        Book book1 = new Book("The Lord of the Rings", "Fantasy", 23.0f);
        Store.addMedia(book1);

        CompactDisc cd1 = new CompactDisc("The Best of me", "Pop", "Trinh Thang Binh", 14.99f);
        Store.addMedia(cd1);

        do {
            showMenu();
            option = keyboard.nextInt();
            keyboard.nextLine();

            switch (option) {
                case 1:
                    storeMenu();
                    int option1 = 5;
                    do {
                        option1 = keyboard.nextInt();
                        keyboard.nextLine();
                        switch (option1) {
                            case 1:
                            System.out.println("Enter the title of the media: ");
                            String title = keyboard.nextLine();
                            Media media= Store.searchMedia(title);
                            if (media != null){
                            media.printDetail();
                                mediaDetailsMenu();
                                int option2 = 5;
                                do {
                                    option2 = keyboard.nextInt();
                                    keyboard.nextLine();
                                    switch (option2) {
                                        case 1:
                                            anOrder.addMedia(media);
                                            break;
                                        case 2:
                                            if (media instanceof Playable){
                                            ((Playable) media).play();
                                            }
                                            else{
                                            System.out.println("This media is not playable!");
                                            }
                                            break;
                                        case 0:
                                            System.out.println("Back to store menu");
                                            break;
                                        default:
                                            System.out.println("Please choose a number: 0-1-2");
                                            break;
                                    }
                                }
                             } else {
                                    System.out.println("Media not found!");
                                }
                            break;
                            case 2:
                                System.out.println(" ");
                               
                                
                                break;
                            case 3:
                                System.out.println(" ");
                           
                                
                                break;
                            case 4:
                                cartMenu();
                                int option3 = 6;
                                do {
                                    option3 = keyboard.nextInt();
                                    keyboard.nextLine();
                                    switch (option3) {
                                        case 1:
                                            System.out.println(" ");
                                            
                                          
                                            break;
                                        case 2:
                                            System.out.println(" ");
                                            
                                          
                                            break;
                                        case 3:
                                            System.out.println("Please enter the ID of the item you want to remove: ");
                                            String Searchid2 = keyboard.next();
                                            anOrder.removeMedia(Searchid2);
                                            break;
                                        case 4:
                                            System.out.println(" ");
                                            
                                            break;
                                        case 5:
                                            
                                            break;
                                        case 0:
                                            System.out.println("Back to store menu");
                                            break;
                                        default:
                                            System.out.println("Please choose a number: 0-1-2-3-4-5");
                                            break;
                                    }
                                }
                               
                            
                        break;
                        case 0:
                            System.out.println("Back to main menu");
                            break;
                            }
                }
                break;
                case 2:
                    System.out.println("Please enter the ID of the item you want to remove: ");
                    String Searchid = keyboard.next();
                    Store.removeMedia(Searchid);
                    break;
                case 3:
                    cartMenu();
                    break;
                
                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Please choose a number: 0-1-2-3");
                    break;
    }

} while (option != 0);
}
}

