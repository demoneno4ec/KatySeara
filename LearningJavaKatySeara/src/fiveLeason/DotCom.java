package fiveLeason;

import java.util.ArrayList;

public class DotCom {
    private String name;
    private ArrayList<String> locations;

    /**
     * Проверяет попадание по сайту
     */
    public String checkYourself(String userGuess) {
        String status = "мимо";

        if (!this.locations.contains(userGuess)) {
            return status;
        }

        this.locations.remove(userGuess);

        if (this.locations.isEmpty()){
            status = "потопил";
        }else{
            status = "попал";
        }

        return status;
    }

    /**
     * Setters
     */
    public void setName(String name) {
        this.name = name;
    }
    public void setLocations(ArrayList<String> locations){
        this.locations = locations;
    }
}
