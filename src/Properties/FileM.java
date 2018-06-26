package Properties;

public class FileM extends Message implements Downloadable{
    private String fileName;

    public FileM(String author, String timeStamp, String fileName) {
        super(author, timeStamp);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void downloadOperation(String target) {
        System.out.printf("Message downloaded: %s, in %s\n", getTimeStamp(), target);
    }

    @Override
    public void showMSG() {
        System.out.printf("[%s] (%s) File Delivery: %s, (%d likes)\n", getTimeStamp(), getAuthor(), getFileName());
    }
}
