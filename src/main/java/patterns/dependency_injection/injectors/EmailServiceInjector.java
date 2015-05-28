package patterns.dependency_injection.injectors;

import patterns.dependency_injection.Application;
import patterns.dependency_injection.interfaces.Consumer;
import patterns.dependency_injection.interfaces.SendServiceInjector;
import patterns.dependency_injection.services.EmailService;

/**
 * Created by student on 5/28/2015.
 */
public class EmailServiceInjector implements SendServiceInjector {

    public Consumer getConsumer() {
        return new Application(new EmailService());
    }
}
