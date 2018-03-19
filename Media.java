import java.util.Scanner;

public class Media{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      double n1,n2,media;
      
      System.out.println("Digite as duas notas: ");
      n1 = scanner.nextDouble();
      n2 = scanner.nextDouble();
      media = (n1+n2)/2;
      
      if(media > 7){
         System.out.println("Aprovado com "+media);
      }else if(media >=4){
         System.out.println("Recuperacao com "+media);
      }else{
         System.out.println("Reprovado com "+media);
      }
   }
}