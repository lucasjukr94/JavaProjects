//Aula 7 - Angela
/*
Vetores
int n[] = new int[10];

01)	Elaborar um programa que declare um vetor de 20 elementos reais. 
O programa deve requisitar ao usuário um valor real a ser pesquisado no conjunto.
Caso seja encontrado, deve-se exibir a mensagem de que o mesmo foi encontrado e em qual posição. 
Em caso de não existência, exiba mensagem apropriada.

02)	Elaborar um programa que declare uma matriz bidimensional que represente 
uma estante com 4 prateleiras e 3 compartimentos cada prateleira. 
Faça um programa que leia a quantidade de peças em cada compartimento de prateleira. 
Exiba os valores das peças por prateleira.

*/

import java.util.Scanner;

public class Aula7{
   public static void main(String args[]){
      //-------01-----------------------------------------------------------
      Scanner scanner = new Scanner(System.in);
   
      double vetor[] = new double[20];
      for(int i=0;i<20;i++){
         vetor[i] = i;
      }
      
      System.out.println("Digite um valor:");
      double val = scanner.nextDouble();   
      
      int v=0;
      for(int i=0;i<20;i++){
         if(vetor[i]==val){
            v++;
            System.out.println("Foi encontrado o valor "+val+" na posicao "+i);
         }
      }
      if(v==0){
         System.out.println("Nao foi encontrado o valor "+val);
      }
      
      //--------02--------------------------------------------------------
      double matrix[][] = new double[4][3];
      for(int i=0;i<4;i++){
         for(int j=0;j<3;j++){
            matrix[i][j] = j;
         }
      }
      
      for(int i=0;i<4;i++){
         for(int j=0;j<3;j++){
            System.out.println("Prateleira "+i+" quantidade de pecas "+matrix[i][j]);
         }
      }
   }
}