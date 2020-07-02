package pattern;

public interface NewsAgency {

    public void register(Channel channel);
    public void unregister(Channel channel);

    public void notifyChannels();

    public Object getUpdate(Channel channel);
}
