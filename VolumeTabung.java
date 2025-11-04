import java.util.Scanner;

public class VolumeTabung {

    //Fungsi dengan paramenter untuk menghitung volume tabung
    public static double hitungVolume(double jarijari, double tinggi){
        double volume = Math.PI * jarijari * jarijari * tinggi;
        return volume; //mengembalikan hasil ke pemanggil fungsi

    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Masukkan jarijari tabung: ");
        double r = input.nextDouble();

        System.out.println("Masukkan tinggi tabung");
        double t = input.nextDouble();

        //Memanggil fungsi dan menyimpan hasilnya ke variabel
        double hasil = hitungVolume(r,t);

        //Menampilkan hasil
        System.out.println("Volume tabung =" + hasil);
    }
}