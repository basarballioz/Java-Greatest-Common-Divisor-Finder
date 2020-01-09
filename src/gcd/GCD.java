package gcd;
import java.util.Scanner;
public class GCD {

            public static int ebobbulma(int sayi1, int sayi2) {
                int ebob = 1;

                for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
                    if ((sayi1 % i == 0) && (sayi2 % i == 0)) {

                        ebob = i;
                    }
                }
                return ebob;   
            }
    
            public static void main(String[] args) {
             Scanner input = new Scanner(System.in);

                    System.out.print("Birinci Sayı : ");
                    int birinci_sayi = input.nextInt();

                    System.out.print("İkinci Sayı : ");
                    int ikinci_sayi = input.nextInt();
                    System.out.println("İki Sayının Ebobu : " + ebobbulma(birinci_sayi, ikinci_sayi));
           }
 }