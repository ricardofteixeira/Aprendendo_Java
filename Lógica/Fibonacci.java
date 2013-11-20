class Fibonacci {
	public static void main (String [] args) {
		int primeiro = 0;
		int segundo = 1;
		System.out.println (primeiro);
		System.out.println (segundo);
			for (int contador = 1; contador <= 30; contador ++) {
				int terceiro = primeiro + segundo;
				System.out.println (terceiro);
				primeiro = segundo;
				segundo = terceiro;
			}
	}
}