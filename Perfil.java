import java.util.Scanner;
import java.lang.Integer;

public class Perfil{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite uma data de aniversário: ");
      String data = scanner.nextLine();
      
      char[] Data = new char[10];
      
      Data = data.toCharArray();
      
      String ddmm="";
      String yyyy="";

      for(int i=0;i<10;i++){
         if(Data[i]!='/' && i<6){
            ddmm+=Data[i];
         }else if(i>=6){
            yyyy+=Data[i];
         }
      }
      
      int DDMM = Integer.parseInt(ddmm);
      int YYYY = Integer.parseInt(yyyy);
      
      int DDMMYYYY = DDMM + YYYY;
      
      String somaDMY = Integer.toString(DDMMYYYY);
      
      char[] somadmy = new char[4];
      somadmy = somaDMY.toCharArray();
      
      String XX = "";
      String YY = "";
      
      for(int i=0;i<4;i++){
         if(i<2){
            XX += somadmy[i];
         }else if(i>=2){
            YY += somadmy[i];
         }
      }
      
      int xx = Integer.parseInt(XX);
      int yy = Integer.parseInt(YY);
      
      int xxyy = xx+yy;
      
      int perfil = xxyy % 5;
      
      switch(perfil){
         case 0:
            System.out.println("Timido");
            break;
         case 1:
            System.out.println("Sonhador");
            break;
         case 2:
            System.out.println("Paquerador");
            break;
         case 3:
            System.out.println("Atraente");
            break;
         case 4:
            System.out.println("Irresistível");
            break;
      }
   }
}