package br.ufpb.roberto.adivinha;

import java.util.Scanner;

public class Adivinha {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("numero de tentativas: ");
        int maxNum = Integer.parseInt(leitor.nextLine());
        int pontos = 100;
        int tentativas = 0;
        int y = sorteiaNumero(maxNum);
        boolean acertou = false;
        while(!acertou){
            System.out.print("Digite um numero: ");
            int numero = Integer.parseInt(leitor.nextLine());
            tentativas++;
            if(numero==y){
                System.out.println("PARABÉNS VOÇÊ ACERTOU, NUMERO DE TENTATIVAS "+tentativas+" pontos "+pontos);
                acertou = true;
            }else{
                System.out.println("ERROU! tente novamente");
                pontos-=2;
                if(numero<y){
                    System.out.println("Eh maior");
                }else{
                    System.out.println("Eh menor");
                }
            }
        }
    }
    public static int sorteiaNumero(int numeroMaximo){
        int x = (int) (Math.random()*numeroMaximo+1);
        return x;
    }
}
