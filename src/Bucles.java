import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		int numero1 = -1;
		int numero2 = -2;
		
		//Pedimos número al usuario hasta que introduzca el correcto que nosotros pedimos
		//Usamos un bucle "DO"
		
		System.out.println("+++++ Prueba con bucle 'Do' +++++");
		
		do {
			System.out.println("Introduzca un número para comprobar [0-10]: ");
			numero1 = teclado.nextInt();
			teclado.nextLine();
			if(numero1!=0)
			{
				System.out.println("Error: vuelve a intentarlo");
			}
		}while(numero1!=0);
		
		//Si el número introducido por el usuario es 0, el resultado es correcto.
		System.out.println("¡Correcto!\n");
		
		//Pedimos número al usuario hasta que introduzca el correcto que nosotros pedimos
		//Usamos un bucle "While"
		
		System.out.println("+++++ Prueba con bucle 'While' +++++");

		while(numero2!=0)
		{
			System.out.println("Introduzca un número para comprobar [0-10]: ");
			numero2 = teclado.nextInt();
			teclado.nextLine();
			if(numero2!=0)
			{
				System.out.println("Error: vuelve a intentarlo");
			}
		}
		//Si el número introducido por el usuario es 0, el resultado es correcto.
		System.out.println("¡Correcto!\n");
		
		System.out.println("Fin del programa");
	}

}
