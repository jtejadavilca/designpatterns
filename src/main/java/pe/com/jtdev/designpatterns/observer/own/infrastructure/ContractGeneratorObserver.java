package pe.com.jtdev.designpatterns.observer.own.infrastructure;

import pe.com.jtdev.designpatterns.observer.own.domain.DataDto;
import pe.com.jtdev.designpatterns.observer.own.domain.Observer;
import pe.com.jtdev.designpatterns.observer.own.domain.Subject;

public class ContractGeneratorObserver implements Observer {

    public ContractGeneratorObserver(Subject subject) {
        subject.add(this);
    }

    @Override
    public void update(DataDto dataDto) {
        System.out.println("Observer ContractGenerator: Generating report contract for : " + dataDto.getEmail());
    }
}
