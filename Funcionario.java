class Funcionario {
    
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;

    public Funcionario() {
        
    }
    
    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    public Data getDataEntrada() {
        return this.dataEntrada;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
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
        System.out.print("Data de entrada no banco: ");
        this.dataEntrada.mostra();
        System.out.println("RG: " + this.rg);
        System.out.println("Ganho anual: " + this.calculaGanhoAnual()+"\n");
    }
}