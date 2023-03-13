public class Sorteios {

  public static void main(String[] args) {
  
  //CRIANDO DOIS ARRAYS PARA GUARDAR AS MARCAS E OS TAMANHOS
 String[] bikes={"Shimano","Caloi","Oggi","Ox"};
 String[] tamanhos={"29","26","24","22","20"};
 
 
 //GERANDO UMA ORDEM ALEATORIA DE TAMANHOS E MARCAS.O LENGTH ESTÁ LEVANDO EM CONSIDERAÇÃO QUE NÃO SABEMOS A ORDENS DOS VALORES DOS ARRAYS
 String bike=bikes[(int) (Math.random()*bikes.length)];
 String tam=tamanhos[(int) (Math.random()*tamanhos.length)];
 
 
 
 System.out.println(bike+" tamanho "+tam);

  }

}
