import Properties.Channel;
import Properties.Person;
import Properties.SlackWorkDirectory;

public class Application {
    public static void main(String[] args){

        Person person1 = new Person();
        SlackWorkDirectory slackApp = new SlackWorkDirectory();

        slackApp.createNewChannel("work");
        slackApp.createNewChannel("family");
        slackApp.createNewChannel("spam");
        System.out.println(slackApp.getCurrent());
        slackApp.switchChannel("work");
        System.out.println(slackApp.getCurrent());
        //slackApp.getCurrent().postTextM();


    }
}
