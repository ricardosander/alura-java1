class Programa {

    public static void main(String[] args) {
        
        int numero = 13;
        System.out.print(13);
        while (numero != 1) {
            
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = 3 * numero + 1;
            }
            System.out.print(" > " + numero);
        }
    }
}