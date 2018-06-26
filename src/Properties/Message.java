package Properties;

public abstract class Message {
    private Person author;      //String
    private String timeStamp;

    public Message(Person author, String timeStamp) {
        this.author = author;
        this.timeStamp = timeStamp;

    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public abstract void showMSG();

//    @Override
//    public String to
}
