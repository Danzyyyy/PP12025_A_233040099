package pertemuan4.Tugas;

public class StrukturListTest {

    public static void main(String[] args) {
       StrukturList list = new StrukturList();

        //Tugas2 a
        list.addTail(4.5);
        list.addMid(3.4, 1);
        list.addHead(2.1);

        //Tugas2 b
        list.addTail(4.5);
        list.addTail(5.5);
        list.addMid(1.1, 1);
        list.addMid(2.1, 1);
        list.addHead(3.4);

        System.out.print("Elemen: ");
        list.displayElements();
    }
}
