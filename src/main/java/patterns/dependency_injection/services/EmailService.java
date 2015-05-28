package patterns.dependency_injection.services;

import patterns.dependency_injection.interfaces.SendService;

/**
 * Created by student on 5/28/2015.
 */
public class EmailService implements SendService {
    public void sendMessage(){
        System.out.println("Sending Email message ... ");
    }
}
