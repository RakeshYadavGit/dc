import java.util.concurrent.atomic.AtomicInteger;

public class LoadBalancer{
    public static int NUM_OF_SERVERS = 4;
    public static String[] SERVERS = {"Server A", "Server B", "Server C", "Server D"};
    public static AtomicInteger SERVER_INDEX = new AtomicInteger(0);

    public static String getServer(){
        int index = SERVER_INDEX.getAndIncrement()%NUM_OF_SERVERS;
        return SERVERS[index];
    }

    public static void main(String args[]){
        for(int i = 1; i< 11; i++){
            System.out.println("Request"+(i) +" sent to "+getServer());
        }
    }
}