class TestaEmpresa {

    public static void main(String[] args) {
       
       Empresa empresa = new Empresa(3);
       
       Funcionario f = new Funcionario();
       f.setNome("Primeiro");
       f.setDepartamento("RH");
       f.setSalario(100);
       f.setRg("123");
       f.setDataEntrada(new Data());
       f.getDataEntrada().preenche(28, 12, 2000);
       empresa.adiciona(f);
       
       f = new Funcionario();
       f.setNome("Segundo");
       f.setDepartamento("Atendimento");
       f.setSalario(90);
       f.setRg("123");
       f.setDataEntrada(new Data());
       f.getDataEntrada().preenche(28, 12, 2000);
       empresa.adiciona(f);

       empresa.mostraTodasAsInformacoes();
    }
}