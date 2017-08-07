package ua.goit.java8.module52.task1.players;

/**
 * Created by Taras on 03-08-2017.
 */
public class Player4 extends Player3 {

    public Player4(double price, String[] playlist) {
        super(price, playlist);
    }


    public void playSong(){
        super.playSong(playlist[playlist.length - 1], playlist.length);
    }
}
