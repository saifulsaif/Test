/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author DIU
 */
public class test1 {
    public static void main (String[]arge){
        int a = 10;
        int b =20 ;
        int c= 30;
        
        String e = "10";
        int g = Integer.parseInt(e);
        System.out.println(g);
          
        String d = "1110.111";
        double dd = Double.parseDouble(d);
        String ds = String.valueOf(dd);
       
        
        
        System.out.println(d);
        System.out.println(dd);
        System.out.println("Sum="+(a+b+c));
        System.out.println("Sub="+(c-b-a));
        System.out.println("Mul="+(a*b*c));
        System.out.println("Sum="+(c/a));
    }
}
