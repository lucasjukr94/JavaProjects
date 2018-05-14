/*
Aula 11 - Polimorfismo - Prof. Grace

-: private
+: public
#: protected

v�rias classes derivadas de uma mesma superclasse podem invocar m�todos que tem a mesma 
identifica��o(assinatura) mas comportamentos distintos

!INTERFACE!

ex:
Ve�culo tem m�todo imprime()
Carro tem seu m�todo imprime()
Caminh�o tem seu m�todo imprime()
->mas o comportamento � diferente.
->se a subclasse n�o possuir o m�todo imprime() ele ainda vai possuir o m�todo da superclasse,
ent�o, o polimorfismo garante que ele vai possuir o m�todo.

Redefini��o de um m�todo da superclasse, quando o m�todo � reescrito na subclasse
apresentam comportamentos distintos, apesar de pertencerem a mesma hierarquia.

� como fazer uma sobrecarga de m�todos, por�m o m�todo da subclasse sobescreve o m�todo da superclasse.

Liga��o Tardia: 
Dependendo do tempo de execu��o, o Java decide o uso de um m�todo de uma subclasse ou superclasse.

28/05 - Aula de Exerc�cios
04/06 - Prova 2
*/

import java.util.Scanner;

public class Aula11{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      Veiculo[] Frota = new Veiculo[5];
   }
}