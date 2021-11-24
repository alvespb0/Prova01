/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaarthuralves;

import java.util.Scanner;

public class exer05 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor1[];
        int vetor2[];
        vetor1 = new int[7];
        vetor2 = new int[7];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("digite um valor");
            vetor1[i] = leia.nextInt();
            if (vetor1[i] < 0) {
                vetor2[i] = 1;
            } else {
                vetor2[i] = vetor1[i];
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("vetor1: " + vetor1[i]);
        }
        System.out.println("");
        for (int i = 0; i < 7; i++) {
            System.out.println("vetor2: " + vetor2[i]);
        }

    }
}
