package ua.goit.java8.module52.task1.players;

/**
 * Created by Taras on 03-08-2017.
 */
public class Player2 extends PlayerSong {
    public Player2(double price, String song) {
        super(price, song);
    }

    @Override
    public void playSong(String song) {
        System.out.println("Playing \"" + song + "\": error.");
    }
}
