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

    public void postTextM(String author, String timeStamp, String textField){
        TextM tm = new TextM(author, timeStamp, textField);
        messageHistory.add(tm);
        likables.add(tm);
    }
     public void postIconM(String author, String timeStamp, IconType icon){
        IconM im = new IconM(author, timeStamp, icon);
        messageHistory.add(im);
     }

    public void postImageM(String author, String timeStamp, String nameImage){
        ImageM imessage = new ImageM(author, timeStamp, nameImage);
        messageHistory.add(imessage);
        likables.add(imessage);
        downloadables.add(imessage);
    }

    public void postFileM(String author, String timeStamp, String fileName){
        FileM fm = new FileM(author, timeStamp, fileName);
        messageHistory.add(fm);
        downloadables.add(fm);
    }

    public void listHistory(){
        for (Message m:messageHistory) {
            m.showMSG();
        }
    }

    public void clearHistory(){
        messageHistory.clear();
        likables.clear();
        downloadables.clear();
    }

    public void likeMessage(String timeStamp, String user){
        for (Likable m:likables) {
            if(((Message)m).getTimeStamp().equals(timeStamp)){
                m.likeOperation(user);
            }
        }
    }

    public void downloadMessage(String timeStamp, String directory){
        for (Downloadable d:downloadables){
            if(((Message)d).getTimeStamp().equals(timeStamp)){
                d.downloadOperation(directory);
            }
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
