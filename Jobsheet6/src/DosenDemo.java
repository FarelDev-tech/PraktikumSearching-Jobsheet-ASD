import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlDosen, pilihan = 0;

        System.out.print("Masukkan jumlah maksimal dosen : ");
        jmlDosen = sc.nextInt();
        sc.nextLine(); // buffering

        DataDosen08 list = new DataDosen08(jmlDosen);

        do {
            System.out.println("Menu : ");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buffering

            switch (pilihan) {
                case 1:
                    // Perulangan untuk input data
                    for (int i = 0; i < jmlDosen; i++) {
                        System.out.println("Dosen ke-" + (i + 1));
                        
                        System.out.print("Masukkan Kode: ");
                        String kode = sc.nextLine();
                        
                        System.out.print("Masukkan Nama: ");
                        String nama = sc.nextLine();
                        
                        System.out.print("Masukkan Jenis Kelamin (L/P) : ");
                        String inputJenis = sc.nextLine();
                        boolean jenisKelamin = false;
                        if (inputJenis.equalsIgnoreCase("L")) {
                            jenisKelamin = true;
                        } else {
                            jenisKelamin = false;
                        }
                        
                        System.out.print("Masukkan Usia : ");
                        int usia = sc.nextInt();
                        sc.nextLine(); // buffering

                        // Instansiasi objek
                        Dosen08 dsn = new Dosen08(kode, nama, jenisKelamin, usia);
                        list.tambah(dsn);
                    }
                    break;
                case 2:
                    System.out.println("--- Tampil Data Dosen ---");
                    list.tampil();
                    break;
                case 3:
                    System.out.println("--- Hasil Sorting ASC (Diurutkan dari usia) ---");
                    list.SortingAscending();
                    System.out.println("Data dosen berhasil diurutkan dari Ascending");
                    break;
                case 4:
                    System.out.println("--- Hasil Sorting DSC (Diurutkan dari usia) ---");
                    list.SortingDescending();
                    System.out.println("Data dosen berhasil diurutkan dari Descending");
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5); // Loop akan berhenti jika user input 5
        
        sc.close();
    }
}