package ua.goit.java8.module52.task1.players;

/**
 * Created by Taras on 03-08-2017.
 */
public class PlayerPlaylist extends Player {
    protected String[] playlist;

    public PlayerPlaylist(double price, String[] playlist) {
        super(price);
        this.playlist = playlist;
    }

    public void playSong(String song, int i){
        System.out.println("Playing : " + i + ". \"" + song + "\"");
    }

}
