package Properties;

public class TextM extends Message implements Likable{

    private String textField;
    private int likes;

    public TextM(String author, String timeStamp, String textField) {
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
        likes++;
        System.out.printf("%s liked: %s, [%s]\n", name, textField, getTimeStamp());
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
        System.out.printf("[%s] (%s) Text Message: %s, (%d likes)\n", getTimeStamp(), getAuthor(), getTextField(), getLikes());
    }
}
