import java.util.Scanner;

public class deretPerulangan {
   public static void main(String[] args) {
      int batasAwal=0, batasAkhir=0, beda, pilihan, temp=1;

      Scanner d = new Scanner(System.in);

      System.out.println("Masukkan batas atas: ");
      batasAwal = d.nextInt();

      System.out.println("Masukkan batas akhir: ");
      batasAkhir = d.nextInt();

      System.out.println("Masukkan jarak angka: ");
      beda = d.nextInt();

      
      System.out.println("=======================================");
      System.out.println("1. Tanpa Perkalian\n2. Dengan Perkalian");
      System.out.println("Ingin menggunakan perkalian atau tidak? (Ketik angka 1 atau 2)");
      System.out.println("=======================================");
      pilihan = d.nextInt();

         if (pilihan == 1) {
            // Menggunakan loop while
            int i = batasAwal;
            while (i <= batasAkhir) {
               System.out.print(i + " ");
               i += beda;
            }
            // if (pilihan == 1) {
            // // atau bisa Menggunakan loop for
            // for (int i = batasAwal; i <= batasAkhir; i += beda) {
            //    System.out.print(i + " ");
            // }
         } else if (pilihan == 2) {
            //menggunakan loop for
            for (int i = batasAwal; i <= batasAkhir; i +=beda) {
               System.out.println(i+ " x ");
               temp*=i;
               System.out.println("= " +temp);
            }
         } else {
            System.out.println("Pilihan tidak valid");
         }
      }
   }