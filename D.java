import java.util.Scanner;

public class D{
	Double d1;
	int d2;
	
	Scanner entrada = new Scanner(System.in);
	
	public void setD1(){
		d1 = entrada.nextDouble();
	}
	
	public void setD2(){
		d2 = entrada.nextInt();
	}
	
	public double getD1(){
		return d1;
	}
	
	public int getD2(){
		return d2;
	}
	
	public void MD1(){
		System.out.println("MD1: Criacao da classe D. Voce esta no metodo MD1");
	}
	
	public void MD2(){
		System.out.println("MD2: Criacao da classe D. Voce esta no metodo MD2");
	}
	
	public void MD3(){
		System.out.println("MD3: Criacao da classe D. Voce esta no metodo MD3");
	}
	
}
