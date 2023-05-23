package EJERCICIO;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class numeros {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        System.out.print("Ingrese el numero: ");
        n= input.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(+i);
        }
    }

}
