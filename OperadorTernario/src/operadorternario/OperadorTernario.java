/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author gabriel
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        numero1 = 4;
        numero2 = 8;
        resultado = numero1 > numero2 ? 0 : 1;
        System.out.println(resultado);
        
        numero1 = 14;
        numero2 = 8;
        resultado = numero1 > numero2 ? 0 : 1;
        System.out.println(resultado);
        
        numero1 = 4;
        numero2 = 8;
        resultado = numero1 > numero2 ? numero1 : numero2;
        System.out.println(resultado);
        
        numero1 = 14;
        numero2 = 8;
        resultado = numero1 > numero2 ? numero1 : numero2;
        System.out.println(resultado);
        
        numero1 = 14;
        numero2 = 8;
        resultado = numero1 > numero2 ? numero1 + numero2 : numero1 - numero2;
        System.out.println(resultado);
        
        /* Operadores Relacionais
        
            >   maior que
            <   menor que
            >=  maior ou igual a
            <=  menor ou igual a
            ==  igual a
            !=  diferente de
        
        */
    }
    
}
