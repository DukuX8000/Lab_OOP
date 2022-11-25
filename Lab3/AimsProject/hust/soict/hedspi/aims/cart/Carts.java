package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Carts {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("This order is almost full!");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc " + disc.getTitle() + " has been added.");
        }
    }
    //Overloading by differing types of parameters
    public void addDigitalVideoDisc(DigitalVideoDisc[] discList){
        if(this.qtyOrdered == MAX_NUMBERS_ORDERED || this.qtyOrdered + discList.length > MAX_NUMBERS_ORDERED){
            System.out.println("The order is full.");
        } else{
            for(int i = 0; i< discList.length; i++){
                this.addDigitalVideoDisc(discList[i]);
            }
        }
    }

    //Overloading by differing the number of parameters
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED -1){
            this.itemsOrdered[this.qtyOrdered++] = dvd1;
            this.itemsOrdered[this.qtyOrdered++] = dvd2;
            System.out.printf("The disc %s has been added.\n",dvd1.getTitle());
            System.out.printf("The disc %s has been added.\n",dvd2.getTitle());
        }
        else if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            this.itemsOrdered[this.qtyOrdered++] = dvd1;
            System.out.printf("The disc %s has been added.\n",dvd1.getTitle());
            System.out.printf("The disc %s cannot be added.\n",dvd2.getTitle());
    }
        else System.out.println("The order is almost full.");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int count = 0, index = 0;
        if(this.qtyOrdered == 0){
            System.out.println("Empy! Nothing in your order list.");
        }
        else{
            for(int i = 0; i < this.qtyOrdered; i++){
                if(itemsOrdered[i] == disc){
                    index = i;
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("There isn't any item that you want to delete.");
            } else{
                for(int i = index; i < this.qtyOrdered; i++){
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                qtyOrdered = qtyOrdered-1;
                System.out.println("The disc " + disc.getTitle() + " has been deleted.");
            }
            
        }
    }

    public float totalCost(){
        float total = 0.0f;
        if(this.qtyOrdered == 0){
            System.out.println("Empy! Nothing in your order list.");
        }
        else {
            for(int i = 0; i < this.qtyOrdered; i++){
                total += itemsOrdered[i].getCost();
            }
        }
        return total;
    }
    
    public void printOrdered(){
        if(this.qtyOrdered == 0){
            System.out.println("Empy! Nothing in your order list.");
        }
        else {
            System.out.println("***********************Order***********************");
            for(int i = 0; i < this.qtyOrdered; i++){
                System.out.println("DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " : " + itemsOrdered[i].getCost() + "$");
            }
            System.out.println("Total cost: " + this.totalCost() + "$");
            System.out.println("***************************************************");
        }
    }
}
