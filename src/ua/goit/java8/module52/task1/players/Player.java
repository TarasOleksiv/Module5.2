package ua.goit.java8.module52.task1.players;

/**
 * Created by Taras on 03-08-2017.
 */
public class Player {
    private final double price;

    public Player(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void playSong(String song){
        System.out.println("Playing: \"" + song + "\"");
    }
}
