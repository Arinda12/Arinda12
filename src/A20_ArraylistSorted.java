import java.util.ArrayList;
import java.util. Collections;
public class A20_ArraylistSorted {
    //menggurutkan elemen arrayList menggunakan kelas Collection
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(20);
        myNumbers.add(15);
        myNumbers.add(25);
        myNumbers.add(10);
        printList(myNumbers);
        // Sort myNumbers ascending order
        Collections.sort(myNumbers);
        printList(myNumbers);

        // Sort myNumbers descending order
        Collections.sort(myNumbers, Collections.reverseOrder());
        printList(myNumbers);
    }
    static void printList(ArrayList<Integer> myNumbers){
        myNumbers.forEach((number) -> {
            System.out.printf("%d ", number);
        });
        System.out.println();


    }
}
