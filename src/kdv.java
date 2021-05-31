import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        double tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı giriniz: ");
        tutar = input.nextDouble();

        boolean kosul1 = tutar >=1000;

        double kdv1 = (kosul1) ?  0.08 :  0.18;

        double kdvmiktari = tutar * kdv1;
        double kdvlifiyat = tutar + kdvmiktari;


        System. out.println("Girilen Fiyat: " + tutar);
        System. out.println("Kdv: " + kdv1);
        System. out.println("Kdv Turarı : " + kdvmiktari);
        System. out.println("Toplam : " + kdvlifiyat);

    }

}




