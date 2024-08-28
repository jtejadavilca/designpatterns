package pe.com.jtdev.designpatterns.observer.own.infrastructure;

import pe.com.jtdev.designpatterns.observer.own.domain.DataDto;

public class UserRegistered implements DataDto {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
