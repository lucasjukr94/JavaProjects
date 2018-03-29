//Lucas Ju San Jeon RA 16200530

public class Data{
   private int mes;
   private int dia;
   private int ano;
   
   public Data(int d, int m, int a){
      setData(d,m,a);
   }
   
   public Data(int m, int a){
      setData(1,m,a);
   }
   
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
      int diaMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
      if(bissexto()){//Se for ano bissexto muda fevereiro para 29 dias
         diaMes[2] = 29;
      }
      if(diaTeste>0 && diaTeste<=diaMes[mes]){
         return diaTeste;
      }
      System.out.println("Dia "+diaTeste+" invalido. Configurado dia = 1.");
      return 1;
   }
   
   private boolean bissexto(){
      if(ano%4==0){//Múltiplo de 4
         if(ano%100==0 && ano%400!=0){//Múltiplo de 100 e não múltiplo de 400
            return false;
         }
         return true;
      }
      return false;
   }
   
   public String toString(){
      return dia+"/"+mes+"/"+ano;
   }
   
   public int getDia(){
      return dia;
   }
   
   public int getMes(){
      return mes;
   }
   
   public int getAno(){
      return ano;
   }
}
