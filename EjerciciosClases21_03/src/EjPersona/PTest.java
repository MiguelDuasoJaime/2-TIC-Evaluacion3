package EjPersona;

import java.util.Scanner;
public class PTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Introduce el nombre: ");
		String nom=sc.nextLine();
		System.out.print("Introduce la edad: ");
		int e=sc.nextInt();
		System.out.print("Introduce el sexo: ");
		char s=sc.next().charAt(0);
		System.out.print("Introduce la altura: ");
		double h=sc.nextDouble();
		System.out.print("Introduce el peso: ");
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
			System.out.print("'"+p5.getNombre()+"' pesa mu poco\n");
		}
		else if (p1.calcularIMC()==0){
			System.out.print("'"+p5.getNombre()+"' pesa bien\n");
		}
		else {
			System.out.print("'"+p5.getNombre()+"' pesa muy mucho\n");
		}
		if (p1.calcularIMC()==-1){
			System.out.print("'"+p1.getNombre()+"' pesa mu poco\n");
		}
		else if (p1.calcularIMC()==0){
			System.out.print("'"+p1.getNombre()+"' pesa bien\n");
		}
		else {
			System.out.print("'"+p1.getNombre()+"' pesa muy mucho\n");
		}
		if (p2.calcularIMC()==-1){
			System.out.print("'"+p2.getNombre()+"' pesa mu poco\n");
		}
		else if (p2.calcularIMC()==0){
			System.out.print("'"+p2.getNombre()+"' pesa bien\n");
		}
		else {
			System.out.print("'"+p2.getNombre()+"' pesa muy mucho\n");
		}
		
		if (p5.esMayordeEdad()==true) {
			System.out.print("'"+p5.getNombre()+"' es mayor de edad\n");
		}
		else {
			System.out.print("'"+p5.getNombre()+"' es mayor de edad\n");
		}
		if (p1.esMayordeEdad()==true) {
			System.out.print("'"+p1.getNombre()+"' es mayor de edad\n");
		}
		else {
			System.out.print("'"+p1.getNombre()+"' es mayor de edad\n");
		}
		if (p2.esMayordeEdad()==true) {
			System.out.print("'"+p2.getNombre()+"' es mayor de edad\n");
		}
		else {
			System.out.print("'"+p2.getNombre()+"' es mayor de edad\n");
		}
	}
}
