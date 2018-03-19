//Aula 4 Objetos ,Classes ,Métodos e Instanciamento com Construtores
/*
   getter and setters
   Se o objeto estiver no mesmo diretório, não é necessário importar
*/

import java.util.Scanner;

public class Aula4{
   public static void main(String args[]){
      Circunferencia circ = new Circunferencia(0);
      Retangulo retang = new Retangulo(0,0);
      Scanner scanner = new Scanner(System.in);
      
      double base,alt,raio;
      
      System.out.print("Digite a base: ");
      base = scanner.nextDouble();
      
      System.out.print("Digite a altura: ");
      alt = scanner.nextDouble();
      
      System.out.print("Digite o raio da circunferencia: ");
      raio = scanner.nextDouble();
      
      retang.setBase(base);
      retang.setAltura(alt);
      circ.setRaio(raio);
      
      System.out.println("Base do retangulo: " + retang.getBase());
      System.out.println("Altura do retangulo: " + retang.getAltura());
      
      System.out.println("Perimetro da circunferencia: "+circ.perimetro());
      System.out.println("Diametro da circunferencia: "+circ.diametro());
      System.out.println("Area da circunferencia: "+circ.area());
   }
}