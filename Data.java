public class Data
{
   private int mes;
   private int dia;
   private int ano;
   
   //sobrecarga1
   public Data(int d, int m, int a){
      setData(d,m,a);
   }
   
   //sobrecarga2
   public Data(int m, int a){
      setData(1,m,a);
   }
   
   //sobrecarga3
   public Data(int a){
      setData(1,1,a);
   }
   
   public void setData(int d, int m, int a){
      if(m>0 && m<=12){
         mes = m;
      }else{
         mes = 1;
         System.out.println("Mes "+m+" invalido. Configurado mes = 1.");
      }
      ano = a;
      dia = checkDia(d);
   }
   
   private int checkDia(int diaTeste){
      int diaMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
      if(diaTeste> 0 && diaTeste<= diasMes[mes]){
         return diaTeste;
      }
      System.out.println("Dia "+diaTeste+" invalido. Configurado dia = i.");
      return 1;
   }
   
   public String toString(){
      return dia+"/"+mes+"/"+ano;
   }
}