package pe.com.jtdev.designpatterns.observer.own.infrastructure;

import pe.com.jtdev.designpatterns.observer.own.domain.DataDto;

public class EmailDto implements DataDto {
    private String email;

    public String getEmail() {
        return email;
    }
}
