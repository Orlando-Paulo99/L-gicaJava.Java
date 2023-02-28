//Escreva um programa Java para obter um número do usuário e imprimir se é positivo ou negativo

import java.util.Scanner;

public class Exercicio4 {

  public static void main(String[] args) {
  
  Scanner tec=new Scanner(System.in);
System.out.println("um nimeor");
 int usuario=tec.nextInt();

if (usuario >=0){
  System.out.println("Positivo");
}else{
  System.out.println("Negativo");
}
  
  
  

  }

}

