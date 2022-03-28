import java.util.ArrayList;
public class A22_ArrayListObjek {
    //menggunakan Array untuk menampung berbagai macam objek
    public static void main(String[] args) {
        //membuat objek array list
        ArrayList kantongAjaib = new ArrayList();

        // Mengisi kantong ajaib dengan 5 benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);

        // menghapus tikus dari kantong ajaib
        kantongAjaib.remove("tikus");

        // Menampilkan isi kantong ajaib
        System.out.println("kantong Ajaib");


        // menampilkan banyak isi kantong ajaib
        System.out.println("Kantong ajaib berisi " + kantongAjaib.size() + "item");
    }
}
