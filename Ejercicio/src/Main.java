import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int Num = 0;
	        try (Scanner OBJ = new Scanner(System.in)) {
				int Mayor = -123;
				int pos=0;
				for (int i = 0; i < 10; i++) 
				{
				    System.out.print("Introduzca la nota del estudiante "+(i+1)+":");
				    Num = OBJ.nextInt();  
				    if (Num >= Mayor)
				    {
				      Mayor = Num;
				      pos = i+1;
				    }
				}
				System.out.println("---------------");
				System.out.println("El numero mayor es: "+Mayor);
				System.out.println("En la posicion "+pos);
			}
	            
	              
	    }
	}

