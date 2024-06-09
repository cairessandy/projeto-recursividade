package aplication;

public class App {

	public static void main(String[] args) {
		System.out.println(fatorial(3));
		

	}
	
	public static int fatorial(int numero) {
		int fat = 1;
		if(numero == 0 || numero == 1) {
			return fat;
		}
		else {
			return numero * fatorial(numero -1);
		}
	
	}

}
