package exerciciosRepeticao;

import java.util.*;

public class repeticao6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num, somamult3=0,contmult3=0;
	float mediamult3;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.printf("\nDigite um número inteiro:");
	num = leia.nextInt();
	
	do
	{
    if(num%3==0)
    {
    	somamult3 = (somamult3+num);
    	contmult3++;
    }
    System.out.printf("\nDigite um número inteiro:");
    num = leia.nextInt();
    
	}while(num!=0);
   
	mediamult3 = somamult3 / contmult3;
    System.out.printf("\nA media dos numeros multiplos de 3 é: %2.2f",mediamult3);
    }
}