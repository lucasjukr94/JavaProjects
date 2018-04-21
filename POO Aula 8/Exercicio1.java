public class Exercicio1{
   private int n;
   
   public Exercicio1(int n){
      setN(n);
   }
   
   private void setN(int n){
      this.n = n;
   }
   
   public void EhPar(){
      if(n%2==0){
         System.out.println("Eh par");
      }else{
         System.out.println("Eh impar");
      }
   }
   
   public void EhPrimo(){
      int v=0;
      for(int i=2;i<n/3;i++){
         if(n%i==0){
            v=1;
         }
      }
      if(v==1){
         System.out.println("Nao eh primo");
      }else{
         System.out.println("Eh primo");
      }
   }
   
   public int Fatorial(){
      int fat = 1;
      for(int i=1;i<=n;i++){
         fat *= i;
      }
      return fat;
   }
}