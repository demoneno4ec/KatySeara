package fiveLeason;

import java.io.*;
import java.util.Scanner;

public class GameHelper {
    private Scanner scanner;

    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }

    public String getUserInput(String promt) {
        String inputLine = null;
        System.out.print(promt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0){
                return "";
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine;
    }

    public String getUserInputMy(String promt) {
        System.out.print("Введите число ");

        return this.scanner.nextLine();
    }
}
