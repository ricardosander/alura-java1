class Programa {
    
    public static void main(String[] args) {

    	Funcionario f1 = new Funcionario();        
        f1.nome = "Ricardo";
        f1.salario = 100;

        Funcionario f2 = f1;    
        
        if (f1 == f2) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");        
        }
    }
}