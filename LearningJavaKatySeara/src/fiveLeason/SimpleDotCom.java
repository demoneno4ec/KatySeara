package fiveLeason;

public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits;

    public String checkYourself(String userGuess) {
        int quess = Integer.parseInt(userGuess);

        String status = "мимо";
        for (int cell : locationCells) {

            if (cell == quess) {
                status = "попал";
                ++numOfHits;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            status = "потопил";
        }

        return status;
    }

    public void setLocationCells(int[] loc) {
        locationCells = loc;
    }
}
