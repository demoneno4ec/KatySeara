package fiveLeason;

import java.util.Random;
import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {
        int attempt = 0;
        SimpleDotCom site = new SimpleDotCom();


        int firstPosition = new Random().nextInt(4);
        //int firstPosition = (int) (Math.random() * 5);

        int[] siteLocations = new int[3];
        for (int i = siteLocations.length; i > 0; --i) {
            int arrIndex = i - 1;
            siteLocations[arrIndex] = firstPosition + arrIndex;
        }

        site.setLocationCells(siteLocations);

        GameHelper helper = new GameHelper();
        helper.setScanner(new Scanner(System.in));

        String status;
        String userGuess;
        boolean inGame = true;

        while (inGame){
            // userGuess = helper.getUserInput("Введите число ");
            userGuess = helper.getUserInputMy("Введите число ");
            status  = site.checkYourself(userGuess);
            System.out.println(status);
            ++attempt;
            inGame = !status.equals("потопил");
        }

        System.out.println("Вам потребовалось " + attempt + " попыток (и)");
    }
}
