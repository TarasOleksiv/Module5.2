package ua.goit.java8.module52.task2.players;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Taras on 04-08-2017.
 */
public class Player6 extends Player3 {
    public Player6(double price, String[] playlist, Pane root) {
        super(price, playlist, root);
    }

    public void shuffle(){
        shuffleArray(playlist);
        //System.out.println("Playing shuffle playlist.");
        super.playAllSongs();
    }

    // Implementing Fisher–Yates shuffle
    void shuffleArray(String[] ar)
    {
        // If running on Java 6 or older, use 'new Random()' on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    // Implementing Fisher–Yates shuffle
    String[] shuffleArrayString(String[] ar)
    {
        // If running on Java 6 or older, use 'new Random()' on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }


    public void show(String song){
        super.show(song);
        Button shuffleSongs = new Button();
        shuffleSongs.setTranslateX(260);
        shuffleSongs.setTranslateY(10);
        shuffleSongs.setText("Play shuffle");
        shuffleSongs.setOnMouseClicked(event -> {
            setSongLabels(shuffleArrayString(playlist));
            lblStatus.setText(playAllSongs());
        });
        root.getChildren().addAll(shuffleSongs);
    }
}
