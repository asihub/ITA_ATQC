package patterns.dependency_injection.services;

import patterns.dependency_injection.interfaces.SendService;

/**
 * Created by student on 5/28/2015.
 */
public class SMSService implements SendService {
    public void sendMessage(){
        System.out.println("Sending SMS message ... ");
    }
}
