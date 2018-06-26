package Properties;


import java.util.ArrayList;

public class Channel {
    private String name;
    private ArrayList<Message> messageHistory;
    private ArrayList<Likable> likables;
    private ArrayList<Downloadable> downloadables;

    public Channel(){

    }

    public Channel(String name){
        this.name = name;
        messageHistory = new ArrayList<>();
        likables = new ArrayList<>();
        downloadables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Message> getMessageHistory() {
        return messageHistory;
    }

    public void setMessageHistory(ArrayList<Message> messageHistory) {
        this.messageHistory = messageHistory;
    }

    //public void postTextM
    //public void postIconM
    //public void postImageM
    //public void postFileM
    //messageHistory.add() likable.add() downloadable.add()
    //public void list1History
    //public void clearHistory
    //public void like
    //public void download

    @Override
    public String toString() {
        return this.name;
    }
}
