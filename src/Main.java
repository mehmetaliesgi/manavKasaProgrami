import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, total = 0.0;
        int armut_kilo, elma_kilo, domates_kilo, muz_kilo, patlican_kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        armut_kilo = input.nextInt();
        total += armut * armut_kilo;

        System.out.print("Elma kaç kilo: ");
        elma_kilo = input.nextInt();
        total += elma * elma_kilo;

        System.out.print("Domates kaç kilo: ");
        domates_kilo = input.nextInt();
        total += domates * domates_kilo;

        System.out.print("Muz kaç kilo: ");
        muz_kilo = input.nextInt();
        total += muz * muz_kilo;

        System.out.print("Patlıcan kaç kilo: ");
        patlican_kilo = input.nextInt();
        total += patlican * patlican_kilo;

        System.out.println("--------------------------------------------------");
        System.out.println("Armut kaç kilo ? : " + armut_kilo);
        System.out.println("Elma kaç kilo ? : " + elma_kilo);
        System.out.println("Domates kaç kilo ? : " + domates_kilo);
        System.out.println("Muz kaç kilo ? : " + muz_kilo);
        System.out.println("Patlıcan kaç kilo ? : " + patlican_kilo);
        System.out.println("Toplam Tutar: " + total + " TL");
    }
}