package pattern;

public class Main {

    public static void main(String[] args) {
        CNN cnnNewsAgency = new CNN();

        Channel morningChannel = new NewsChannel("Morning Channel", cnnNewsAgency);
        Channel eveningChannel = new NewsChannel("Evening Channel", cnnNewsAgency);
        Channel newsChannel = new NewsChannel("LastMinute Channel", cnnNewsAgency);

        cnnNewsAgency.register(morningChannel);
        cnnNewsAgency.register(eveningChannel);
        cnnNewsAgency.register(newsChannel);

        morningChannel.update();

        cnnNewsAgency.postNews("Trump suggests injecting disinfectant as treatment for the COVID19!");
    }
}
