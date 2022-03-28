import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class A3_TestPythagoras {
    public static void main(String[] args){
        double a=8;
        double b=6;
        //rumus pytagoras
        double c=sqrt(pow(a,2)+pow(b,2));
        System.out.println("c="+c);
    }
}

