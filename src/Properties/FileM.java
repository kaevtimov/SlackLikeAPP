package Properties;

public class FileM extends Message implements Downloadable{
    private String fileName;

    public FileM(Person author, String timeStamp, String fileName) {
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
    public void downloadOperation() {
        System.out.printf("Message downloaded: %s", getTimeStamp());
    }

    @Override
    public void showMSG() {
        //soutprintf
    }
}
