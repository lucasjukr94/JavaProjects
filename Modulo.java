import java.util.Scanner;

public class Modulo{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite um valor: ");
      double valor = scanner.nextDouble();
      
      double modulo=valor;
      if(valor < 0){
        modulo = valor*(-1);
      }
      
      System.out.printf("%5.2f",modulo);
   }
}