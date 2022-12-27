import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение x: ");
        Scanner input = new Scanner(System.in);
        double x=input.nextDouble();
        double y=0.0, a=1.0,b=1.0;
        if (x<=1)
        {
            y=a*Math.pow(Math.sin(x),2)+Math.sqrt(x);
        }
        if (x>1)
        {
            y=b*Math.exp(x*x);
        }
        System.out.println(y);

    }
}