class Empresa {
    
    String nome;
    String cnpj;
    Funcionario[] funcionarios;

    void adiciona(Funcionario funcionario) {

    	label: for (int i = 0; i < this.funcionarios.length; i++) {

    		if (this.funcionarios[i] == null) {

    			this.funcionarios[i] = funcionario;
                break label;
            }
        }
    }
}