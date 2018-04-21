/*
Lista de Exercícios 1

1)Estruturada: não possui encapsulamento de dados, é linear
POO: encapsulamento de dados, divide-se os arquivos em classes.

2)V,V,V,V,V

3)Compilação: Reune o código fonte e 
transforma diretamente em linguagem de máquina,
ex: linguagem compilada C,C++

Interpretação: Tradução do código fonte para uma linguagem intermediária que 
em seguida transforma em linguagem de máquina(compila),
ex: linguagem interpretada Java,Python,C#

4)F(.java),
V,
V,
F(É composto por compilador e bibliotecas, 
não possui IDE padrão),
V,
F(.jar),
F(com o JVM é possível executar em qualquer SO),
V,
V

5)
JVM:Java Virtual Machine - Faz a tradução da linguagem JAVA para linguagem de máquina.
API:Application Programming Interface - É um conjunto de rotinas e padrões(bibliotecas).
JRE:Java Runtine Environment - É utilizada para executar aplicações JAVA.
JDK:Java Development Kit - Conjunto de utilitários JAVA, composto por compilador e bibliotecas.
IDE:Integrated Development Environment - Ambiente de desenvolvimento do programa.
J2SE:Java 2 Standard Edition - Contém todo o ambiente necessário para criação JAVA padrão.
J2EE:Java 2 Platform Enterprise Edition - Contém todo o ambiente necessário para criação JAVA empresarial.
J2ME:Java 2 Micro Edition - Contém todo o ambiente necessário para criação JAVA para dispositivos compactos.

*/
import java.util.Scanner;

public class Lista1{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      //6)-----------------------------------------------------------------------
      System.out.println("Digite o quantia de energia consumida(kWh):");
      double consumo = scanner.nextDouble();
      double taxa = 10;
      if(consumo>50 && consumo<=100){
         taxa += (consumo-50)*0.2;
      }
      if(consumo>100 && consumo<=200){
         taxa += 50*0.2+(consumo-100)*0.25;
      }
      if(consumo>200){
         taxa += 50*0.2+100*0.2+(consumo-200)*0.35;
      }
      System.out.printf("Consumo de %.2f kWh custa R$ %.2f \n",consumo,taxa);      
      //7)-----------------------------------------------------------------------
      System.out.println("Nota 1:");
      double n1 = scanner.nextDouble();
      System.out.println("Nota 2:");
      double n2 = scanner.nextDouble();
      double media = (n1+n2)/2.0;
      if(media<4){
         System.out.println("REPROVADO");
      }else if(media>=4 && media<7){
         System.out.println("EXAME");
      }else{
         System.out.println("APROVADO");
      }
      //8,9)---------------------------------------------------------------------
      System.out.println("Valor 1:");
      int val1 = scanner.nextInt();
      System.out.println("Valor 2:");
      int val2 = scanner.nextInt();
      System.out.println("Valor 3:");
      int val3 = scanner.nextInt();
      
