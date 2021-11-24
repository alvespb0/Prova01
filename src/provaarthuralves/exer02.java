/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaarthuralves;

import java.util.Scanner;

public class exer02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        double salario,anos,aumento;
        System.out.println("Digite o nome do funcionario");
        nome=leia.next();
        System.out.println("Digite o salario atual desse funcionario: ");
        salario=leia.nextDouble();
        System.out.println("agora digite em ANOS quanto tempo esse funcionario trabalha nessa empresa");
        anos=leia.nextDouble();
        if(anos<=4){
            aumento=((salario/100)*10)+salario;
            System.out.println("tempo de empresa até 4 anos = 10% de aumento no salario, "
                    + "esse é o novo salario de "+nome+":"+aumento+"R$ Parabéns!");
        }if(anos>4 && anos<=9){
           aumento=((salario/100)*15)+salario; 
           System.out.println("Tempo de empresa de 5 a 9 anos = 15% de aumento no salario, "
                   + "esse é o novo salario de "+nome+":"+aumento+"R$ Parabéns!");
        }if(anos>9 && anos<=14){
            aumento=((salario/100)*20)+salario; 
            System.out.println("Tempo de empresa de 10 a 14 anos = 20% de aumento no salario, "
                   + "esse é o novo salario de "+nome+":"+aumento+"R$ Parabéns!");
        }if(anos>14 && anos<=19){
          aumento=((salario/100)*25)+salario; 
          System.out.println("Tempo de empresa de 15 a 19 anos = 25% de aumento no salario, "
                   + "esse é o novo salario de "+nome+":"+aumento+"R$ Parabéns!");
        }if(anos>20){
            aumento=((salario/100)*30)+salario; 
            System.out.println("Tempo de empresa maior que 20 anos = 30% de aumento no salario, "
                   + "esse é o novo salario de "+nome+":"+aumento+"R$ Parabéns!");
        }
        
        
    }
}
