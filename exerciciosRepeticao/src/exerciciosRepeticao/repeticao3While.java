package exerciciosRepeticao;

import java.util.*;

public class repeticao3While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int idade,cont21=0,cont50=0;
		
		System.out.printf("Entre com a sua idade:");
        idade = leia.nextInt();
        
        while(idade!=-99)
        {
        	if(idade<21)
        		{
        		cont21++;
        		}
            if(idade>50) 
            	{
            	cont50++;
            	}
        System.out.printf("\n Entre com outra idade( -99 anos para encerrar):");
        idade = leia.nextInt();
        }
        System.out.printf("\nO total de pessoas com menos de 21 anos é: %d", cont21);
        System.out.printf("\nO total de pessoas com mais de 50 anos é: %d", cont50);
        System.out.print("\nEntre com a sua idade: ");
         idade = leia.nextInt();
        	}
	}
     	
