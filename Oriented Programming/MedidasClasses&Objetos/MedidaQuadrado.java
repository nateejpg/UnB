
 class MedidaQuadrado {
	
	float area,
		perimetro;
	
	Medida lado;
	
	
	public MedidaQuadrado(float i) {
		
		lado = new Medida(i);
	}
	
	float calcularArea() {
		
		area = lado.valor * lado.valor;
		
		return area;
	}
	
	
	float calcularPerimetro() {
		
		perimetro = 4 * lado.valor;
		
		return perimetro;
	}
	

}
