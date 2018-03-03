/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangulo;
import java.util.Scanner;
/**
 *
 * @author BrayanRiquelme
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        float h, b, resultado;
        
        System.out.println("Valor de la base:");
        
        b = add.nextInt();
        
        System.out.println("Valor de la altura:");
        
        h=add.nextFloat();
        
        resultado = (b*h)/2;
        System.out.println("El resultado es: "+resultado);
        // TODO code application logic here
    }
}
