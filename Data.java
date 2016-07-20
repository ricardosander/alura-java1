class Data {

    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {

		if (ano < 1) {
			ano = 1;
		}

		if (mes > 12) {
			mes = 12;
		}

		if (mes < 1) {
			mes = 1;
		}

		if  (dia < 1) {
			dia = 1;
		} 

		if (mes == 2 && dia > 28) {
			dia = 28;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
			dia = 30;
		} else if (dia > 31) {
			dia = 31;
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

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