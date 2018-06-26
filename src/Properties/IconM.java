package Properties;

import javax.swing.*;

public class IconM extends Message {
    private Icon icon;

    public IconM(Person author, String timeStamp, Icon icon) {
        super(author, timeStamp);
        this.icon = icon;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public void showMSG() {
        //sout
    }
}
