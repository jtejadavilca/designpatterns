package pe.com.jtdev.designpatterns.decorator.own;

public class DecoratorPattern {
    public static void main(String[] args) {
        CostoHoras horasNormales = new CostoHorasNormal(10, 30);
        System.out.println("Total por horas trabajadas : " + horasNormales.calcular());

        CostoHoras horasExtra = new CostoHorasExtra(horasNormales);
        System.out.println("Total por horas extra trabajadas : " + horasExtra.calcular());

        CostoHoras horasFDS = new CostoHorasFinDeSemana(horasExtra);
        System.out.println("Total por horas extra trabajadas en fin de semana: " + horasFDS.calcular());
    }
}
