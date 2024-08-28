package pe.com.jtdev.designpatterns.decorator.own;

public class CostoHorasFinDeSemana extends BaseCostoHorasDecorator {

    public CostoHorasFinDeSemana(CostoHoras costoHoras) {
        super(costoHoras);
    }

    @Override
    double calcular() {
        return costoHoras.calcular() * 1.5;
    }
}
