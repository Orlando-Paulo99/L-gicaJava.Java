package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class novo {

  public static void main(String[] args) {
  Scanner tec=new Scanner(System.in);
  ArrayList<String> contatos=new ArrayList<>(); 
   //ADIVIONANDO VALORES AO ARRAY 
 contatos.add("Orlando Paulo"); 
 contatos.add("orlando@gmail.com"); 
 contatos.add("9999-9999"); 
  
 
 System.out.println(contatos); 
 //O SIZE É PARA MOSTRAR O TAMANHO DO ARRAYLIST 
 System.out.println("tamanho do Array "+contatos.size()); 
  
 //O METODO GET É PARA MOSTRAR QUAL O INDICE QUE QUERO VER QUE ESTÁ DENTRO DO ARRAYLIST 
 System.out.println(contatos.get(0)); 
  
 System.out.println("---------------------"); 
  
 //METODO FOR PARA IMPRIMIR EM ORDEM OS VALORES QUE ESTÃO DENTRO DO ARRAYLIST  
  System.out.println("add");
  //Recebendo do usuario e adcionando na lista
  contatos.add(tec.next());
  
 for(int i=0;i<contatos.size();i++){ 
   System.out.println(contatos.get(i)); 
 }
  }

  
 
  }


