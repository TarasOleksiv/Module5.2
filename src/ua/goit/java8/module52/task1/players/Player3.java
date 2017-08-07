package ua.goit.java8.module52.task1.players;

/**
 * Created by Taras on 03-08-2017.
 */
public class Player3 extends PlayerPlaylist {

    public Player3(double price, String[] playlist) {
        super(price, playlist);
    }

    public void playAllSongs(){
        System.out.println("Playing playlist:");
        for (int i = 0; i < playlist.length; i++){
            playSong(playlist[i],i+1);
        }
    }

    public void playSong(){
        super.playSong(playlist[0], 1);
    }
}
