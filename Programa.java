class Programa {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        f1.nome = "Primeiro funcionário";
        f1.departamento = "RH";
        f1.salario = 100;
        
        Data data = new Data();
        data.dia = 28;
        data.mes = 12;
        data.ano = 2000;
        
        f1.dataEntrada = data;
        f1.rg = "123";
        
        Funcionario f2 = new Funcionario();
        f2.nome = "Segundo funcionário";
        f2.departamento = "Atendimento";
        f2.salario = 50;
        
        data = new Data();
        data.dia = 12;
        data.mes = 3;
        data.ano = 2005;
        
        f2.dataEntrada = data;
        f2.rg = "345";
        
        f1.recebeAumento(100);
        f2.recebeAumento(75);
        
        f1.mostra();
        f2.mostra();
    }
}