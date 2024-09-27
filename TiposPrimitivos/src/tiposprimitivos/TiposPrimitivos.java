package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        
        System.out.format("Digite a nota do %s: ", nome);
        float nota = teclado.nextFloat(); // (float)8.5
        
        System.out.format("Digite a idade do %s: ", nome);
        int idade = teclado.nextInt();
        
        System.out.format("Digite o salário do %s: ", nome);
        float salario = teclado.nextFloat();
        
        System.out.println("a nota do " + nome + " é " + nota);
        System.out.printf("a nota do %s é %.2f\n", nome, nota); // % número de casas decimais f
        System.out.format("a nota do %s é %.2f\n", nome, nota);
        
        System.out.printf("a idade do %s é %d\n", nome, idade);
        
        System.out.printf("o salário do %s é %.2f\n", nome, salario);
        
    }
    
}
