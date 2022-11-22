import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DEĞİŞKENLER
        double armutKilo = 2.14;
        double elmaKilo = 3.67;
        double domatesKilo = 1.11;
        double muzKilo = 0.95;
        double patlicanKilo = 5;
        double kilo, toplam, armut, elma, domates, muz, patlican;

        //GİRDİLER

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo? ");
        armut = input.nextDouble();
        System.out.println("Elma kaç kilo? ");
        elma = input.nextDouble();
        System.out.println("Domates kaç kilo ");
        domates = input.nextDouble();
        System.out.println("Muz kaç kilo? ");
        muz = input.nextDouble();
        System.out.println("Patlıcan kaç kilo? ");
        patlican = input.nextDouble();

        //HESAPLAMALAR
        toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);

        //ÇIKTILAR
        System.out.println("Toplam Tutar: " + toplam);


    }
}