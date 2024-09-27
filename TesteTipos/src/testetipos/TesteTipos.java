
package testetipos;

/**
 *
 * @author gabriel
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(valor2);
        
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.format("%.3f\n", idade3);
    }
    
}
