public class Exercicio2{
   private double soma;
   private int contagem;
   
   public void setSoma(double s){
      soma = s;
      contagem = 1;
   }
   
   public void informeTotal(){
      System.out.println(soma);
   }
   
   public void informeContagem(){
      System.out.println(contagem);
   }
   
   public void totalize(double valor){
      soma += valor;
      contagem += 1;
   }
   
   public void fornecaMedia(){
      double media = soma/contagem;
      System.out.println(media);
   }
}