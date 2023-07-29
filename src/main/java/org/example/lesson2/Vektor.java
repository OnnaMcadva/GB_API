package org.example.lesson2;

public class Vektor {

    private double x;
    private double y;
    private double z;

    public Vektor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**@apiNote Проектирование и создание класса, описывающего вектор
    // Задача: Создайте класс, который описывает вектор (в трёхмерном пространстве).
    // У него должны быть:
    //    • конструктор с параметрами в виде списка координат x, y, z
     *
     * @return
     */
    @Override
    public String toString() {
        return "Vektor{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return
     * @apiNote метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vektor2
     * @return
     * @apiNote метод, вычисляющий скалярное произведение:
     */
    public double scalProd(Vektor vektor2) {
        return x * vektor2.x + y * vektor2.y + z * vektor2.z;
    }

    /**
     * @param vektor2
     * @apiNote метод, вычисляющий векторное произведение с другим вектором:
     */
    public Vektor vektProd(Vektor vektor2) {
        return new Vektor(
                y * vektor2.z - z * vektor2.y,
                z * vektor2.x - x * vektor2.z,
                x * vektor2.y - y * vektor2.x);
    }

    /**
     * @apiNote метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
     * @param vektor2
     * @return
     */
    public double cos(Vektor vektor2) {
        return (scalProd(vektor2)) / (length() * vektor2.length());

    }

    /**
     * @apiNote методы для суммы и разности:
     * @param vektor2
     * @return
     */
    public Vektor sum(Vektor vektor2) {
        return new Vektor(x + vektor2.x, y + vektor2.y, z + vektor2.z);
    }

    /**
     * @apiNote vektor - vektor2
     * @param vektor2 umensatel
     * @return diff
     */
    public Vektor diff(Vektor vektor2) {
        return new Vektor(x - vektor2.x, y - vektor2.y, z - vektor2.z);
    }
}
