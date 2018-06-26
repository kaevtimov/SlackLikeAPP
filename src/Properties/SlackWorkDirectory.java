package Properties;

import java.util.ArrayList;

public class SlackWorkDirectory {

    private Channel current;
    private ArrayList<Channel> channels;


    public SlackWorkDirectory(){
        channels = new ArrayList<>();
//        setCurrent(current);
//        channels.add(current);
//        setChannels(channels);
    }




    public void setChannels(ArrayList<Channel> channels) {
        this.channels = channels;
    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }


    public Channel getCurrent() {
        return current;
    }

    public void setCurrent(Channel current) {
        this.current = current;
    }

    public void createNewChannel(String name){
        Channel c = new Channel(name);
        this.channels.add(c);
        current = c;
    }

    public void switchChannel(String name){
        for (Channel channel:channels) {
            if(channel.getName()==name){
                current = channel;
                break;
            }
        }
    }

    public void displayChannels(){
        for (Channel ch:channels) {
            System.out.print(ch.getName() + " ");
        }
    }

    public void clearHistory(ArrayList<Channel> channels){

    }
}
