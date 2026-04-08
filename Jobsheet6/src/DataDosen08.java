public class DataDosen08 {
    Dosen08 dataDosen[];
    int idx = 0;

    // constructor
    DataDosen08(int jmlDosen) {
        dataDosen = new Dosen08[jmlDosen];
    }

    void tambah(Dosen08 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan");
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data masih kosong");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void SortingAscending() { // bubble sort
        for (int i = 0; i < idx - 1; i++) {
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[i].usia > dataDosen[j].usia) {
                    Dosen08 temp = dataDosen[i];
                    dataDosen[i] = dataDosen[j];
                    dataDosen[j] = temp;
                }
            }
        }
    }

    void SortingDescending() { // selection sort
        for (int i = 0; i < idx - 1; i++) {
            int max = i; 
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) { 
                    max = j;
                }
            }
            Dosen08 temp = dataDosen[i];
            dataDosen[i] = dataDosen[max];
            dataDosen[max] = temp;
        }
    }
}
