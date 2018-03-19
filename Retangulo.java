public class Retangulo{
   private double base,altura;
   
   public Retangulo(double base,double altura){//Construtor
      this.base = base;
      this.altura = altura;
   }
   
   public double getBase(){
      return base;
   }
   
   public void setBase(double b){
      if(b>0){
         base=b;
      }else{
         base=0;
      }
   }
   
   public double getAltura(){
      return altura;
   }
   
   public void setAltura(double a){
      if(a>0){
         altura=a;
      }else{
         altura=0;
      }
   }
}