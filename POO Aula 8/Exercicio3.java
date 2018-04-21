public class Exercicio3{
   private int dia;
   private int mes;
   private int ano;
   
   public Exercicio3(int d,int m,int a){
      dia = d;
      mes = m;
      ano = a;
   }
   
   public Exercicio3(int m,int a){
      dia = 1;
      mes = m;
      ano = a;
   }
   
   public Exercicio3(int a){
      dia = 1;
      mes = 1;
      ano = a;
   }
   
   public void setData(int d,int m,int a){
      dia = d;
      mes = m;
      ano = a;
   }
   
   public void bissexto(){
      if(ano%4==0 & ano%100!=0){
         System.out.println("Eh bissexto");
      }else{
         System.out.println("Nao eh bissexto");
      }
   }
}