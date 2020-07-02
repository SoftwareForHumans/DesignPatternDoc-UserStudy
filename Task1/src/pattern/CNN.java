package pattern;

import java.util.ArrayList;
import java.util.List;

public class CNN implements NewsAgency {

    private List<Channel> channels;
    private String news;
    private boolean hasUpdate;

    public CNN(){
        this.channels = new ArrayList<>();
    }
    @Override
    public void register(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void unregister(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public void notifyChannels() {
        if (!hasUpdate) {
            return;
        }
        this.hasUpdate = false;
        for (Channel channel : channels) {
            channel.update();
        }

    }

    @Override
    public Object getUpdate(Channel channel) {
        return this.news;
    }

    public void postNews(String msg){
        System.out.println("Message Posted to CNN News Channel : " + msg);
        this.news = msg;
        this.hasUpdate = true;
        notifyChannels();
    }

}
