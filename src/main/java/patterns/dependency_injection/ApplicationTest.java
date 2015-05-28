package patterns.dependency_injection;

import patterns.dependency_injection.injectors.EmailServiceInjector;
import patterns.dependency_injection.interfaces.Consumer;
import patterns.dependency_injection.interfaces.SendServiceInjector;

/**
 * Created by student on 5/28/2015.
 */
public class ApplicationTest {
    public static void main(String[] args) {
        final SendServiceInjector serviceInjector = new EmailServiceInjector();
        final Consumer application = serviceInjector.getConsumer();

        application.processMessage();
    }
}
