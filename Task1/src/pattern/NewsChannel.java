package pattern;

public class NewsChannel implements Channel {

    private String name;
    private NewsAgency newsAgency;

    public NewsChannel(String name, NewsAgency newsAgency){
        this.name = name;
        this.newsAgency = newsAgency;
    }

    @Override
    public void update() {
        String msg = (String) newsAgency.getUpdate(this);
        if(msg == null){
            System.out.println(name + " :: No new message");
        } else {
            System.out.println(name + " :: " + msg);
        }
    }
}
