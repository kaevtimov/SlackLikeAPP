package Properties;

public class ImageM extends Message implements Likable, Downloadable{

    private String nameImage;
    private int likes;


    public ImageM(String author, String timeStamp, String nameImage) {
        super(author, timeStamp);
        this.nameImage = nameImage;
        this.likes = 0;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    @Override
    public void likeOperation(String name) {
        likes++;
        System.out.printf("%s liked: %s(%d likes), on %s\n", name, nameImage,getLikes(), getTimeStamp());
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public void downloadOperation(String target) {
        System.out.printf("Message downloaded: %s, in %s\n", getTimeStamp(), target);
    }

    @Override
    public void showMSG() {
        System.out.printf("[%s] (%s) Image Message: %s, (%d likes)\n", getTimeStamp(), getAuthor(), getNameImage(), getLikes());
    }
}
