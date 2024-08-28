package pe.com.jtdev.designpatterns.decorator.own;

public abstract class BaseCostoHorasDecorator extends CostoHoras {
    CostoHoras costoHoras;
    public BaseCostoHorasDecorator(CostoHoras costoHoras) {
        super(costoHoras.numHoras, costoHoras.costoHora);
        this.costoHoras = costoHoras;
    }

}
