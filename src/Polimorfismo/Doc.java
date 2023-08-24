package Polimorfismo;

public final class Doc extends Animal {

    @Override
    public String makeNoise() {
        return super.makeNoise() + "waw";
    }
}
