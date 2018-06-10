public class Instrutor extends Funcionario{
   private String disciplina;

   public Instrutor(String nome,String mail,String disciplina){
      this.nome = nome;
      setMail(mail);
      setDisciplina(disciplina);
   }
   
   public void setDisciplina(String disciplina){
      this.disciplina = disciplina;
   }
   
   public void exibeDados(){
      System.out.println(nome);
      System.out.println(mail);
      System.out.println(disciplina);
   }
}