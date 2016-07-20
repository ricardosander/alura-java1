class TestandoTiposPrimitivos {

	public static void main(String[] args) {

		// double teste  = 2 / 0;
		double teste2 = 2 / 0.0;

		System.out.println("2/0 = Erro de execução. Divisão por 0.");
		System.out.println("2/0.0 = " + teste2);

		System.out.println("Olá Mundo Java.\nEstou gostando muito.");

		byte    vByte    = 1;
		short   vShort   = 1;
		char    vChar    = '1';
		long    vLong    = 1;
		int     vInt     = 1;
		double  vDouble  = 1;
		float   vFloat   = 1;
		boolean vBoolean = true;

		System.out.println("Vaŕiável do tipo byte :" + vByte);
		System.out.println("Vaŕiável do tipo short :" + vShort);
		System.out.println("Vaŕiável do tipo char :" + vChar);
		System.out.println("Vaŕiável do tipo long :" + vLong);
		System.out.println("Vaŕiável do tipo int :" + vInt);
		System.out.println("Vaŕiável do tipo double :" + vDouble);
		System.out.println("Vaŕiável do tipo float :" + vFloat);
		System.out.println("Vaŕiável do tipo boolean :" + vBoolean);

		System.out.println("byte -> short -> char -> int -> long -> float -> double");

		forDeFora : for (int i = 0; i < 10; i++) {

			System.out.println("Este é o for de fora: " + i);
			forDeDentro: for (int j = 0; j < 10; j++) {

				System.out.println("Este é o for de dentro: " + j);
				break forDeFora;
			}
			System.out.println("Acabando for de fora.");
		}
	}
}