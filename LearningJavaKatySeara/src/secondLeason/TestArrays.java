package secondLeason;

public class TestArrays {
    public static void main(String[] args) {
        int y = 0;

        String[] islands = new String[4];
        int[] index = new int[4];

        int ref;

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";



        while (y < 4) {
            ref = index[y];
            y = y + 1;
            System.out.print("острова = ");
            System.out.println(islands[ref]);
        }

    }
}