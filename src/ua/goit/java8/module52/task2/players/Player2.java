package ua.goit.java8.module52.task2.players;

import javafx.scene.layout.Pane;

/**
 * Created by Taras on 03-08-2017.
 */
public class Player2 extends PlayerSong {
    public Player2(double price, String song, Pane root) {
        super(price, song, root);
    }

    @Override
    public String playSong(String song) {
        return ("Playing \"" + song + "\": error.");
    }
}
