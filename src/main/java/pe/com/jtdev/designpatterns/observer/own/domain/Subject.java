package pe.com.jtdev.designpatterns.observer.own.domain;

public interface Subject {
    void add(Observer observer);

    void remove(Observer observer);

}
