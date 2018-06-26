package Properties;

public class ImageM extends Message implements Likable, Downloadable{

    private String nameImage;
    private int likes;


    public ImageM(Person author, String timeStamp, String nameImage, int likes) {
        super(author, timeStamp);
        this.nameImage = nameImage;
        this.likes = likes;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    @Override
    public void likeOperation(String name) {
        this.likes += 1;
        System.out.printf("Likes: %d, on %s", getLikes(), getTimeStamp());
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public void downloadOperation() {
        System.out.printf("Message downloaded: %s", getTimeStamp());
    }

    @Override
    public void showMSG() {
        //sout
    }
}
