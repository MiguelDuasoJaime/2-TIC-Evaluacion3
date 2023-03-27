package EjPersona;

import java.util.Scanner;
public class PTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Introduce el nombre: ");
		String nom=sc.nextLine();
		System.out.print("\nIntroduce la edad: ");
		int e=sc.nextInt();
		System.out.print("Introduce el sexo: ");
		char s=sc.next().charAt(0);
		System.out.print("\nIntroduce la altura: ");
		double h=sc.nextDouble();
		System.out.print("\nIntroduce el peso: ");
		double p=sc.nextDouble();
		Persona p1=new Persona(nom,e,s,p,h);
		Persona p2=new Persona(nom,e,s);
		Persona p5=new Persona();
		p5.setAltura(1.2);
		p5.setPeso(85);
		p5.setEdad(43);
		p5.setNombre("Olaznog");
		p5.setSexo('M');
		if (p5.calcularIMC()==-1){
			System.out.print(p5.)
		}

}
