import java.util.Scanner;

public class ProjetoPOO1{
public static void main(String[] args) {

	Scanner leitor = new Scanner(System.in);
	
	// ENTRADA DO USUÁRIO
	System.out.println("Digite os números");
	String str = leitor.nextLine();
	
	//TRANSFORMAÇÃO EM ARRAY
	String[] arrayString = str.split(" ");
	int[] array  = new int[arrayString.length];
	
	//VARIÁVEIS AUXILIARES
	int nLinhas = 0;
	int tamanhoArray=0;
	int index = 0;
	int somaMenor = 0;
	
	//TRANSFORMAÇÃO DO arrayString EM ARRAY DE INT
	for (int i=0; i<arrayString.length; i++){
		array[i] = Integer.parseInt(arrayString[i]);
	}
	
	//CALCULANDO Nº DE LINHAS
	while (tamanhoArray < array.length) {
		nLinhas++;
		for(int i = 0; i<nLinhas; i++) {
			tamanhoArray++;
		}
	}
	
	//CRIAÇÃO DE ARRAY DE MENOR/LINHA
	int[]menores = new int[nLinhas];
	
	//IMPRIMINDO QUANTIDADE
	System.out.println("Quantidade: "+array.length);
	
	//IMPRIMINDO STRING
	System.out.println("String: "+ str);
	
	//IMPRIMINDO ARRAY
	System.out.print("Lista: ");
	
	for(int i = 0; i<array.length; i++){
		if(i==0) {
			System.out.print("["+array[i]+", ");
		}else if(i == (array.length-1)) {
			System.out.print(array[i]+"]");
		}else
		System.out.print(array[i]+", ");
	}
	System.out.println();
	System.out.println("----------------------------");
	System.out.println("*PIRÂMIDE*");
	//IMPRESSÃO DA PIRÂMIDE, AQUISIÇÃO DE MENORES E SUA SOMA 
	for(int i = 1; i<=nLinhas; i++) {
		int menor = Integer.MAX_VALUE; 
		for(int j = 0; j<i; j++) {
			
			if (menor > array[index]) {
				menor = array[index];
			}	
			
			System.out.print(array[index]+" ");
			index++;
			if (index == array.length) {
				break;
			}
		}
		menores[i-1] = menor;
		System.out.println();
	}
	System.out.println();
	System.out.println("----------------------------");
	
	//IMPRESSÃO DOS MENORES:
	System.out.print("Os menores valores de cada linha foram: ");
	for(int i = 0; i<menores.length; i++){
		if(i==0) {
			System.out.print("["+menores[i]+", ");
		}else if(i == (menores.length-1)) {
			System.out.print(menores[i]+"]");
		}else
		System.out.print(menores[i]+", ");
		somaMenor += menores[i];
	}
	System.out.println();
	//IMPRESSÃO DA SOMA:
	System.out.println("A soma dos menores valores é: "+somaMenor);

	
	leitor.close();	
	}
	
}