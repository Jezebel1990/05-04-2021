package exerciciosRepeticao;

import java.util.*;

public class repeticao2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par=0,num,x;
		
		Scanner leia = new Scanner (System.in);
for(x=1;x<=10;x++)
{
	System.out.printf("Entre com um n�mero: ");
	num = leia.nextInt();
	
	if(num%2==0) {
par = par + 1;	
	}
}
System.out.printf("\nQuantidade de n�meros pares: %d ", par);
System.out.printf("\nQuantidade de n�meros impares: %d ",10-par);
	}
}
