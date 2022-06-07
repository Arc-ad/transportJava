import com.transport.*;
import com.transport.publicTransport.Bus;
import com.transport.steamTechnology.Steamer;

public class Main {
    public static void main(String[] args) {
    Bus bus = new Bus();
    bus.setName("Школьный автобус");
        System.out.println(bus.getName());
        Steamer steamer = new Steamer();
        System.out.println(steamer.weight);
    }
}
