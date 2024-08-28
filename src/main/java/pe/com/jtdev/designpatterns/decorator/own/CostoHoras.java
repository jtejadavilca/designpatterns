package pe.com.jtdev.designpatterns.decorator.own;

public abstract class CostoHoras {
    int numHoras;
    double costoHora;

    public CostoHoras(int numHoras, double costoHora) {
        this.numHoras = numHoras;
        this.costoHora = costoHora;
    }

    abstract double calcular();
}
