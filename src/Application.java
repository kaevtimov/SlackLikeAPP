import Properties.SlackWorkDirectory;

public class Application {
    public static void main(String[] args){


        SlackWorkDirectory slackApp = new SlackWorkDirectory();

        slackApp.createNewChannel("work");

        slackApp.getCurrent().postTextM("Gosho", "14:48", "Hello");
        slackApp.getCurrent().likeMessage("14:48", "Pepi");
        slackApp.getCurrent().listHistory();

    }
}
