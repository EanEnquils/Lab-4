public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
         Prostokat p1 =new Prostokat();
         Prostokat p2 =new Prostokat();
         p1.nazwaFigury("prostokant ma obwod = ");
         System.out.println(p1.getObwod(4,5,6,7));
         p1.nazwaFigury("prostokant  ma pole =  ");
         System.out.println(p2.getPola(8,9.5));
         Kwadrat k1 =new Kwadrat();
         Kwadrat k2 =new Kwadrat();
         System.out.println("--------------");
         k1.nazwaFigury("kwadrat ma obwod = ");
         System.out.println(k1.getObwod(4,5,6.3,7));
         k2.nazwaFigury("kwadrat ma pole = ");
         System.out.println(k2.getPola(8,10));

    }
}
