class Empresa {
    
    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;

 	public Empresa (int quantidadeDeFuncionarios) {
    	this.funcionarios = new Funcionario[quantidadeDeFuncionarios];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario getFuncionario(int posicao) {

    	if (posicao >= this.funcionarios.length) return null;
        return this.funcionarios[posicao];
    }

    public void adiciona(Funcionario funcionario) {

    	label: for (int i = 0; i < this.funcionarios.length; i++) {

    		if (this.funcionarios[i] == null) {

    			this.funcionarios[i] = funcionario;
                break label;
            }
        }
    }

    public void mostraEmpregados() {

    	for (int i = 0; i < this.funcionarios.length; i++) {

    		if (this.funcionarios[i] != null) {

    			System.out.println("Funcionário na posição " + i + ":");
    			System.out.println("R$ " + this.funcionarios[i].getSalario());
    		}
    	}
    }

    public void mostraTodasAsInformacoes() {

    	for (Funcionario f: this.funcionarios) {

    		if (f != null) {
    			f.mostra();
    		}
    	}
    }

    public boolean contem(Funcionario funcionario) {

    	for (Funcionario f: this.funcionarios) {
    		if (f == funcionario) return true; 
    	}
    	return false;
    }
}