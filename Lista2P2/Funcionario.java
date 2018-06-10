public class Funcionario{
   protected String nome;
   protected String mail;
   protected int idade;
   
   public Funcionario(){
   
   }
   
   public Funcionario(String nome,String mail){
      this.nome = nome;
      setMail(mail);
   }
   
   public Funcionario(String nome,String mail,int idade){
      this.nome = nome;
      setMail(mail);
      setIdade(idade);
   }
   
   public void setMail(String mail){
      this.mail = mail;
   }
   
   public void setIdade(int idade){
      this.idade = idade;
   }
   
   public void ExibeDados(){
      System.out.println(nome);
      System.out.println(mail);
      System.out.println(idade);
   }
}