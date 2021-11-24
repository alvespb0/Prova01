/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaarthuralves;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salario, desconto, qnt;
        int integrantes;
        System.out.println("Qual seu salario: ");
        salario = leia.nextDouble();
        System.out.println("Contando COM você quantas pessoas tem na sua familia: ");
        integrantes = leia.nextInt();
        desconto = salario-((salario / 100) * 13);
        qnt = desconto / integrantes;
        System.out.println("cada membro considerando o desconto de 13% da renda bruta teria: "+qnt+"R$");
    }

}
