class Funcionario {
    
    String nome;
    String departamento;
    double salario;
    Data dataEntrada;
    String rg;
    
    void recebeAumento(double aumento) {
        this.salario += aumento;
    }
    
    double calculaGanhoAnual() {
        return this.salario * 12;
    }
    
    void mostra() {

        System.out.println("Funcionário:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.print("Data de entrada no banco: ");
        this.dataEntrada.mostra();
        System.out.println("RG: " + this.rg);
        System.out.println("Ganho anual: " + this.calculaGanhoAnual()+"\n");
    }
}