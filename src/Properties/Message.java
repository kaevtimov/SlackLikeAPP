package Properties;

public abstract class Message {
    private String author;
    private String timeStamp;

    public Message(String author, String timeStamp) {
        this.author = author;
        this.timeStamp = timeStamp;

    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void showMSG();

    @Override
    public String toString(){
        return String.format("[%s](%s)", timeStamp, author);
    }
}
