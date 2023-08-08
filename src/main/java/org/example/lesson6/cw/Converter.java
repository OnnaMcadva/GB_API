package org.example.lesson6.cw;

public interface Converter {
    double convertValue(double baseTemp);
}
final class Kelv implements Converter{
    @Override
    public double convertValue(double baseTemp) {
        return baseTemp +273;
    }
}
final class Far implements Converter {
    @Override
    public double convertValue(double baseTemp) {
        return 1.8 * baseTemp + 32;
    }
}
final class Cels implements Converter{
    @Override
    public double convertValue(double baseTemp) {
        return baseTemp;
    }
}