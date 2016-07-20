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

    void mostraEmpregados() {

    	for (int i = 0; i < this.funcionarios.length; i++) {

    		if (this.funcionarios[i] != null) {

    			System.out.println("Funcionário na posição " + i + ":");
    			System.out.println("R$ " + this.funcionarios[i].salario);
    		}
    	}
    }
}