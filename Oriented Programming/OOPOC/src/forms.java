import javax.swing.JOptionPane;

public class forms {

	public static void main(String[] args) {
		
		double area;
		double perimetro;
		String strAltura;
		
		// Select the fomart;
		
		String strFormat = JOptionPane.showInputDialog("Escolha o formato da sua figura: Circulo, Retangulo, Quadrado e Trapézio: ");
		
		
		switch(strFormat) {
		
			
		case "Circulo":
			
			int raio;
			
			String strRaioCirculo = JOptionPane.showInputDialog("Informe o raio do circulo: ");
			raio = Integer.parseInt(strRaioCirculo);
			perimetro = 2 * Math.PI * raio;
			area = Math.PI * Math.pow(raio, 2);
			

			JOptionPane.showMessageDialog(null, "O perimetro do circulo: " + perimetro + "\n" + "A área do circulo é: " + area);
				
				break;
				
		case "Retangulo":
			
			int altura;
			int base;
			
			String strBase = JOptionPane.showInputDialog("Informe a base: ");
			base = Integer.parseInt(strBase);
			
			strAltura = JOptionPane.showInputDialog("Informe a altura: ");
			altura = Integer.parseInt(strAltura);
			
			area = base * altura;
			perimetro = 2 * (base * altura);
			
			JOptionPane.showMessageDialog(null, "o perimetro do retangulo é igual: " + perimetro + "\n" + "A área do retangulo é: " + area);
			
				break;
				
		case "Quadrado": 
			
			int ladoSize;

			
			String strLadosQuadrado = JOptionPane.showInputDialog("Informe o tamanho do lado do quadrado: ");
			ladoSize = Integer.parseInt(strLadosQuadrado);
			
			perimetro = 4 * ladoSize;
			area = ladoSize * ladoSize;
			
			JOptionPane.showMessageDialog(null, "O perimetro do quadrado é: " + perimetro + "\n" + "A área do quadrado é: " + area);
						
				break;
				
		case "Trapézio":
			
			strAltura = JOptionPane.showInputDialog("Diga a altura do seu trapézio:");
			altura = Integer.parseInt(strAltura);
			String strBaseMenor = JOptionPane.showInputDialog("Diga a base Menor do seu trapézio: ");
			int baseMenor = Integer.parseInt(strBaseMenor);
			String strBaseMaior = JOptionPane.showInputDialog("Informe a base maior do seu trapézio: ");
			int baseMaior = Integer.parseInt(strBaseMaior);
			String strLado1 = JOptionPane.showInputDialog("Diga o tamanho do seu lado 1:");
			int lado1 = Integer.parseInt(strLado1);
			String strLado2 = JOptionPane.showInputDialog("Diga o tamanho do seu lado 2:");
			int lado2 = Integer.parseInt(strLado2);
		
			area = (baseMaior + baseMenor) * altura / 2.0;
			
			perimetro = baseMaior + baseMenor + lado1 + lado2;
			
			
			   JOptionPane.showMessageDialog(null, "O perimetro do trapézio é: " + perimetro + "\n" + "A área do trapézio é: " + area);
		
			   break;
		}
		
	}

}
