import java.util.Scanner;
public class EjercicioRecorrer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner programa= new Scanner(System.in);
		System.out.println("introduce numero");
		int numero=programa.nextInt();
		int par= 0;
		int impar= 0;
		
		for(int i =1; i<=numero; i++) {
			if(i % 2 ==0) {
				par= par + i;
			}else {
				impar=impar+i;
			}
		}
		System.out.println("suma par: "+ par);
		System.out.println("suma impar: "+impar);
			
	}

}
