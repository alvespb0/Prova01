/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaarthuralves;

import java.util.Scanner;

public class exer03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int inicio, fim, total;
       
            System.out.println("Levando em consideração o dia como de 1h até 24h digite a hora inicial da transmissão (digite apenas as horas sem minutos): ");
            inicio = leia.nextInt();               
            System.out.println("Levando em consideração o dia como de 1h até 24h digite a hora final da transmissão (Digite apenas as horas sem os minutos): ");
            fim = leia.nextInt();
        
        if (inicio > 0 && fim > 0) {
            if (inicio > fim) {
                total = inicio - fim;
                System.out.println("O tempo total de jogo deu: " + total + "h");
            } else {
                total = fim - inicio;
                System.out.println("O tempo total de jogo deu: " + total + "h");
            }
        } else {
            System.out.println("digite um valor diferente de 0");
        }
    }
}
