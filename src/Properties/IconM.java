package Properties;

public class IconM extends Message {
    private IconType icon;

    public IconM(String author, String timeStamp, IconType icon) {
        super(author, timeStamp);
        this.icon = icon;
    }

    public IconType getIcon() {
        return icon;
    }

    public void setIcon(IconType icon) {
        this.icon = icon;
    }

    @Override
    public void showMSG() {
        System.out.printf("[%s] (%s) Emoticon Message: %s, (%d likes)\n", getTimeStamp(), getAuthor(), getIcon());
    }
}
