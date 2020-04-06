import java.util.Scanner;

public class C{
	String c1;
	int c2;
	
	Scanner entrada = new Scanner(System.in);
	
	public void setB1(){
		c1 = entrada.nextLine();
	}
	
	public void setC2(){
		c2 = entrada.nextInt();
	}
	
	public String getC1(){
		return c1;
	}
	
	public int getC2(){
		return c2;
	}
	
	public void MC1(){
		System.out.println("MC1");
	}
	
	public void MC2(){
		System.out.println("MC2");
	}
	
}
