import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs, pss;
        double cari, posisi;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();
        sc.nextLine(); // buffering

        MahasiswaBerprestasi list = new MahasiswaBerprestasi(jmlMhs);

        for (int i=0; i<jmlMhs; i++) {
            Mahasiswa08 mhs = new Mahasiswa08();
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan NIM : ");
            mhs.nim = sc.nextLine();
            System.out.print("Masukkan Nama : ");
            mhs.nama = sc.nextLine();
            System.out.print("Masukkan Kelas : ");
            mhs.kelas = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            mhs.ipk = sc.nextDouble();
            sc.nextLine(); // buffering
            list.tambah(mhs);
        }

        list.tampil();
        // Melakukan searching menggunakan sequential searching
        System.out.println("----------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------");
        System.out.println("Masukkan IPK Mahasiswa yang dicari : ");
        System.out.print("Masukkan IPK: ");
        cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        posisi = list.sequentialSearching(cari);
        pss = (int) posisi; // karena posisi adalah double, maka harus dikonversi ke int
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        sc.close();
    }
}
