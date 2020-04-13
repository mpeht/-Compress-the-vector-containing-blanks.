/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompactVector;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class CompactVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int i, j, num, aux, space = 1;
        
        System.out.print("Input the size of int vector: ");
        num = sc.nextInt();
        int vector[] = new int[num];
        
        for (i = 0; i < vector.length; i++) {
            System.out.println("Fill in the vector: ");
            vector[i] = sc.nextInt();
            i++;
        }
        for (i = 0; i < (vector.length - 1); i++) {
            if (vector.length % 2 == 0) {
                if (vector[i] == 0 && space < (vector.length / 2)) {

                    aux = vector[i];
                    vector[i] = vector[i + space];
                    vector[i + space] = aux;
                    space++;
                }
            }else{
                 if (vector[i] == 0 && space < ((vector.length / 2) + 1)) {

                    aux = vector[i];
                    vector[i] = vector[i + space];
                    vector[i + space] = aux;
                    space++;
                }
                
            }
        }

        for (i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
