/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author gabriel
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Operadores aritmeticos");
        int numero1 = 3;
        int numero2 = 5;
        float media = (numero1 + numero2) / 2;
        System.out.format("A média é igual a %.2f\n", media);
        
        System.out.println("Unários");
        int numeroUnario = 5;
        numeroUnario++;
        System.out.println(numeroUnario);
        
        numeroUnario--;
        System.out.println(numeroUnario);
        
        numeroUnario = 5;
        int resultadoUnario = 5 + numeroUnario++;
        System.out.println(resultadoUnario);
        
        numeroUnario = 5;
        resultadoUnario = 5 + ++numeroUnario;
        System.out.println(resultadoUnario);
        
        numeroUnario = 5;
        resultadoUnario = 5 + numeroUnario--;
        System.out.println(resultadoUnario);
        
        numeroUnario = 5;
        resultadoUnario = 5 + --numeroUnario;
        System.out.println(resultadoUnario);
        
        System.out.println("Atribuição");
        int numeroAtribuicao = 4;
        numeroAtribuicao += 2;
        System.out.println(numeroAtribuicao);
        
        numeroAtribuicao = 4;
        numeroAtribuicao *= 2;
        System.out.println(numeroAtribuicao);
        
        System.out.println("Arredondamento");
        float arredondamento = (float) Math.floor(4.2);
        System.out.println(arredondamento);
        arredondamento = (float) Math.ceil(4.2);
        System.out.println(arredondamento);
        arredondamento = (float) Math.round(4.2);
        System.out.println(arredondamento);
        
        System.out.println("Random");
        double aleatorio = Math.random();
        System.out.println(aleatorio);
        int valorMinimo = 5;
        int valorMaximo = 10;
        int valorSortido = (int) (valorMinimo + aleatorio * (valorMaximo - valorMinimo));
        System.out.println(valorSortido);
    }

}
