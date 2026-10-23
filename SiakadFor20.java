import java.util.Scanner;

public class SiakadFor20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, Terendah = 100, Tertinggi = 0;
        int mahasiswaLulus = 0, mahasiswaTidakLulus = 0;
        final double tidakLulus = 60;
        for (int i= 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > Tertinggi) {
                Tertinggi = nilai;
            }
            if (nilai < Terendah) {
                Terendah = nilai;
            }

            if (nilai >= tidakLulus) {
                mahasiswaLulus++;
            } else {
                mahasiswaTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + Tertinggi);
        System.out.println("Nilai terrendah: " + Terendah);
        System.out.println("Mahasiswa yag lulus: " + mahasiswaLulus);
        System.out.println("Mahasiswa yang tidak lulus: " + mahasiswaTidakLulus);
    }
}

