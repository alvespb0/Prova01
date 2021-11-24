/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaarthuralves;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        double mesada, resto, p2;
        int p1;

        System.out.println("Digite o nome do aluno: ");
        nome = leia.next();
        System.out.println("Qual a mesada do aluno?");
        mesada = leia.nextDouble();
        System.out.println("Tudo bem " + nome + " você gostaria de comprar algum desses produtos?");    
        System.out.println("[1] mouse gamer: 35.50R$ - [2] Pastel da feira? 7.50R$ - [3] Tenis da nike 300.00R$"
                + " - [4] Bola de futebol 40R$ - [5] Refrigerante 3.50R$ - [6] Não gostaria de comprar nenhum desses produtos");
        p1 = leia.nextInt();        
        switch (p1) {
            case 1:
                p2=35.50;
                resto=mesada-p2;
                if(mesada<p2){
                    System.out.println("Você nao tem dinheiro o suficiente para essa compra.");
                }else{
                    System.out.println("otima escolha! o restante da sua mesada é: "+resto);
                }
                break;
            case 2:
                p2=7.50;
                resto=mesada-p2;
                if(mesada<p2){
                    System.out.println("Você nao tem dinheiro o suficiente para essa compra.");
                }else{
                    System.out.println("otima escolha! o restante da sua mesada é: "+resto);
                }
                break;
            case 3:
                p2=300;
                resto=mesada-p2;
               if(mesada<p2){
                    System.out.println("Você nao tem dinheiro o suficiente para essa compra.");
                }else{
                    System.out.println("otima escolha! o restante da sua mesada é: "+resto);
                }
               break;
            case 4:
                p2=40;
                resto=mesada-p2;
                if(mesada<p2){
                    System.out.println("Você nao tem dinheiro o suficiente para essa compra.");
                }else{
                    System.out.println("otima escolha! o restante da sua mesada é: "+resto);
                }
               break;
            case 5:
                p2=3.50;
                resto=mesada-p2;
                if(mesada<p2){
                    System.out.println("Você nao tem dinheiro o suficiente para essa compra.");
                }else{
                    System.out.println("otima escolha! o restante da sua mesada é: "+resto);
                }
               break;
            case 6:
                resto=0;
                System.out.println("Otimo sua mesada segue intacta.");
        }

    }
}
