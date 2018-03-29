public class ContaCorrente{
   private int NumeroConta;
   private String Titular;
   private double Saldo;
   
   public ContaCorrente(int NumeroConta,String Titular,double Saldo){
      setNumeroConta(NumeroConta);
      setTitular(Titular);
      setSaldo(Saldo);
   }
   
   public void verDados(){
      System.out.println("==========================================");
      System.out.printf("Conta  : %7d\n",NumeroConta);
      System.out.println("Titular: "+Titular);
      System.out.printf("Saldo  : R$ %.2f\n",Saldo);
      System.out.println("==========================================");
   }
   
   public void deposito(double valor){
      if(valor>=0){
         Saldo += valor;
      }else{
         System.out.println("\nValor de deposito invalido!");
      }
   }
   
   public void saque(double valor){
      if(valor>=0){
         if(Saldo<valor){
            System.out.println("\nSaldo insuficiente!");
         }else{
            Saldo -= valor;
         }
      }else{
         System.out.println("Valor de saque invalido");
      }
   }
   
   private void setNumeroConta(int NumeroConta){
      if(NumeroConta>=0){
         this.NumeroConta = NumeroConta;
      }else{
         this.NumeroConta = 0;
      }
   }
   
   private void setTitular(String Titular){
      this.Titular = Titular;
   }
   
   private void setSaldo(double Saldo){
      if(Saldo>=0){
         this.Saldo = Saldo;
      }else{
         this.Saldo = 0;
      }
   }
}