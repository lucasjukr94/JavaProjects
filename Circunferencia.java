/*
Exercícios:
1-Criar a classe Circunferência que calcula, a área, o perímetro e o diâmetro
*/

//1
public class Circunferencia{
   private double raio;
   
   public Circunferencia(double raio){
      this.raio = raio;
   }
   
   public double getRaio(){
      return raio;
   }
   
   public void setRaio(double r){
      raio = r==0?0:r;
   }
   
   public double diametro(){
      return raio*2;
   }
   
   public double area(){
      return raio*raio*3.14;
   }
   
   public double perimetro(){
      return 2*3.14*raio;
   }
}