/*
Exercícios POO
1)Responda as seguintes questões quanto a modelagem de sistemas:

a)O que é Modelagem de Sistemas? Por que é importante?
-R:Modelagem de sistemas nada mais é do que a atividade de construção de modelos
que expliquem/ilustrem a forma de funcionamento de um software.

b)O que é UML?
-R:Linguagem de Modelagem Unificada, é uma linguagem utilizada para modelar sistemas.

c)Quais os diagramas existentes na UML?
-R:Diagrama de Classes,Diagrama de Objetos,Diagrama de Componentes,
Diagrama de Instalação,Diagrama de Pacote,Diagrama de Estrutura Composta.

d)Qual a quantidade mínima de diagramas na modelagem de um sistema?
-R:Não existe um mínimo, o mínimo seria 1.

e)Quais os elementos básicos da modelagem O.O.?
-R:classe,atributos e tipo de atributo.

f)Cite dois tipos de diagramas de Estrutura, Comportamento e Interação da UML.
-R:Estrutura: Diagrama de Classes, Diagrama de Componentes, Diagrama de Implantação...
Comportamento: Diagrama de Estado, Diagrama de Atividade.
Interação da UML: Diagrama de Sequência, Diagrama de Colaboração.

2)Declare vetores em Java preparados para armazenar:

a)As letras vogais do alfabeto
-R:char[] vetorcarac = new char[26];

b)Número de dias em cada um dos meses do ano.
-R:int[] dias = new int[12];

c)Temperatura mínima e máxima de cada dia de uma semana.
-R:double[] temp = new double[14];

d)As tres notas de cada aluno de uma turma com 40 matriculados.
-R:double[] notas = new double[120];

3)Corrija as seguintes sentenças

a)A expressão s[20] acessa o vigésimo elemento do vetor s.
-R:Acessa o vigésimo primeiro, pq começa a contagem do 0.

b)Inicialização de vetor de inteiros com 5 posições: int n[5] = {10,20,30,40,50};
-R:int n[] = {10,20,30,40,50};

c)O comando int b[][] = {{1,2},{3,4,5}}; declara e inicializa um array com tres colunas em cada
uma das duas linhas.
-R:2 colunas na primeira e 3 colunas na segunda.

4)Faça um programa que leia e armazene as alturas de grupo de 2 pessoas, calcule a média e 
indique quantas pessoas estão acima dessa média.

5)Defina os seguintes conceitos:

a)Sobrecarga
-R:Métodos ou construtores com nomes iguais porém com parâmetros diferentes na mesma classe.

b)Polimorfismo
-R:Uma classe básica que pode assumir diversas características, veículo => carro, caminhão, helicoptero.

c)Herança
-R:Uma subclasse que herda os métodos e atributos de uma superclasse.

d)Classe abstrata
-R:Classe que não pode ser instanciada e possui seus atributos abstratos,
Apenas as classes que herdam dessa classe podem utilizar de seus métodos e atributos.

6)Implemente o seguinte conjunto de classes usando herança. Codifique um programa que leia os dados 
de 5 funcionários, armazene em vetor e exibe seus dados usando polimorfismo.
(Ver o pdf do diagrama de classes)
*/

import java.util.Scanner;

public class EstudoPOOP2{
   public static void main(String args[]){
      //Scanner scanner = new Scanner(System.in);
      //4)Faça um programa que leia e armazene as alturas de grupo de 2 pessoas, calcule a média e 
      //indique quantas pessoas estão acima dessa média.
      double alturas[] = {1.74,1.80,1.90,1.75};
      int cont=0,acimamedia=0;
      double media = 0,soma=0;
      for(int i=0;i<4;i++){
         soma+=alturas[i];
         cont++;
      }
      media = soma/cont;
      for(int i=0;i<4;i++){
         if(alturas[i]>media){
            acimamedia++;
         }
      }
      System.out.println(acimamedia);
      
      //Teste Exercício 3.c
      //int[][] matrix = {{1,2},{3,4,5}};
      //for(int i=0;i<3;i++){
      //   for(int j=0;j<3;j++){
      //      System.out.println(matrix[i][j]);
      //   }
      //}
      //ArrayIndexOutOfBoundsException
      
      Instrutor instrutor = new Instrutor("Jose","jose@gmail.com","Matemática");
      instrutor.exibeDados();
      Programador programador = new Programador("Pedro","pedro@hotmail.com","Java");
      programador.setSO("Windows");
      programador.exibeDados();
   }
}