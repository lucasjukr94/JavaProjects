//Selenium
//Heran�a
//superclasse - representa um conjunto maior de objetos, ex: ve�culo que representa carros, caminh�es, barcos, bicicletas...
//subclasse - carro que � um ve�culo, caminh�es que � um ve�culo, ou seja, � a classe que herda de ve�culo.

//Heran�a m�ltipla - herda de m�ltiplas classes, o JAVA n�o permite heran�a multipla

public class Aula9{
   public static void main(String args[]){

      Carro c = new Carro("Vectra","ABC1678",2006,2007,3,31000);
      c.imprime();
      c.deprecia(10);
      
      System.out.println("Carro depreciado");
      c.imprime();
   }
}