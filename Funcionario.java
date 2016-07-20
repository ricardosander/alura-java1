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

	public void mostra() {

		System.out.println("Funcionário:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de entrada no banco: " + this.dataEntrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Ganho anual: " + this.calculaGanhoAnual());
        System.out.println("");

	}
}