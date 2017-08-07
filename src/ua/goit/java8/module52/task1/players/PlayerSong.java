package ua.goit.java8.module52.task1.players;

/**
 * Created by Taras on 03-08-2017.
 */
public class PlayerSong extends Player {
    private String song;

    public PlayerSong(double price, String song){
        super(price);
        this.song = song;
    }


    public String getSong(){
        return song;
    }
}
