package ua.goit.java8.module52.task2.players;

import javafx.scene.layout.Pane;

/**
 * Created by Taras on 03-08-2017.
 */
public class Player3 extends PlayerPlaylist {

    public Player3(double price, String[] playlist, Pane root) {
        super(price, playlist, root);
    }

    public String playSong(){
        return super.playSong(playlist[0], 1);
    }
}
