import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        calculator a = new calculator();
        Scanner sInt = new Scanner(System.in);
        Scanner sDouble = new Scanner(System.in);
        double num1, num2;
        int pil;

        do{
            System.out.println("============================");
            System.out.println("PROGRAM KALKULATOR SEDERHANA");
            System.out.println("============================");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Keluar");
            System.out.println("============================");
            System.out.print("Masukkan Pilihan Anda : ");

            pil = sInt.nextInt();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan Number 1 : ");
                    num1 = sDouble.nextDouble();
                    System.out.print("Masukkan Number 2 : ");
                    num2 = sDouble.nextDouble();

                    a.Tambah(num1, num2);
                    break;
                case 2:
                    System.out.print("Masukkan Number 1 : ");
                    num1 = sDouble.nextDouble();
                    System.out.print("Masukkan Number 2 : ");
                    num2 = sDouble.nextDouble();

                    a.Kurang(num1, num2);
                    break;
                case 3:
                    System.out.print("Masukkan Number 1 : ");
                    num1 = sDouble.nextDouble();
                    System.out.print("Masukkan Number 2 : ");
                    num2 = sDouble.nextDouble();

                    a.Kali(num1, num2);     
                    break;
                case 4:
                    System.out.print("Masukkan Number 1 : ");
                    num1 = sDouble.nextDouble();
                    System.out.print("Masukkan Number 2 : ");
                    num2 = sDouble.nextDouble();

                    a.Bagi(num1, num2);
                    break;

                case 5:
                    break;
                default:
                    System.out.println("Menu Tidak Terdaftar");
                    return;
            }
        } while  (pil != 5 );
        
        System.out.println("Terima Kasih");
    }
}