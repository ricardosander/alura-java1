class Programa {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        f1.nome = "Primeiro funcionário";
        f1.departamento = "RH";
        f1.salario = 100;
        f1.dataEntrada = "28/12/2000";
        f1.rg = "123";
        
        Funcionario f2 = new Funcionario();
        f2.nome = "Segundo funcionário";
        f2.departamento = "Atendimento";
        f2.salario = 50;
        f2.dataEntrada = "12/03/2005";
        f2.rg = "345";
        
        f1.recebeAumento(100);
        f2.recebeAumento(75);
        
        System.out.println("Salário de " + f1.nome + ": " + f1.salario);
        System.out.println("Ganho anual de " + f1.nome+": " + f1.calculaGanhoAnual());
        
        System.out.println("Salário de " + f2.nome + ": " + f2.salario);
        System.out.println("Ganho anual de " + f2.nome+": " + f2.calculaGanhoAnual());
    }
}