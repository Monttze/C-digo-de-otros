import java.util.Scanner;

public class codigo6 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//declaramos una variable de tipo Scanner
		int numero_recibido = scan.nextInt();
	  
	    int[] n = new int[20];

	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " ");
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
		int numero_recibido = scan.nextInt();
		//agregamos este variable para recibir un numero
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    
	    //int opcion = Integer.parseInt(System.console().readLine());
	    //La anterior linea la comentamos

	    int multiplo = (opcion == 1)? 5 : 7; //Operador ternario

	    for (int e : n) {  // no exite foreach como tal
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }
	       else {
	        System.out.print(e + " ");
	      }
	    }
	  
	}
}

