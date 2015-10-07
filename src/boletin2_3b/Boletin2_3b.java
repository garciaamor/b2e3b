
package boletin2_3b;

import java.util.Scanner;


public class Boletin2_3b {

    
    public static void main(String[] args) {
        float lado;
        Scanner obx=new Scanner(System.in);
        System.out.println(" teclea lado : ");
        lado=obx.nextFloat();
        float area=(float)Math.pow(lado,2);
        System.out.println("area = "+area);
        
    }
    
}
