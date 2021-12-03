public abstract class Figura {
    abstract double getPola(double a ,double b);

    abstract double getObwod(double a,double b, double c, double d);

    public void nazwaFigury(String figura) {
        System.out.print("To jest figura:" + figura);
    }
}
