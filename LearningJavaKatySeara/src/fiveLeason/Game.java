package fiveLeason;

import java.util.ArrayList;

public class Game {
    private int attempt = 0;
    private GameHelper helper;
    private ArrayList<DotCom> sites = new ArrayList<>();

    public static void main(String[] args) {
        Game game = new Game();
        game.setSites();
        game.startplaying();
        game.finishGame();
    }

    private void setSites(){
        DotCom vk = new DotCom();
        DotCom ok = new DotCom();
        DotCom mail = new DotCom();

        vk.setName("vk.com");
        ok.setName("ok.ru");
        mail.setName("mail.ru");

        ArrayList<String> locationsVk = new ArrayList<>();
        locationsVk.add("a1");
        locationsVk.add("a2");
        locationsVk.add("a3");
        vk.setLocations(locationsVk);

        ArrayList<String> locationsOk = new ArrayList<>();
        locationsOk.add("c2");
        locationsOk.add("d2");
        locationsOk.add("e2");
        ok.setLocations(locationsOk);


        ArrayList<String> locationsMail = new ArrayList<>();
        locationsMail.add("f6");
        locationsMail.add("f5");
        locationsMail.add("f4");
        mail.setLocations(locationsMail);
        System.out.println(vk);
        this.sites.add(vk);
        this.sites.add(ok);
        this.sites.add(mail);
    }

    private void startplaying(){
        while (!this.sites.isEmpty()){
            String userGuess = this.helper.getUserInputMy("Введите поле ");
            ++this.attempt;
            this.checkuserGuess(userGuess);
        }
    }

    private void checkuserGuess(String guess){
        String result = "miss";
        for(DotCom site: this.sites) {
            String status = site.checkYourself(guess);
            if (status.equals("попал")){
                result = status;
                break;
            }else if(status.equals("потопил")){
                this.sites.remove(site);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        String endMessage;
        if (this.attempt < 12){
            endMessage = "Поздравляю вы молодец";
        }else {
            endMessage = "Поздравляю вы лошара";
        }
        System.out.println(endMessage);
    }
}
