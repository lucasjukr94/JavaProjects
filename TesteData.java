//Lucas Ju San Jeon RA 16200530

public class TesteData{
   public static void main(String args[]){
      Data data = new Data(06,04,2018);
      System.out.println("Meu aniversario: "+data.toString());
      
      data.setData(29,02,1700);//Teste ano bissexto
      System.out.println("Que data e essa? "+data.toString());
      
      data.setData(29,02,2020);//Teste ano bissexto
      System.out.println("Que data e essa? "+data.toString());
   }
}