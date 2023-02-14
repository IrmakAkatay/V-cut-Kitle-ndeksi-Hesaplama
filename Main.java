import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double bdk;
        double kilo,boy;

        Scanner inp =new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz :");
        kilo= inp.nextDouble();
        System.out.print("Boyunuzu (metre cinsinden) Giriniz :");
        boy= inp.nextDouble();

        bdk = kilo/boy*boy;
        System.out.print("Vücut Kitle İndeksiniz :"+bdk);





    }
    }
