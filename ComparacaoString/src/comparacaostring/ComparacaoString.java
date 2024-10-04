/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author gabriel
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Gabriel";
        String nome2 = "Gabriel";
        String nome3 = new String("Gabriel");
        
        String res;
        
        res = nome1 == nome2 ? "igual" : "diferente";
        System.out.println(res);
        
        res = nome1 == nome3 ? "igual" : "diferente";
        System.out.println(res);
        
        res = nome2 == nome3 ? "igual" : "diferente";
        System.out.println(res);
        
        res = nome1.equals(nome3) ? "igual" : "diferente";
        System.out.println(res);
    }
    
}
