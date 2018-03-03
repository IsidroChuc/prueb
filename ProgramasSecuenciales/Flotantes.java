/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flotantes;
import java.util.Scanner;
/**
 *
 * @author BrayanRiquelme
 */
public class Flotantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner uso = new Scanner(System.in);
        float n1, n2, resultado;
        
        System.out.println("Ingresar primer número");
        n1 = uso.nextFloat();
        System.out.println("Ingresar el segundo número");
        n2 = uso.nextFloat();
        
        resultado = n1+n2;
        System.out.println("El resultado es: "+resultado);
        
    }
}
