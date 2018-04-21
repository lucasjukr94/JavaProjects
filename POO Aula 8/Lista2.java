import java.util.Scanner;

public class Lista2{
   public static void main(String args[]){
      Exercicio1 ex1 = new Exercicio1(10);
      Exercicio2 ex2 = new Exercicio2();
      Exercicio3 ex3 = new Exercicio3(15,07,1994);
      
      ex1.EhPar();
      ex1.EhPrimo();
      System.out.println("Fatorial: "+ex1.Fatorial());
      
      ex2.setSoma(10);
      ex2.totalize(30);
      ex2.informeTotal();
      ex2.informeContagem();
      ex2.fornecaMedia();
      
      ex3.bissexto();
   }
}