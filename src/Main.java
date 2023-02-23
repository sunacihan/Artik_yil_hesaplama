import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Yılı giriniz:");
        int yil=input.nextInt();

        if (yil%4==0){
            if (yil%100==0){
                if (yil%400==0){
                    System.out.println("Bir artık yıldır.");
                }else {
                    System.out.println("Bir artık yıl değildir.");
                }

            }else {
                System.out.println("Bir artık yıldır.");

            }

        }else {
            System.out.println("Bir artıl yıl değildir.");
        }
    }
}