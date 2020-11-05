import java.util.Scanner;		//IMPORT SCANNER
public class MinimoComunMultiplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.print("Introduzca el primer valor: ");		//SOLICITA VALOR
		int N1 = teclado.nextInt();			//ALMACENA VALOR EN N1
		System.out.print("Introduzca otro valor: ");		//SOLICITA VALOR
		int N2 = teclado.nextInt();		//ALMACENA VALOR EN N2
		int menor=0;		//INICIALIZA MENOR
		int mayor=0;		//INICIALIZA MAYOR
		int mcm=0;			//INICIALIZA MCM
		
		if (N1>N2) {		//SI N1 ES MAYOR QUE N2
			mayor = N1;		//MAYOR
			menor = N2;		//MENOR
		} else { 			//SI NO
			mayor = N2;		//MAYOR
			menor = N1;		//MENOR
		} 
		mcm=mayor;		//MCM PUEDE SER EL MAYOR
		while (mcm%N1!=0 || mcm%N2!=0) {		//MIENTRAS EL MCM NO SEA MÚLTIPLO DE AMBOS
			mcm++;		//SUMAR UNO A MCM
		}
				//OUTPUT
		System.out.print(mcm);
	}

}
