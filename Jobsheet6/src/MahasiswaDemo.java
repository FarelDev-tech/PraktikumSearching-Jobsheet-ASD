import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs;

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

            list.tambah(mhs);
        }

        System.out.println("Data Mahasiswa Sebelum disorting");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (Bubble Sort)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (Selection Sort)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (Insertion Sort)");
        list.InsertionSort();
        list.tampil();

        sc.close();
    }
}
