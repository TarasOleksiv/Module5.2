package ua.goit.java8.module52.task2;

import java.util.Scanner;

/**
 * Created by t.oleksiv on 01/08/2017.
 */
public class Input {
    // Отримуєм дані з консолі
    private String player;

    public Input(){
        getInput();
    }

    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Який плеєр намалювати?");
        System.out.print("Введіть цифру від 1 до 6 для вибору плеєра: ");;
        player = sc.nextLine();
    }

    public String getPlayer(){
        return player;
    }
}
