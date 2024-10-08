/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        
        float media = (nota1 + nota2)/2;
        
        System.out.format("Sua média foi %.2f\n", media);
        
        if (media > 9) {
            System.out.println("Parabéns!");
        }
    }
    
}
