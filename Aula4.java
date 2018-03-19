//Aula 4 Objetos ,Classes ,Métodos e Instanciamento com Construtores
/*
   getter and setters
   Se o objeto estiver no mesmo diretório, não é necessário importar
*/

import java.util.Scanner;

public class Aula4{
   public static void main(String args[]){
      Retangulo retang = new Retangulo(10,10);
      Scanner scanner = new Scanner(System.in);
      
      double base,alt;
      
      System.out.print("Digite a base: ");
      base = scanner.nextDouble();
      
      System.out.print("Digite a altura: ");
      alt = scanner.nextDouble();
      
      retang.setBase(base);
      retang.setAltura(alt);
      
      System.out.println("Base do retangulo: " + retang.getBase());
      System.out.println("Altura do retangulo: " + retang.getAltura());
   }
}