package ua.goit.java8.module52.task2.players;

import javafx.scene.layout.Pane;

/**
 * Created by Taras on 03-08-2017.
 */
public class Player5 extends Player3 {

    public Player5(double price, String[] playlist, Pane root) {
        super(price, playlist, root);
    }


    public String playAllSongs(){
        String result = "Status:";
        for (int i = playlist.length-1; i >= 0; i--){
            result += "\n" + playSong(playlist[i], i+1) + "; ";
        }
        return result;
    }

}
