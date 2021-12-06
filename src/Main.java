import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */



        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */
        int index = -1;
        boolean isNumberCorrect = false;
        Scanner scan = new Scanner(System.in);
        String[] coffee = {"Americano", "Espresso", "Cappuccino", "Macchiato", "Late", "Doppio"};

        System.out.println("Write the coffee number 0-5 :");
        //Jeśli piszemy list, to pętla  działa
        while (!isNumberCorrect) {
            try {
                index = Integer.parseInt(scan.next());
            } catch (NumberFormatException ex) {
                System.out.println("You need to write a number! " + "\n Write number one more: ");

            }
            isNumberCorrect = index == -1 ? false : true;
        }


        try {
            System.out.println((coffee[index]));
            isNumberCorrect = true;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You wrote number: " + index + " but should be wite 0-5: " + coffee.length);

        } finally {
            System.out.println("Wait for coffee.");
        }

        //stworzyć dowolny przykład z NullPonterException
        String abc = null;
        try {
            if (abc.equals("dfg"))
                System.out.println("Same");
            else {
                System.out.println("Same");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Caught");
        }
        // stworzyć dowolny przykład z ArithmeticException
        try {
            int num1 = 30, num2 = 0;
            int output = num1 / num2;
            System.out.println("Result: " + output);
        } catch (ArithmeticException e) {
            System.out.println("You Shouldn't divide a number by zero");
        }
        //stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally
        try {
            int a[] = new int[7];
            a[4] = 30 / 0;
            System.out.println("First print statement in try block");
        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Warning: Some Other exception");
        } finally {
            System.out.println("Out of try-catch block...");
        }


    }
}

