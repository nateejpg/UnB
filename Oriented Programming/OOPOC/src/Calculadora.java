
// Refenciação

public class Calculadora {
	
	
	// Atributos
	
	int op1, op2;
	int resSoma, resSub, resMulti, resDivisão;
	
	
	// Métodos
	
	int soma() {
		
		resSoma = op1 + op2;
		return resSoma;
	}
	
	int subtração() {
		
		resSub = op1 - op2;
		return resSub;
	}
	
	int multiplicação() {
		
		resMulti = op1 * op2;
		
		return resMulti;
	}
	
	int divisão() {
		
		resDivisão = op1 / op2;
		
		return resDivisão;
	}
	
	//Objeto
	
	public Calculadora(int o1, int o2) {
		
		op1 = o1;
		op2 = o2;
		
	}

	public static void main(String[] args) {
		
		
		Calculadora[] c;
		
		c = new Calculadora[3];
		
		c[0] = new Calculadora(3, 4);
		c[1] = new Calculadora(7, 9);
		c[2] = new Calculadora(6, 3);
		
		for(int i = 0; i < c.length; i++) {
			
			System.out.println(c[i].multiplicação());
		}
		

	}

}
