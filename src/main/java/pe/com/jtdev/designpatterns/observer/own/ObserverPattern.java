package pe.com.jtdev.designpatterns.observer.own;

import pe.com.jtdev.designpatterns.observer.own.domain.Observer;
import pe.com.jtdev.designpatterns.observer.own.infrastructure.AnotherObserver;
import pe.com.jtdev.designpatterns.observer.own.infrastructure.ContractGeneratorObserver;
import pe.com.jtdev.designpatterns.observer.own.infrastructure.EmailSenderObserver;
import pe.com.jtdev.designpatterns.observer.own.infrastructure.UserRegisterService;

public class ObserverPattern {
    public static void main(String[] args) {
        // Creating the subject
        UserRegisterService subject = new UserRegisterService();

        // Creating some observers and linking to the subject
        Observer observerEmailSender = new EmailSenderObserver(subject);
        Observer observerContractGenerator = new ContractGeneratorObserver(subject);
        Observer observerAnotherObserver = new AnotherObserver(subject);

        // Execute subject process (should notify to all observers)
        subject.registerUser("user1@gmail.com");

        // Removing one of the observers
        subject.remove(observerAnotherObserver);

        // Execute subject process (should notify to remaining observers)
        subject.registerUser("user2@gmail.com");
    }
}
