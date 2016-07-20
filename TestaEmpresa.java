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
    
    for(Funcionario teste: empresa.funcionarios) {     

      if (teste == null) {            
        System.out.println("Posição vazia.");        
      } else {            
        teste.mostra();        
      }
    }
  }
}