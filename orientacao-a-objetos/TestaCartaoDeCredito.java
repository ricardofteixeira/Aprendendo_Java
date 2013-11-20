class TestaCartaoDeCredito {
  public static void main (String [] args) {
    CartaoDeCredito cdc1 = new CartaoDeCredito ();
    cdc1.numero = 111111;
    cdc1.validade = "01/01/2014";

    CartaoDeCredito cdc2 = new CartaoDeCredito ();
    cdc2.numero = 222222;
    cdc2.validade = "02/01/2014";

    System.out.println (cdc1.numero);
    System.out.println (cdc1.validade);

    System.out.println (cdc2.numero);
    System.out.println (cdc2.validade);
  }
}