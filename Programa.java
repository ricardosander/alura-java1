class Programa {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 40; i++) {
            
            long fatorial = 1;
            for (int j = i; j >= 1; j--) {
                fatorial *= j;
            }
            System.out.println(i + "! = " + fatorial);
        }
    }
}