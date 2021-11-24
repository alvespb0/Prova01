/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaarthuralves;

import java.util.Scanner;

public class exer08 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String codigo;
        System.out.println(" Azor4 - rosa \n PTR## - azul \n ASPO0 - violeta \n 23 - preto\n"
                + " 5 a 9 - tom de azul \n Ar43 - vermelhor \n De A até F cinza \n HP659T amarelo");
        System.out.println("Digite um código e eu digo que cor é: ");
        codigo = leia.next();

        if ("Azor4".equals(codigo)) {
            System.out.println("rosa");
        }
        if ("PTR##".equals(codigo)) {
            System.out.println("azul");
        }
        if ("ASPO0".equals(codigo)) {
            System.out.println("violeta");
        }
        if ("23".equals(codigo)) {
            System.out.println("preto");
        }
        if ("5 a 9".equals(codigo)) {
            System.out.println("tom de azul");
        }
        if ("Ar43".equals(codigo)) {
            System.out.println("vermelho");
        }
        if ("A até F".equals(codigo)) {
            System.out.println("cinza");
        }
        if ("HP659T".equals(codigo)) {
            System.out.println("amarelo");
        }
    }
}
