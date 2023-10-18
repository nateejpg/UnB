import javax.swing.JOptionPane;

public class PrincipalMedida {

	public static void main(String[] args) {
		
		
		MedidaQuadrado q;
		
		q = new MedidaQuadrado(3);
		
		 JOptionPane.showMessageDialog(null, "Área do quadrado = " + q.calcularArea());

	}

}