      int maior,menor,medio;
      if(val1>=val2 && val1>=val3){
         maior=val1;
         if(val2>=val3){
            medio=val2;
            menor=val3;
         }else{
            medio=val3;
            menor=val2;
         }
      }else if(val2>val1 && val2>val3){
         maior=val2;
         if(val1>=val3){
            medio=val1;
            menor=val3;
         }else{
            medio=val3;
            menor=val1;
         }
      }else{
         maior=val3;
         if(val2>=val1){
            medio=val2;
            menor=val1;
         }else{
            medio=val1;
            menor=val2;
         }
      }
      System.out.println(menor+","+medio+","+maior);
      System.out.println("Maior valor: "+maior);
      //10)-----------------------------------------------------------------------
      System.out.println("Digite o dia mes e o ano:");
      int dia = scanner.nextInt();
      int mes = scanner.nextInt();
      int ano = scanner.nextInt();
      if((mes==4 || mes==6 || mes==9 || mes==11) && dia>30){
         System.out.println("Dia inconsistente");
      }else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && dia>31){
         System.out.println("Dia inconsistente");
      }else{
         System.out.println("Dia consistente");
      }
      if(mes>12){
         System.out.println("Mes inconsistente");
      }else{
         System.out.println("Mes consistente");
      }
      if(ano%4==0 && ano%100!=0){
         System.out.println("Ano bissexto");
      }
      //11)-----------------------------------------------------------------------
      System.out.println("Digite a altura e o sexo(1-Homem/2-Mulher):");
      double altura = scanner.nextDouble();
      int sexo = scanner.nextInt();
      double ideal=0;
      if(sexo == 1){
         //Homem
         ideal = ((72.7*altura)-58.0);
         System.out.println("Peso ideal: "+ideal);
      }else{
         //Mulher
         ideal = ((+62.1*altura)-44.7);
         System.out.println("Peso ideal: "+ideal);
      }
      //12)------------------------------------------------------------------------
      System.out.println("Digite a altura e o sexo(1-Homem/2-Mulher):");
      altura = scanner.nextDouble();
      sexo = scanner.nextInt();
      ideal=0;
      if(sexo == 1){
         //Homem
         ideal = ((72.7*altura)-58.0);
         System.out.println("Peso ideal: "+ideal);
      }else{
         //Mulher
         ideal = ((+62.1*altura)-44.7);
         System.out.println("Peso ideal: "+ideal);
      }
      
      while(altura!=0){
         System.out.println("Digite a altura e o sexo(1-Homem/2-Mulher):");
         altura = scanner.nextDouble();
         sexo = scanner.nextInt();
         if(altura != 0){
            ideal=0;
            if(sexo == 1){
               //Homem
               ideal = ((72.7*altura)-58.0);
               System.out.println("Peso ideal: "+ideal);
            }else{
               //Mulher
               ideal = ((+62.1*altura)-44.7);
               System.out.println("Peso ideal: "+ideal);
            }
         }
      }
      //13)-------------------------------------------------------------------------
      System.out.println("Digite o valor do capital investido e a taxa de juros mensais");
      double capital = scanner.nextDouble();
      double juros = scanner.nextDouble();
      for(int i=0;i<12;i++){
         System.out.println("Capital mes "+(i+1)+" valor "+capital);
         capital+=capital*juros;
      }
      //14)-------------------------------------------------------------------------
      System.out.println("Digite o valor do capital investido e a taxa de juros mensais");
      capital = scanner.nextDouble();
      juros = scanner.nextDouble();
      int i=0;
      double capitalCalculado = capital;
      while(capital*2>capitalCalculado){
         capitalCalculado+=capital*juros;
         i++;
      }
      int anos = i/12;
      int meses = i%12;
      System.out.println("O capital dobrara em "+anos+" anos e "+meses+" meses");
      //15)-------------------------------------------------------------------------
      System.out.println("Digite um valor positivo:");
      int n = scanner.nextInt();
      for(i=0;i<n;i++){
         System.out.println("Digite um valor de Celsius:");
         double celsius = scanner.nextDouble();
         double fahrenheit = 32.0+celsius*(5.0/9.0);
         System.out.println("F:"+fahrenheit);
      }
      //16)------------------------------------------------------------------------
      System.out.println("x1,y1,x2,y2:");
      double x1 = scanner.nextDouble();
      double y1 = scanner.nextDouble();
      double x2 = scanner.nextDouble();
      double y2 = scanner.nextDouble();
      
      double x = ((x2-x1)<0)?(x2-x1)*(-1):(x2-x1);
      double y = ((y2-y1)<0)?(y2-y1)*(-1):(y2-y1);
      //16.a)----------------------------------------------------------------------
      System.out.println("Base: "+x);
      //16.b)----------------------------------------------------------------------
      System.out.println("Altura: "+y);
      //16.c)----------------------------------------------------------------------
      System.out.println("Altura: "+(x*y));
      
      //16.d)----------------------------------------------------------------------
      System.out.println("x3,y3:");
      double x3 = scanner.nextDouble();
      double y3 = scanner.nextDouble();
      while(x3 != 0 && y3 != 0){
         double Xmaior = x1;
         double Xmenor = x2;
         if(x2>x1){
            Xmaior = x2;
            Xmenor = x1;
         }
         
         double Ymaior = y1;
         double Ymenor = y2;
         if(y2>y1){
            Ymaior = y2;
            Ymenor = y1;
         }
         
         if(x3>=Xmenor && x3<=Xmaior && y3>=Ymenor && y3<=Ymaior){
            System.out.println("Ponto dentro");
         }else{
            System.out.println("Ponto fora");
         }
         
         System.out.println("x3,y3:");
         x3 = scanner.nextDouble();
         y3 = scanner.nextDouble();
      }
   }
}