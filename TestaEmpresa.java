class TestaEmpresa {

  public static void main(String[] args) {

    Empresa empresa = new Empresa();
    empresa.funcionarios = new Funcionario[3];
    
    Funcionario f = new Funcionario();
    f.nome = "Primeiro";
    f.departamento = "RH";
    f.salario = 100;
    f.rg = "123";
    f.dataEntrada = new Data();
    f.dataEntrada.preenche(28, 12, 2000);
    empresa.adiciona(f);
    
    f = new Funcionario();
    f.nome = "Segundo";
    f.departamento = "Atendimento";
    f.salario = 90;
    f.rg = "123";
    f.dataEntrada = new Data();
    f.dataEntrada.preenche(28, 12, 2000);
    empresa.adiciona(f);
    
    empresa.mostraTodasAsInformacoes();

    if (empresa.contem(f)) {
      System.out.println("Contém primeiro.");
    }

    if (empresa.contem(new Funcionario())) {
      System.out.println("Contém primeiro.");
    }
  }
}