package ua.goit.java8.module52.task2.players;

import javafx.scene.layout.Pane;

/**
 * Created by Taras on 03-08-2017.
 */
public class Player {
    private final double price;
    protected Pane root;

    public Player(double price, Pane root){
        this.price = price;
        this.root = root;
    }

    public double getPrice(){
        return price;
    }

    public String playSong(String song){
        return ("Playing: \"" + song + "\"");
    }
}
