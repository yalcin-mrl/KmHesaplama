import java.util.Scanner;
public class TaksiHesap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double kmUcret = 2.20;
        double gidilenMesafe;
        System.out.println("Mesafe bilgisini girin?");
        gidilenMesafe = sc.nextDouble();
        double ucret= 10 + gidilenMesafe*kmUcret;
        if(ucret<20){
            System.out.println("Tutar : 20TL");
        }
        else{
            System.out.println("Tutar: "+ ucret);
        }
    }
}
