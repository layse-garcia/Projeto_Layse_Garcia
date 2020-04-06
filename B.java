import java.util.Scanner;

public class B{
	int b1;
	float b2;
	
	Scanner entrada = new Scanner(System.in);
	
	public void setB1(){
		b1 = entrada.nextInt();
	}
	
	public void setB2(){
		b2 = entrada.nextFloat();
	}
	
	public int getB1(){
		return b1;
	}
	
	public float getB2(){
		return b2;
	}
	
	public void MB1(){
		System.out.println("MB1");
	}
	
	public void MB2(){
		System.out.println("MB2");
	}
	
}
