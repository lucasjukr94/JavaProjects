//Selenium
//Herança
//superclasse - representa um conjunto maior de objetos, ex: veículo que representa carros, caminhões, barcos, bicicletas...
//subclasse - carro que é um veículo, caminhões que é um veículo, ou seja, é a classe que herda de veículo.

//Herança múltipla - herda de múltiplas classes, o JAVA não permite herança multipla

public class Aula9{
   public static void main(String args[]){

      Carro c = new Carro("Vectra","ABC1678",2006,2007,3,31000);
      c.imprime();
      c.deprecia(10);
      
      System.out.println("Carro depreciado");
      c.imprime();
   }
}