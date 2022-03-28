import java.util.ArrayList;
public class A21_ArrayListExample {
    //menggunakan arrayList untuk menampung objek String
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("ford");
        cars.add("Mazda");
        System.out.println(cars);//mencetak arraylist
        //mengakses elemen arraylist menggunakan konvensional for
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("%s ", cars.get(i));
        }
        System.out.println();
        //mengakses elemen arraylist menggunakan for each
        for (String car : cars) {
            System.out.printf("%s", car);
        }
        System.out.println();
        //mengakses elemen arraylist menggunakan functional for ecah
        cars.forEach((car)-> {
            System.out.printf("%s", car);
        });
        System.out.println();

    }
}
