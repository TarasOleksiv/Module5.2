package ua.goit.java8.module52.task1.players;

/**
 * Created by Taras on 03-08-2017.
 */
public class Player5 extends Player3 {

    public Player5(double price, String[] playlist) {
        super(price, playlist);
    }


    public void playAllSongs(){
        System.out.println("Playing playlist:");
        for (int i = playlist.length-1; i >= 0; i--){
            playSong(playlist[i], i+1);
        }
    }

}
