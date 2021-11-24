/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaarthuralves;

import java.util.Scanner;

public class exer06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor[];
        int menor50=0;
        int maior51=0;
        int maior100=0;
        vetor=new int [8];
        for (int i = 0; i<vetor.length;i++){
           System.out.println("Digite um numero");
           vetor[i]=leia.nextInt();
           if(vetor[i]>0 && vetor[i]<=50){
               menor50+=1;
           }if(vetor[i]>50 && vetor[i]<=100){
               maior51+=1;
           }if(vetor[i]>100){
               maior100+=1;
           }
        }
        System.out.println("desses 8 numeros "+menor50+" estão entre 0 e 50; "+maior51+" estão entre 51 e 100; "+
                maior100+" são maiores que 100");
    }
}
