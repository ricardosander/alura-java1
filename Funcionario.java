class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	} 

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
}