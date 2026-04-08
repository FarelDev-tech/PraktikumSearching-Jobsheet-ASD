public class SortingMain {
    public static void main(String[] args) {
        int arr1[] = {20, 10, 2, 7, 12};
        int arr2[] = {30, 20, 2, 8, 14};
        int arr3[] = {40, 10, 4, 9, 3};

        Sorting08 dataUrut1 = new Sorting08(arr1, arr1.length);
        Sorting08 dataUrut2 = new Sorting08(arr2, arr2.length);
        Sorting08 dataUrut3 = new Sorting08(arr3, arr3.length);

        System.out.println("====== Bubble Sort ======");
        System.out.println("Data Awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();

        System.out.println("Data awal 1 yang sudah diurutkan");
        dataUrut1.tampil();

        System.out.println("====== Selection Sort ======");
        System.out.println("Data Awal 2");
        dataUrut2.tampil();
        dataUrut2.SelectionSort();

        System.out.println("Data awal 2 yang sudah diurutkan");
        dataUrut2.tampil();

        System.out.println("====== Insertion Sort ======");
        System.out.println("Data Awal 3");
        dataUrut3.tampil();
        dataUrut3.InsertionSort();

        System.out.println("Data awal 3 yang sudah diurutkan");
        dataUrut3.tampil();
    }
}
