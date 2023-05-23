package EJERCICIO;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number1;
        int number2;
        int sum, rest, multi;
        System.out.print("Ingrese primer numero: ");
        number1= input.nextInt();
        System.out.print("Ingrese segundo numero: ");
        number2= input.nextInt();
        sum=number1+number2;
        rest=number1-number2;
        multi=number1*number2;
        System.out.println("La suma es: "+sum);
        System.out.println("La resta es: "+rest);
        System.out.println("La multiplicacion es: "+multi);
    }


}
