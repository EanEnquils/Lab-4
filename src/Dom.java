public class Dom implements Budynek {
    private double powierzchnia;
    private int length;
    private int breadth;
    private int liczbaOkien;
    private int liczbaMieszkancow;


    @Override
    public void setLenght(int length) {
        this.length = length;
    }

    @Override
    public void setBredth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void powierzchnia(double pow) {
        this.powierzchnia = pow;
    }

    @Override
    public String adresBudynku(String adres) {
        return adres;
    }

    @Override
    public void liczbaOkien(int value) {
        this.liczbaOkien = value;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.liczbaMieszkancow = value;

    }

    @Override
    public void kolorDomu(KolorEnum kolor) {


    }


    @Override
    public void showInfo() {
        System.out.println("Perimetr: " + length * breadth);
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void showPrice(int price) {
        System.out.println("Price: " + price);
    }

    @Override
    public String toString() {
        return "Dom{" +
                "powierzchnia=" + powierzchnia +
                ", długość=" + length +
                ", szerokość=" + breadth +
                ", liczbaOkien=" + liczbaOkien +
                ", liczbaMieszkancow=" + liczbaMieszkancow +
                '}';
    }
}
