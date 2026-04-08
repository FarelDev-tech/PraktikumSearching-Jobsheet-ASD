public class MahasiswaBerprestasi {
    Mahasiswa08 listMhs[];
    int idx;

    MahasiswaBerprestasi(int jmlMhs) {
        listMhs = new Mahasiswa08[jmlMhs];
        idx = 0;
    }

    void tambah(Mahasiswa08 mhs) {
        if (idx < listMhs.length) { 
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }   

    void tampil() {
        for (Mahasiswa08 mhs : listMhs) {
            mhs.tampilInformasi();
            System.out.println("---------------------");
        }
    }

    void bubbleSort() {
        for (int i=0; i<listMhs.length-1; i++) {
            for (int j=1; j<listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa08 temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }

    void SelectionSort() {
        for (int i=0; i<listMhs.length-1; i++) {
            int idxMin = i;
            for (int j=i+1; j<listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa08 temp = listMhs[i];
            listMhs[i] = listMhs[idxMin];
            listMhs[idxMin] = temp;
        }
    }

    // dengan descending
    void InsertionSort() {
        for (int i=1; i<listMhs.length; i++) {
            Mahasiswa08 temp = listMhs[i];
            // descending
            int j=i-1;
            while (j>=0 && listMhs[j].ipk < temp.ipk) {
                listMhs[j+1] = listMhs[j];
                j--;
            }
            listMhs[j+1] = temp;
        }
    }
}
