public interface Budynek {

    void setLenght(int length);

    void setBredth(int breadth);

    void powierzchnia(double pow);

    String adresBudynku(String adres);

    void liczbaOkien(int value);

    void liczbaMieszkancow(int value);

    void kolorDomu(KolorEnum kolor);

    public void showInfo();

}
