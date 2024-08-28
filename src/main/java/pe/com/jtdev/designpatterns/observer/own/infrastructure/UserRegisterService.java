package pe.com.jtdev.designpatterns.observer.own.infrastructure;

import pe.com.jtdev.designpatterns.observer.own.domain.Observer;
import pe.com.jtdev.designpatterns.observer.own.domain.Subject;

import java.util.ArrayList;
import java.util.List;

public class UserRegisterService implements Subject {
    private final List<Observer> observers;

    public UserRegisterService() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void registerUser(String email) {
        System.out.println("UserRegisterService.Registering user : " + email);
        this.notifyObservers(email);
    }

    private void notifyObservers(String email) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("UserRegisterService.Notifying observers");
        UserRegistered user = new UserRegistered();
        user.setEmail(email);
        for(var observer : observers) {
            observer.update(user);
        }
    }
}
