package pe.com.jtdev.designpatterns.observer.own.infrastructure;

import pe.com.jtdev.designpatterns.observer.own.domain.DataDto;
import pe.com.jtdev.designpatterns.observer.own.domain.Observer;
import pe.com.jtdev.designpatterns.observer.own.domain.Subject;

public class AnotherObserver implements Observer {
    public AnotherObserver(Subject subject) {
        subject.add(this);
    }
    @Override
    public void update(DataDto dataDto) {
        System.out.println("Observer AnotherObserver: Processing another logic for : " + dataDto.getEmail());
    }
}
