package exerciciosRepeticao;

import java.util.*;

public class repeticao5DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,soma=0;

Scanner leia = new Scanner (System.in);
System.out.println("\nEntre com um número: ");
do {
	num = leia.nextInt();
	soma=soma+num;
} while(num !=0);
System.out.printf("A soma dos números digitatos é: %d",soma);
	}

}
