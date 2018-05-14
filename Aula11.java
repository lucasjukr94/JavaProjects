/*
Aula 11 - Polimorfismo - Prof. Grace

-: private
+: public
#: protected

várias classes derivadas de uma mesma superclasse podem invocar métodos que tem a mesma 
identificação(assinatura) mas comportamentos distintos

!INTERFACE!

ex:
Veículo tem método imprime()
Carro tem seu método imprime()
Caminhão tem seu método imprime()
->mas o comportamento é diferente.
->se a subclasse não possuir o método imprime() ele ainda vai possuir o método da superclasse,
então, o polimorfismo garante que ele vai possuir o método.

Redefinição de um método da superclasse, quando o método é reescrito na subclasse
apresentam comportamentos distintos, apesar de pertencerem a mesma hierarquia.

É como fazer uma sobrecarga de métodos, porém o método da subclasse sobescreve o método da superclasse.

Ligação Tardia: 
Dependendo do tempo de execução, o Java decide o uso de um método de uma subclasse ou superclasse.

28/05 - Aula de Exercícios
04/06 - Prova 2
*/

import java.util.Scanner;

public class Aula11{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      Veiculo[] Frota = new Veiculo[5];
   }
}