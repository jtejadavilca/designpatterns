package pe.com.jtdev.designpatterns.decorator.own;

public class CostoHorasNormal extends CostoHoras {
    public CostoHorasNormal(int numHoras, double costoHora) {
        super(numHoras, costoHora);
    }

    @Override
    double calcular() {
        return numHoras * costoHora;
    }
}
