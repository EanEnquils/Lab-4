public class Prostokat extends Figura {
    @Override
    double getPola(double a ,double b) {
        return a*b;
    }

    @Override
    double getObwod(double a,double b, double c, double d) {
        return a+b+c+d;
    }

}
