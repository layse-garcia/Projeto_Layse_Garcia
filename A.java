import java.util.Scanner;

public class A{
	int a1;
	float a2;
	
	Scanner entrada = new Scanner(System.in);
	
	public void setA1(){
		a1 = entrada.nextInt();
	}
	
	public void setA2(){
		a2 = entrada.nextFloat();
	}
	
	public int getA1(){
		return a1;
	}
	
	public float getA2(){
		return a2;
	}
	
	public void MA1(){
		System.out.println("MA1");
	}
	
	public void MA2(){
		System.out.println("MA2");
	}
	
	public void MA3(){
		System.out.println("Alteracao a classe A partir do clone");
	}
	
}
