package pe.com.jtdev.designpatterns.decorator.bookexample;

public abstract class Beverage {
    public enum Size {
        TALL,   //Small
        GRANDE, //Medium
        VENTI   // Large
    }

    Size size = Size.TALL;
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double cost() {
        return this.baseCost() * accordingSize();
    }

    public abstract double baseCost();

    public double accordingSize() {
        switch (size) {
            case TALL: return 0.8;
            case GRANDE: return 1;
            case VENTI: return 1.3;
            default: throw new RuntimeException("Unknown size");
        }
    }
}
