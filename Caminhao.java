public class Caminhao extends Veiculo{
   private int Capacidade;
   private int NumEixos;
   
   public Caminhao(String modelo,String placa,int anoFabr,int capacidade,int numEixos,double valor){
      super(modelo,placa,anoFabr,valor);
      setCapacidade(capacidade);
      setNumEixos(numEixos);
   }
   
   public void imprime(){
      System.out.printf("\nVeiculo:%s\nPlaca:%7s",modelo,placa);
      System.out.printf("\nFabr:%4d\nNumero de Eixos:%2d",anoFabr,NumEixos);
      System.out.printf("\nCapacidade:%02d Pessoas\nR$%.2f\n",Capacidade,valor);
   }
   
   public int getCapacidade(){
      return Capacidade;
   }
   
   public void setCapacidade(int Capacidade){
      this.Capacidade = Capacidade;
   }
   
   public int getNumEixos(){
      return NumEixos;
   }
   
   public void setNumEixos(int NumEixos){
      this.NumEixos = NumEixos;
   }
}