class Data {

    int dia;
    int mes;
    int ano;

    String getFormatada() {
    	return this.dia + "/" + this.mes + "/" + this.ano;
	}
    
    void mostra() {
        System.out.println(this.getFormatada());
    }

    void preenche(int dia, int mes, int ano) {

    	this.dia = dia;
    	this.mes = mes;
    	this.ano = ano;
    }

}