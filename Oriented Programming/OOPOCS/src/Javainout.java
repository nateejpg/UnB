import java.util.Scanner;

public class Javainout {
	
	public static void main(String[] args) {
		
		String nome, sobreNome;
		float peso, altura, imc;
		int anoNascimento;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o seu nome, e em seguida o seu sobrenome: ");
		nome = sc.next();
		sobreNome = sc.next();
				
		
		System.out.println("Informe o peso do cidadao: ");
		peso = sc.nextFloat();
		
		System.out.println("Informe a altura do cidadao: ");
		altura = sc.nextFloat();
		
		imc = peso / altura * altura;
		
		
		System.out.println("Hello " + nome + sobreNome + ", \n" + "o seu peso atual é " + peso + " e a sua altura é " + altura + 
				"," + "resultando em um IMC de: " + imc);
			
	}
}
