package patterns.dependency_injection;

import patterns.dependency_injection.interfaces.Consumer;
import patterns.dependency_injection.interfaces.SendService;

/**
 * Created by student on 5/28/2015.
 */
public class Application implements Consumer {
    private SendService service;

    public Application(SendService service){
        this.service = service;
    }

    public void processMessage() {
        service.sendMessage();
    }
}
