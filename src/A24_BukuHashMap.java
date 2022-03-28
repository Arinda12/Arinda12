import java.util.HashMap;
import java.util.Map;
public class A24_BukuHashMap {
    public static void main(String[] args){
        //membuat objek hashmap
        HashMap<String,A24_Buku>books=new HashMap<String,A24_Buku>();

        //membuat objek buku
        A24_Buku bukuJava=new A24_Buku("Tutorial java","petani kode");
        A24_Buku bukuKotlin=new A24_Buku("Pemrograman kotlin","petani kode");
        A24_Buku bukuAndroid=new A24_Buku("Pemrograman androiid","petani kode");

        //mengisi objek hashmap dengan objek buku
        books.put("java",bukuJava);
        books.put("kotlin",bukuKotlin);
        books.put("android",bukuAndroid);

        //print keys
        System.out.println("\nDaftar key:");
        for(String i:books.keySet()){
            System.out.println(i);
        }
        //print values
        System.out.println("\nDaftar values:");
        for(A24_Buku aBook :books.values()){
            System.out.println("Title:"+aBook.getTitle()+",Author:"+aBook.getAuthor());
        }

        //cetak semua buku
        for(Map.Entry b:books.entrySet()){
            A24_Buku buku=(A24_Buku) b.getValue();
            System.out.println(b.getKey()+":"+buku.getTitle());
        }
    }
}

