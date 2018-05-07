//extends diz que Carro herda de Veículo, ou seja, Veículo é superclass e Carro subclasse
public class Carro extends Veiculo{
   private int numPortas;
   private int anoModelo;
   
   public Carro(String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor){
      super(modelo,placa,anoFabr,valor);//construtor da superclasse, é obrigatório.
      setPortas(numPortas);
      setAnoModelo(anoModelo);
   }
   
   public void setPortas(int numPortas){
      this.numPortas = 2;
      if(numPortas>2){
         this.numPortas = numPortas;
      }
   }
   
   public int getPortas(){
      return numPortas;
   }
   
   public void setAnoModelo(int anoModelo){
      this.anoModelo = anoModelo;
   }
   
   public int getAnoModelo(){
      return anoModelo;
   }
   
   public void imprime(){
      System.out.printf("\nVeiculo:%s\nPlaca:%7s\nFabr:%4d\nModelo:%4d\n%.2d Portas\nR$%.2f\n",modelo,placa,anoFabr,anoModelo,numPortas,valor);
   }
}