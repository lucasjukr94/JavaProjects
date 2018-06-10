public class Programador extends Funcionario{
   private String linguagem;
   private String sistOper;
   
   public Programador(String nome,String mail,String linguagem){
      this.nome = nome;
      setMail(mail);
      setLinguagem(linguagem);
   }
   
   public void setLinguagem(String ling){
      linguagem = ling;
   }
   
   public void setSO(String sistOper){
      this.sistOper = sistOper;
   }
   
   public void exibeDados(){
      System.out.println(nome);
      System.out.println(mail);
      System.out.println(linguagem);
      System.out.println(sistOper);
   }
}