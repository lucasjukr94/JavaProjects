/*
Exerc�cios POO
1)Responda as seguintes quest�es quanto a modelagem de sistemas:

a)O que � Modelagem de Sistemas? Por que � importante?
-R:Modelagem de sistemas nada mais � do que a atividade de constru��o de modelos
que expliquem/ilustrem a forma de funcionamento de um software.

b)O que � UML?
-R:Linguagem de Modelagem Unificada, � uma linguagem utilizada para modelar sistemas.

c)Quais os diagramas existentes na UML?
-R:Diagrama de Classes,Diagrama de Objetos,Diagrama de Componentes,
Diagrama de Instala��o,Diagrama de Pacote,Diagrama de Estrutura Composta.

d)Qual a quantidade m�nima de diagramas na modelagem de um sistema?
-R:N�o existe um m�nimo, o m�nimo seria 1.

e)Quais os elementos b�sicos da modelagem O.O.?
-R:classe,atributos e tipo de atributo.

f)Cite dois tipos de diagramas de Estrutura, Comportamento e Intera��o da UML.
-R:Estrutura: Diagrama de Classes, Diagrama de Componentes, Diagrama de Implanta��o...
Comportamento: Diagrama de Estado, Diagrama de Atividade.
Intera��o da UML: Diagrama de Sequ�ncia, Diagrama de Colabora��o.

2)Declare vetores em Java preparados para armazenar:

a)As letras vogais do alfabeto
-R:char[] vetorcarac = new char[26];

b)N�mero de dias em cada um dos meses do ano.
-R:int[] dias = new int[12];

c)Temperatura m�nima e m�xima de cada dia de uma semana.
-R:double[] temp = new double[14];

d)As tres notas de cada aluno de uma turma com 40 matriculados.
-R:double[] notas = new double[120];

3)Corrija as seguintes senten�as

a)A express�o s[20] acessa o vig�simo elemento do vetor s.
-R:Acessa o vig�simo primeiro, pq come�a a contagem do 0.

b)Inicializa��o de vetor de inteiros com 5 posi��es: int n[5] = {10,20,30,40,50};
-R:int n[] = {10,20,30,40,50};

c)O comando int b[][] = {{1,2},{3,4,5}}; declara e inicializa um array com tres colunas em cada
uma das duas linhas.
-R:2 colunas na primeira e 3 colunas na segunda.

4)Fa�a um programa que leia e armazene as alturas de grupo de 2 pessoas, calcule a m�dia e 
indique quantas pessoas est�o acima dessa m�dia.

5)Defina os seguintes conceitos:

a)Sobrecarga
-R:M�todos ou construtores com nomes iguais por�m com par�metros diferentes na mesma classe.

b)Polimorfismo
-R:Uma classe b�sica que pode assumir diversas caracter�sticas, ve�culo => carro, caminh�o, helicoptero.

c)Heran�a
-R:Uma subclasse que herda os m�todos e atributos de uma superclasse.

d)Classe abstrata
-R:Classe que n�o pode ser instanciada e possui seus atributos abstratos,
Apenas as classes que herdam dessa classe podem utilizar de seus m�todos e atributos.

6)Implemente o seguinte conjunto de classes usando heran�a. Codifique um programa que leia os dados 
de 5 funcion�rios, armazene em vetor e exibe seus dados usando polimorfismo.
(Ver o pdf do diagrama de classes)
*/

import java.util.Scanner;

public class EstudoPOOP2{
   public static void main(String args[]){
      //Scanner scanner = new Scanner(System.in);
      //4)Fa�a um programa que leia e armazene as alturas de grupo de 2 pessoas, calcule a m�dia e 
      //indique quantas pessoas est�o acima dessa m�dia.
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
      
      //Teste Exerc�cio 3.c
      //int[][] matrix = {{1,2},{3,4,5}};
      //for(int i=0;i<3;i++){
      //   for(int j=0;j<3;j++){
      //      System.out.println(matrix[i][j]);
      //   }
      //}
      //ArrayIndexOutOfBoundsException
      
      Instrutor instrutor = new Instrutor("Jose","jose@gmail.com","Matem�tica");
      instrutor.exibeDados();
      Programador programador = new Programador("Pedro","pedro@hotmail.com","Java");
      programador.setSO("Windows");
      programador.exibeDados();
   }
}