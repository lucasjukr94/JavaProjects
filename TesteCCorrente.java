//Lucas Ju San Jeon RA 16200530
import java.util.Scanner;

public class TesteCCorrente{
   public static void main(String args[]){
      ContaCorrente cc1 = new ContaCorrente(12345,"Joao da Silva",0);
      cc1.verDados();
      
      ContaCorrente cc2 = new ContaCorrente(54321,"Maria dos Santos",500);
      cc2.verDados();
      
      Scanner entrada = new Scanner(System.in);
      
      System.out.printf("\nValor para deposito em c1: ");
      double vlr = entrada.nextDouble();
      cc1.deposito(vlr);
      cc1.verDados();
      
      System.out.printf("\nValor de saque em c2: ");
      cc2.saque(entrada.nextDouble());
      cc2.verDados();
   }
}