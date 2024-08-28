package pe.com.jtdev.designpatterns.decorator.own;

public class CostoHorasExtra extends BaseCostoHorasDecorator {

    public CostoHorasExtra(CostoHoras costoHoras) {
        super(costoHoras);
    }

    @Override
    public double calcular() {
        return costoHoras.calcular() * 1.2;
    }
}
