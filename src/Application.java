import Properties.IconType;
import Properties.SlackWorkDirectory;

public class Application {
    public static void main(String[] args){


        SlackWorkDirectory slackApp = new SlackWorkDirectory();

        slackApp.createNewChannel("work");

        slackApp.getCurrent().postTextM("Gosho", "14:48", "Hello");
        slackApp.getCurrent().likeMessage("14:48", "Pepi");

        slackApp.getCurrent().postIconM("Geri", "15:56", IconType.HAPPY);
        slackApp.getCurrent().likeMessage("15:56", "Kiro");

        slackApp.getCurrent().postImageM("Stefan", "16:23", "Sea");
        slackApp.getCurrent().downloadMessage("16:23", "C:Users/me");
        slackApp.getCurrent().listHistory();
        slackApp.getCurrent().listHistory();

    }
}
