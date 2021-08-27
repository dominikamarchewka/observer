import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Blog {
    private List <MailObserver> mailObservers;

    public Blog (){
        mailObservers = new ArrayList<>();
    }

    public void subscribe (MailObserver observer){
        this.mailObservers.add(observer);
    }

    public void startWork () {
        Thread thread = new Thread(() -> {
            while (Thread.currentThread().isAlive()) {
                int randomDelay = new Random().nextInt(1000);
                try {
                    Thread.sleep(randomDelay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (MailObserver observer : mailObservers){
                    observer.newsletter("time: " + randomDelay + ", content " + UUID.randomUUID().toString());
                }
            }
        });
        thread.start();
    }
}
