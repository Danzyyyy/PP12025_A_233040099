package pertemuan8;

public class ListMkTest {

    //Latihan 4
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
        list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new Matakuliah("IF002", "Struktur Diskrit", 3));

        list.displayElements();
        //Tes-1
        ListMatakuliah list2 = new ListMatakuliah();
        list2.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list2.addHead(new Matakuliah("IF002", "Struktur Diskrit", 3));
        list2.addHead(new Matakuliah("IF003", "Pemrograman Web", 3));
        list2.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));

        list2.displayElements();

        //Tes-4
        ListMatakuliah list4 = new ListMatakuliah();
        list4.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list4.addMid(new Matakuliah("IF002", "Struktur Diskrit", 3), 3);
        list4.addMid(new Matakuliah("IF003", "Pemrograman Web", 3), 2);
        list4.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));

        list4.displayElements();
    }
}
