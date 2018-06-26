package Properties;

public class TextM extends Message implements Likable{

    private String textField;
    private int likes;

    public TextM(Person author, String timeStamp, String textField, int likes) {
        super(author, timeStamp);
        this.textField = textField;
        this.likes = 0;
    }

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    @Override
    public void likeOperation(String name) {
        this.likes += 1;
        System.out.printf("Likes: %d, on %s", getLikes(), getTimeStamp());
    }

    @Override
    public int getLikes() {
        return likes;
    }


    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public void showMSG() {
        //sout
    }
}
